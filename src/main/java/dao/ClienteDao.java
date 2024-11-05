package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import model.Cliente;
import util.JPAUtil;

public class ClienteDao {
	
	public void salvarCliente(Cliente cliente) {
		EntityManager em = JPAUtil.getEm();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.persist(cliente);
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}

	};

	public void removerCliente(Long id) {
		EntityManager em = JPAUtil.getEm();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			Cliente managedCliente = em.find(Cliente.class, id);
			if (managedCliente != null) {
				em.remove(managedCliente);
			}
			et.commit();
		} finally {
			em.close();
		}

	};

	public List<Cliente> buscarCliente() {
		EntityManager em = JPAUtil.getEm();
		List<Cliente> clientes = null;

		try {
			TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c", Cliente.class);
			query.setMaxResults(5);
			clientes = query.getResultList();
			return clientes;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}
		return clientes;

	};

	public void editarCliente(Cliente cliente) {
		EntityManager em = JPAUtil.getEm();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.merge(cliente);
			et.commit();
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
			e.printStackTrace();
		} finally {
			em.close();
		}
	};

	public Cliente buscarPorId(Long id) {
		Cliente clienteDoiD = null;
		EntityManager em = JPAUtil.getEm();

		try {
			clienteDoiD = em.find(Cliente.class, id);
			return clienteDoiD;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.close();
		}

		return clienteDoiD;
	}
	
	public boolean checarEmail(String email) {
		EntityManager em = JPAUtil.getEm();
		try {
			Long count = em.createQuery("SELECT COUNT(c) FROM Cliente c WHERE c.email = :email", Long.class)
					.setParameter("email", email).getSingleResult();
			return count > 0;
		} finally {
			em.close();
		}
	}
}
