package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.Aula;

public class TesteListaAula {

	public static void main(String[] args) {
		// Instanciando os objetos aula?? e alimentando o construtor:
		Aula aula01 = new Aula("Revistando as ArralyLists", 21);
		Aula aula02 = new Aula("lista de objetos", 15);
		Aula aula03 = new Aula("Relacionamento de listas e objetos", 15);
		
		
		// Instanciando Arraylist aulas e adicionando objetos aulas??:
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		aulas.add(aula01);
		aulas.add(aula02);
		aulas.add(aula03);
		
		// Imprimindo ArrayList aulas:
		System.out.println(aulas);
		
		// Ordenando alfabeticamente através do metódo 
		// compareTo reescrito em Aula.java:
		Collections.sort(aulas);
		
		// Imprimindo o ArrayList reordenado: 
		System.out.println(aulas);
		
		// Comparator.comparing comparando o tempo de video de cada aula:
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
	}
	
	
}
