package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta[] contas = new Conta[5];
		
		ContaCorrente contacorrente01 = new ContaCorrente(222, 333);
		ContaPoupanca contapoupanca01 = new ContaPoupanca(222, 334);
		contas[0] = contacorrente01;
		contas[1] = contapoupanca01;
		
		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i]);
			
		}
		//System.out.println(contas);
		

	}

}
