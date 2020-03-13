package lojaVirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();
		
		
		String sql = "SELECT * FROM produto";
		
		PreparedStatement pstmt = connection.prepareStatement(sql);
		pstmt.execute();
		// boolean resultado = pstmt.execute("SELECT * FROM produto");
		ResultSet rst = pstmt.getResultSet();
		while(rst.next()) {
			Integer id = rst.getInt("id");
			String nome = rst.getString("nome");
			String descricao = rst.getString("descricao");
			System.out.println("Id:" + id + " Nome: " + nome + " Descricao: " + descricao);
		}
		pstmt.close();
	}
}
