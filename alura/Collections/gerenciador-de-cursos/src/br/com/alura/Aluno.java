package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	// Criando o construtor:
	public Aluno(String nome, int numeroMatricula) {

		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	
	//Cria��o de m�todos:
	//Cria��o dos getters:
	public String getNome() {
		return nome;
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	// Sobreescri��o do metodo toSTring:
	@Override
	public String toString() {
		return getNome();
	}

}
