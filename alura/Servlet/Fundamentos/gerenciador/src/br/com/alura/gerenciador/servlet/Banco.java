package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa01 = new Empresa();
		empresa01.setNome("Caelum");
		Empresa empresa02 = new Empresa();
		empresa02.setNome("Alura");
		lista.add(empresa01);
		lista.add(empresa02);
	}

	public void adiciona(Empresa empresa) {

		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
//	@Override
//	public String toString() {
//		return "Nome: " + Banco.lista;
//	}
}
