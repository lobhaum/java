package br.com.alura.jpa.testes;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;
import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.TipoMovimentacao;

public class TestaRelacionamento {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("alura");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Conta conta = new Conta();
		conta.setAgencia(2020);
		conta.setNumero(82821);
		conta.setTitular("Pinguim de Madagascar");
		conta.setSaldo(5999312.2);
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setData(LocalDateTime.now());
		movimentacao.setDescricao("Churrascaria Forofano");
		movimentacao.setValor(new BigDecimal(256.21));
		movimentacao.setTipoMovimentacao(TipoMovimentacao.ENTRADA);
		movimentacao.setConta(conta);
		
		entityManager.getTransaction().begin();
		entityManager.persist(conta);
		entityManager.persist(movimentacao);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}

}
