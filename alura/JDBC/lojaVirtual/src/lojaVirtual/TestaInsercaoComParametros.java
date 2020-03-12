package lojaVirtual;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaInsercaoComParametros {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory(); // Criando objeto de conexão
		Connection con = cf.recuperaConexao(); // conectando ao banco de dados
		
	}

}
