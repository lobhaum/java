package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	
	private Integer id;
	private String nome;
	private Date dataAbertura;
	
	// getters:
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Date getDataAbertura() {
		return dataAbertura;
	}
	// setters:
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
