package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

//		OutputStream fos = new FileOutputStream("lorem-gravacao.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		
		FileWriter fw = new FileWriter("lorem-fileWriter.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Leva algum tempo para você "
				+ "realmente assimilar que você é bom o suficiente.");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("Eu acredito em você e na sua capacidade porque conheço "
				+ "o seu esforço e a sua motivação. Não desista!");
		
		bw.close();

	}

}
