package lojaVirtual;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {

		CriaConexao criaConexao = new CriaConexao();

		Connection connection = criaConexao.recuperaConexao();

		connection.close();

	}

}
