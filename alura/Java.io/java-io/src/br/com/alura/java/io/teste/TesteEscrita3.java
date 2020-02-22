package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo

//		OutputStream fos = new FileOutputStream("lorem-gravacao.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		FileWriter fw = new FileWriter("lorem-fileWriter.txt");
//		BufferedWriter bw = new BufferedWriter(fw);

		// Imprime para um fluxo binário:
		PrintStream printStream = new PrintStream(new File("lorem-printStream.txt"));

		printStream.println("Leva algum tempo para você " + "realmente assimilar que você é bom o suficiente.");
		printStream.println();
		printStream.println("Fim");

		printStream.close();

	}

}
