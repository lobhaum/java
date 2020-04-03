package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaContaSaldo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alura");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Conta conta = new Conta();
		conta.setTitular("Madagascar");
		conta.setNumero(1236);
		conta.setAgencia(4321);
		conta.setSaldo(500.0);

		entityManager.getTransaction().begin();

		entityManager.persist(conta);
		conta.setSaldo(349871.11);

		entityManager.getTransaction().commit();
	}

}
