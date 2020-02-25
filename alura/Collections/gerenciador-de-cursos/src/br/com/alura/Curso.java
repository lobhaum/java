package br.com.alura;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>(); // list ao inves de ArrayList encapsula melhor
	private Set<Aluno> alunos = new HashSet<>();

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
		return Collections.unmodifiableList(aulas);
	}
	public Set<Aluno> getAlunos(){
		return alunos;
	}

	// Criação do metodo adiciona aula:
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// Criação do metodo de contagem do tempo de aulas:
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	// Sobrescrição do metodo toString da classe mãe:
	@Override
	public String toString() {
		return "[Curso: " + nome + ", total de tempo: " + this.getTempoTotal() + "]";
	}
	
	// Criação do metodo de matricula de aluno:
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
}
