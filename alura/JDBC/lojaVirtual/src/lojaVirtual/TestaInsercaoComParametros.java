package lojaVirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametros {

	public static void main(String[] args) throws SQLException {
		// instanciando os objetos string para query
		String nome = null;
		String descricao = null;

		ConnectionFactory cf = new ConnectionFactory(); // Criando objeto de conexão
		Connection con = cf.recuperaConexao(); // conectando ao banco de dados
		// Usando Prepared Statement:
		// Statement stm = con.createStatement(); // cria um estado para enviar
		// requisições ao banco de dados

		nome = "processador";
		descricao = "AMD Ryzen 7 2700X, Cooler Wraith Prism, Cache 20MB";

//		String sql = "INSERT INTO produto (nome, descricao) VALUES" 
//				+ "('" + nome + "','" + descricao + "')"; 

		// Usando PreparedStatement:
		String sql = "INSERT INTO produto (nome, descricao) VALUES (?, ?);";
		System.out.println(sql);
		PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		pstmt.setString(1, nome);
		pstmt.setString(2, descricao);
		pstmt.execute();
		pstmt.close();
	}

}
