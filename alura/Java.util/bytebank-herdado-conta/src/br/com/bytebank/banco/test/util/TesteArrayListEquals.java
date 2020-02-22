package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(222, 2345);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(222, 2346);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(222, 2346);
		//lista.add(cc3);
		
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);

		for (Object object : lista) {
			System.out.println(object);
		}

	}

}
