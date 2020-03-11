package lojaVirtual;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		CriaConexao criaConexao = new CriaConexao();
		
		Connection connection = criaConexao.recuperaConexao();
		
		Statement stm = connection.createStatement();
		boolean resultado = stm.execute("SELECT * FROM produto");
		ResultSet rst = stm.getResultSet();
		while(rst.next()) {
			Integer id = rst.getInt("id");
			String nome = rst.getString("nome");
			String descricao = rst.getString("descricao");
			System.out.println("Id:" + id + " Nome: " + nome + " Descricao: " + descricao);
		}
	}
}
