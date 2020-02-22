package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Scanner;

public class TesteLeituraCSV {

	public static void main(String[] args) throws Exception {

		File csv = new File("contas.csv");
		Scanner scanner = new Scanner(csv);
				
		boolean temLinha = scanner.hasNextLine();
		
		while(temLinha) {
			String linha = scanner.nextLine();
			System.out.println(linha);
		}
		scanner.close();
		
	}

}
