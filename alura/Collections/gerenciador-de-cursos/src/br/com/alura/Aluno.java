package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	// Criando o construtor:
	public Aluno(String nome, int numeroMatricula) {

		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	
	//Criação de métodos:
	//Criação dos getters:
	public String getNome() {
		return nome;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	// Sobreescrição do metodo toSTring:
	@Override
	public String toString() {
		return getNome();
	}

}
