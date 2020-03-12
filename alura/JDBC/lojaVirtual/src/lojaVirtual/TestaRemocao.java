package lojaVirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory factory = new ConnectionFactory(); // instanciando a connectionfactory
		Connection connection = factory.recuperaConexao(); // fazendo a conexao com o banco de dados
		
		Statement stm = connection.createStatement(); // instancia a instrução sql no objeto stm
		stm.execute("DELETE FROM produto WHERE id > 2  AND id < 5;");
		
		Integer linhasModificadas = stm.getUpdateCount();
		
		System.out.println(linhasModificadas);
		
		
		
				
	}
	
}
