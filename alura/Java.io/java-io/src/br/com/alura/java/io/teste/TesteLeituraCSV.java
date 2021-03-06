package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {

	public static void main(String[] args) throws Exception {

		File csv = new File("contas.csv");
		Scanner scanner = new Scanner(csv);
				
		boolean temLinha = scanner.hasNextLine();
		
		while(temLinha) {
			String linha = scanner.nextLine();
			//System.out.println(linha);
			
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String cliente = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			String formatada = String.format(new Locale("pt", "BR"), "Banco do Brasil 001 Agencia:%04d %s:%06d Fav.:%20s R$ %7.2f ",
											agencia, tipoConta, numero, cliente, saldo);
			System.out.println(formatada);
			//			System.out.println("Agencia: " + agencia + " " 
//					+ tipoConta + ": " +  numero + " " +
//					cliente + " R$ " + saldo );
			
			linhaScanner.close();
			
		}
		scanner.close();
		
	}

}
