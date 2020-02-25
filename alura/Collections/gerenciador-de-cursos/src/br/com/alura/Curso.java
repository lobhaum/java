package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>(); // list ao inves de ArrayList encapsula melhor

	// Cria��o do constructor:
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	// Cria��o dos getters:
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		return aulas; 
	}
}
