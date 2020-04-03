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
		conta.setTitular("Marcia");
		conta.setNumero(1238);
		conta.setAgencia(4321);
		conta.setSaldo(500.0);

		entityManager.getTransaction().begin();

		entityManager.persist(conta);
		

		entityManager.getTransaction().commit();
		entityManager.close();
		System.out.println("ID da Conta da " + conta.getTitular() + " -> " + conta.getId());
		conta.setSaldo(3871.12);
	}

}
