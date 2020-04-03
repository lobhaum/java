package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class AlteraSaldoContaLeonardo {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alura");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Conta contaLeonardo = entityManager.find(Conta.class, 1L);
		
		System.out.println("Conta do Leonardo -> " + contaLeonardo.getTitular());
		entityManager.getTransaction().begin();
		contaLeonardo.setSaldo(1950.15);
		entityManager.getTransaction().commit();

	}

}
