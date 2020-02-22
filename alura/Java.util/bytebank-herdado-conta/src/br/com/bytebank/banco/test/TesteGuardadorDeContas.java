package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta contaCorrente01 = new ContaCorrente( 333, 2345);
		Conta contaCorrente02 = new ContaCorrente( 333, 2346);
		guardador.adiciona(contaCorrente01);
		guardador.adiciona(contaCorrente02);
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref);
	}

}
