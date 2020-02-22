package br.com.bytebank.banco.test.util;

import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListVector {

	public static void main(String[] args) {

		List<Conta> lista = new Vector<Conta>(); //thread safe

		Conta cc1 = new ContaCorrente(222, 2345);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(222, 2346);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(222, 2347);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(222, 2348);
		lista.add(cc4);

		System.out.println(lista.size());

		Conta referencia = lista.get(0);
		System.out.println(referencia);

		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

//		for (int i = 0; i < lista.size(); i++) {
//			Object oRef = lista.get(i);
//			System.out.println(oRef);
//		}
		/**
		 * Imprime lista de contas
		 */
		for (Object object : lista) {
			System.out.println(object);
		}

	}

}
