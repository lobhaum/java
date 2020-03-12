package lojaVirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametros {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory cf = new ConnectionFactory(); // Criando objeto de conex�o
		Connection con = cf.recuperaConexao(); // conectando ao banco de dados
		Statement stm = con.createStatement(); // cria um estado para enviar requisi��es ao banco de dados
		stm.execute("", Statement.RETURN_GENERATED_KEYS);		
	}

}
