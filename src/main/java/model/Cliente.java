package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false, unique = true)
	private String email;

	private String telefone;

	@Column(nullable = false)
	private String cep;

	@Column(nullable = false)
	private String endereco;

	@Column(nullable = false)
	private String bairro;

	@Column(nullable = false)
	private String cidade;

	@Column(nullable = false)
	private String estado;

	public Cliente(String nome, String email, String telefone, String cep, String endereco, String bairro,
			String cidade, String estado) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cep = cep;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Cliente() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
