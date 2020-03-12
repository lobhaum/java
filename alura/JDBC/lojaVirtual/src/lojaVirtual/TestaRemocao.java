package lojaVirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory(); // instanciando a connectionfactory
		Connection connection = factory.recuperaConexao(); // fazendo a conexao com o banco de dados
		
		Statement stm = connection.createStatement(); // instancia a instru��o sql no objeto stm
		stm.execute("DELETE FROM produto WHERE id > 12  AND id < 15;");
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println(linhasModificadas);
		
		/**
		 * Nesta aula, aprendemos que:

Para simplificar e encapsular a cria��o da conex�o, devemos usar uma classe ConnectionFactory
A classe ConnectionFactory segue o padr�o de cria��o Factory Method
O Factory Method encapsula a cria��o de um objeto
Para executar um comando SQL, podemos usar a interface java.sql.Statement
O m�todo execute envia o comando para o banco de dados
Dependendo do comando SQL, podemos recuperar a chave prim�ria ou os registros selecionados
		 */
		
				
	}
	
}
