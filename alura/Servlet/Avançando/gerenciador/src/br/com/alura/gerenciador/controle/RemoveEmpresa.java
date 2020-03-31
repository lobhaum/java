package br.com.alura.gerenciador.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramId = request.getParameter("id");
		System.out.println(paramId);
		Integer id = Integer.valueOf(paramId);

		System.out.println(id);
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		response.sendRedirect("entrada?acao=listaEmpresas");
    } 
}
