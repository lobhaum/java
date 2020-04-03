package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alura");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		// Transient -> Não tem vinculo com o objeto
		Conta conta = new Conta();
		conta.setTitular("Almiro");
		conta.setAgencia(10929);
		conta.setNumero(4042020);
		conta.setSaldo(2011.11);
		
		entityManager.getTransaction().begin();
		// transformando Transient em Managed
		entityManager.persist(conta);
		// ou
		entityManager.remove(conta);
		// ou
		entityManager.merge(conta);
		entityManager.getTransaction().commit();
		
	}

}
