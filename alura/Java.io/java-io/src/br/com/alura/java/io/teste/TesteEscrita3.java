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
		
		bw.write("Leva algum tempo para voc� "
				+ "realmente assimilar que voc� � bom o suficiente.");
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write(System.lineSeparator());
		bw.write("Eu acredito em voc� e na sua capacidade porque conhe�o "
				+ "o seu esfor�o e a sua motiva��o. N�o desista!");
		
		bw.close();

	}

}
