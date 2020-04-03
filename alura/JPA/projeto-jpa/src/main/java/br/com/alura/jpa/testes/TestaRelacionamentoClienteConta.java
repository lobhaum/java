package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Conta;

public class TestaRelacionamentoClienteConta {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alura");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Conta conta = new Conta();
		conta.setId(1L);

		Cliente cliente = new Cliente();
		cliente.setNome("Formiga");
		cliente.setEndereco("Marvel Street, 2019");
		cliente.setProfissao("Comediante");
		cliente.setConta(conta);

		entityManager.getTransaction().begin();
		//entityManager.persist(conta);
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
