package br.com.alura.testes;

import java.util.List;

import br.com.alura.Aula;
import br.com.alura.Curso;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", 
				"Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
	}

}
