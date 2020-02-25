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
	public Set<Aluno> getAlunos(){
		return alunos;
	}

	// Cria��o do metodo adiciona aula:
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	// Cria��o do metodo de contagem do tempo de aulas:
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	// Sobrescri��o do metodo toString da classe m�e:
	@Override
	public String toString() {
		return "[Curso: " + nome + ", total de tempo: " + this.getTempoTotal() + "]";
	}
	
	// Cria��o do metodo de matricula de aluno:
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}
}
