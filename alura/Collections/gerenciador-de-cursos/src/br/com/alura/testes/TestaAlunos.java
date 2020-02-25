package br.com.alura.testes;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		// Toda coleção possui o método contains
		// verifica se o valor está contido na coleção
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		System.out.println("Paulo Silveira é aluno? " + pauloEstaMatriculado);
	}

}
