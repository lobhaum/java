package lojaVirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory(); // instanciando a connectionfactory
		Connection connection = factory.recuperaConexao(); // fazendo a conexao com o banco de dados
		
		Statement stm = connection.createStatement(); // instancia a instrução sql no objeto stm
		stm.execute("DELETE FROM produto WHERE id > 12  AND id < 15;");
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println(linhasModificadas);
		
		/**
		 * Nesta aula, aprendemos que:

Para simplificar e encapsular a criação da conexão, devemos usar uma classe ConnectionFactory
A classe ConnectionFactory segue o padrão de criação Factory Method
O Factory Method encapsula a criação de um objeto
Para executar um comando SQL, podemos usar a interface java.sql.Statement
O método execute envia o comando para o banco de dados
Dependendo do comando SQL, podemos recuperar a chave primária ou os registros selecionados
		 */
		
				
	}
	
}
