package br.com.lobhvssystems.recursosJava.tests;

import java.util.Scanner;

public class InputTeste {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("Obrigado " + nome + " por realizar o cadastro.");

	}

}
