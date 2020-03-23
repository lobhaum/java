package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa01 = new Empresa();
		empresa01.setId(chaveSequencial++); // passando chave sequencial para nova empresa
		empresa01.setNome("Caelum");
		Empresa empresa02 = new Empresa();
		empresa02.setId(chaveSequencial++);
		empresa02.setNome("Alura");
		lista.add(empresa01);
		lista.add(empresa02);
	}

	public void adiciona(Empresa empresa) {

		empresa.setId(Banco.chaveSequencial++); // passando chave sequencial para quando adiciona nova empresa
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
//	@Override
//	public String toString() {
//		return "Nome: " + Banco.lista;
//	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}

//		for (Empresa empresa : lista) {
//			if(empresa.getId() == id) {
//				lista.remove(empresa);
//				//System.out.println("empresa " + empresa + " removida");
//			}
//		}
	}

	public Empresa buscaEmpresaId(Integer id) {
		for (Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
