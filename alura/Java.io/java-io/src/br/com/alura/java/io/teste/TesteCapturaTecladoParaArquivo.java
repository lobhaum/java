package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCapturaTecladoParaArquivo {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com arquivo:
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		// Fluxo de saida com arquivo:
		OutputStream fos = new FileOutputStream("lorem-captura-teclado-arquivo.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		// Lê a linha atual:
		String linha = br.readLine();

		// Grava a linha atual no buffer de gravação e na sequencia
		// atribui a linha o proximo buffer:
		while (linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine(); //grava uma linha em branco
			linha = br.readLine();
		}

		// Fecha o arquivo para leitura e gravação:
		br.close();
		bw.close();

	}

}
