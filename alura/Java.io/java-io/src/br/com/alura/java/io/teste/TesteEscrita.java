package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

		OutputStream fos = new FileOutputStream("lorem-gravacao.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Leva algum tempo para você "
				+ "realmente assimilar que você é bom o suficiente.");
		bw.newLine();
		bw.newLine();
		bw.write("Eu acredito em você e na sua capacidade porque conheço "
				+ "o seu esforço e a sua motivação. Não desista!");
		
		bw.close();

	}

}
