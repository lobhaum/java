package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>(); // list ao inves de ArrayList encapsula melhor

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
		return Collections.unmodifiableList(aulas); 
	}
	
	// Cria��o do metodo adiciona aula:
	public void adiciona(Aula aula){
		this.aulas.add(aula);
	}
	
	// Cria��o do metodo de contagem do tempo de aulas:
	public int getTempoTotal() {
		int tempoTotal = 0;
		for ( Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
}
