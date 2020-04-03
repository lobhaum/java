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
		conta.setTitular("Reinaldo");
		conta.setNumero(1237);
		conta.setAgencia(4321);
		conta.setSaldo(500.0);

		entityManager.getTransaction().begin();

		entityManager.persist(conta);
		

		entityManager.getTransaction().commit();
		entityManager.close();
		conta.setSaldo(3871.12);
	}

}
