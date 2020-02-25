package br.com.alura;

import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>(); // list ao inves de ArrayList encapsula melhor

	// Criação do constructor:
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	// Criação dos getters:
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
