package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.controle.EditaEmpresa;
import br.com.alura.gerenciador.controle.ListaEmpresas;
import br.com.alura.gerenciador.controle.MostraEmpresa;
import br.com.alura.gerenciador.controle.NovaEmpresa;
import br.com.alura.gerenciador.controle.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String parametroParaAcao = request.getParameter("controle");
		if (parametroParaAcao.equals("listaEmpresas")) {

			ListaEmpresas controle = new ListaEmpresas();
			controle.executa(request, response);

		} else if (parametroParaAcao.equals("editaEmpresa")) {
			
			EditaEmpresa controle = new EditaEmpresa();
			controle.executa(request, response);

		} else if(parametroParaAcao.equals("mostraEmpresa")){
			
			MostraEmpresa controle = new MostraEmpresa();
			controle.executa(request,response);
			
		}else if (parametroParaAcao.equals("excluiEmpresa")) {
			
			
			RemoveEmpresa controle = new RemoveEmpresa();
			controle.executa(request, response);
		}else if (parametroParaAcao.equals("novaEmpresa")) {
	        NovaEmpresa acao = new NovaEmpresa();
	        acao.executa(request, response);
	} 
	}

}
