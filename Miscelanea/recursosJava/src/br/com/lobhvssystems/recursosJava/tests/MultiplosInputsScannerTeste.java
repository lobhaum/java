package br.com.lobhvssystems.recursosJava.tests;

import java.util.Scanner;

public class MultiplosInputsScannerTeste {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		System.out.print("Digite o primeiro valor: ");
		Double num01 = input.nextDouble();
		System.out.print("Digite o segundo valor: ");
		Double num02 = input.nextDouble();
		System.out.println("Obrigado, " + nome);
		System.out.println("A somatoria dos " + num01 + " e " + num02 + " é: " + (num01 + num02));

	}

}
