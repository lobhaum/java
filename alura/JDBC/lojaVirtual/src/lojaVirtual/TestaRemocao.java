package lojaVirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory(); // instanciando a connectionfactory
		Connection connection = factory.recuperaConexao(); // fazendo a conexao com o banco de dados
		
		String sql = "DELETE FROM produto WHERE id = 18;";
		PreparedStatement pstmt = connection.prepareStatement(sql); // instancia a instrução sql no objeto stm
		pstmt.execute();
		
		Integer linhasModificadas = pstmt.getUpdateCount();
		
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
