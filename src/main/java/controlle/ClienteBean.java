package controlle;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;

import org.json.JSONObject;

import dao.ClienteDao;
import model.Cliente;

@ManagedBean(name = "clienteBean")
//@SessionScoped
@ViewScoped
public class ClienteBean {
	private Cliente cliente = new Cliente();
	private ClienteDao clienteDao = new ClienteDao();
	private List<Cliente> clientesBuscados = new ArrayList<>();
	private List<Cliente> clientesFiltrados = new ArrayList<>();
	private boolean emailValido;
	private String termo;
	private boolean condicao = false;

	public void salvar() {
		if(!clienteDao.checarEmail(cliente.getEmail())) {
			clienteDao.salvarCliente(cliente);
			emailValido = true;
			this.cliente = new Cliente();
		} else {
			emailValido = false;
		}
	}

	public void listarClientes() {
		if (clientesBuscados.isEmpty()) {
			clientesBuscados = clienteDao.buscarCliente();
		}

		if (termo == null || termo.isEmpty()) {
			clientesFiltrados = new ArrayList<>(clientesBuscados);
		} else {
			clientesFiltrados = new ArrayList<>();
			for (Cliente cliente : clientesBuscados) {
				if (cliente.getNome().toLowerCase().contains(termo.toLowerCase())
						|| cliente.getEmail().toLowerCase().contains(termo.toLowerCase())) {
					clientesFiltrados.add(cliente);
				}
			}
		}
	}

	public void excluirCliente(Long id) {
		clienteDao.removerCliente(id);
		listarClientes();
	}

	public void abrirEdicao(Cliente c) {
		condicao = true;
		cliente = c;
	}

	public String editarCliente() {
		this.condicao = false;
		clienteDao.editarCliente(cliente);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente salvo com sucesso!"));
		this.cliente = new Cliente();
		return "Sucesso";
		
	}

	public String cancelarEdicao() {
		this.condicao = false;
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Edição cancelada."));
		return "Edição cancelada";
	}

	public Cliente buscarId(Long id) {
		return clienteDao.buscarPorId(id);
	}

	// GET E SETTERS

	public boolean getCondicao() {
		return condicao;
	}

	public void setcondicao(boolean condicao) {
		this.condicao = condicao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setEmailValido(boolean emailValido) {
		this.emailValido = emailValido;
	}

	public boolean getEmailValido() {
		return emailValido;
	}

	public List<Cliente> getClientesBuscados() {
		if (clientesBuscados == null) {
			clienteDao.buscarCliente();
		}
		return clientesBuscados;
	}

	public void setClientesBuscados(List<Cliente> clientesBuscados) {
		this.clientesBuscados = clientesBuscados;
	}

	public List<Cliente> getClientesFiltrados() {
		if (clientesFiltrados == null) {
			listarClientes();
		}
		return clientesFiltrados;
	}

	public void setClientesFiltrados(List<Cliente> clientesFiltrados) {
		this.clientesFiltrados = clientesFiltrados;
	}

	public String getTermo() {
		return termo;
	}

	public void setTermo(String termoPesquisa) {
		this.termo = termoPesquisa;
		listarClientes();
	}
	
	//Requicao ViaCep
	public void viaCep(AjaxBehaviorEvent event) {
		String cep = cliente.getCep();
		if (cep != null && !cep.isEmpty()) {
			try {
				String url = "https://viacep.com.br/ws/" + cep + "/json/";
				HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
				con.setRequestMethod("GET");

				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuilder content = new StringBuilder();
				while ((inputLine = in.readLine()) != null) {
					content.append(inputLine);
				}
				in.close();
				con.disconnect();

				JSONObject json = new JSONObject(content.toString());
				if (!json.has("erro")) {
					cliente.setEndereco(json.getString("logradouro"));
					cliente.setBairro(json.getString("bairro"));
					cliente.setCidade(json.getString("localidade"));
					cliente.setEstado(json.getString("uf"));
				} else {
					System.out.println("CEP não encontrado.");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
