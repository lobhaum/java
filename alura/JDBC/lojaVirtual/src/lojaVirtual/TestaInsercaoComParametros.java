package lojaVirtual;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametros {

	public static void main(String[] args) throws SQLException {
		/*
		 * // instanciando os objetos string para query // String nome = null; // String
		 * descricao = null;
		 * // Usando Prepared Statement: // Statement stm = con.createStatement(); //
		 * cria um estado para enviar // requisições ao banco de dados
		 * 
		 * // nome = "processador"; // descricao =
		 * "AMD Ryzen 7 2700X, Cooler Wraith Prism, Cache 20MB";
		 * 
		 * // String sql = "INSERT INTO produto (nome, descricao) VALUES" // + "('" +
		 * nome + "','" + descricao + "')";
		 * 
		 * // Usando PreparedStatement:
		 */		
		ConnectionFactory cf = new ConnectionFactory(); // Criando objeto de conexão
		Connection con = cf.recuperaConexao(); // conectando ao banco de dados
		con.setAutoCommit(false); // gera o controle da transação do inicio ao fim
		String sql = "INSERT INTO produto (nome, descricao) VALUES (?, ?);";
		PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		adicionarProduto("SmartTV", "45 polegadas", pstmt);
		adicionarProduto("Radio", "Radio Vintage Torcedor de Futebol", pstmt);
		
		pstmt.close();
		con.close();
	}

	private static void adicionarProduto(String nome, String descricao, PreparedStatement pstmt) throws SQLException {
		pstmt.setString(1, nome);
		pstmt.setString(2, descricao);
		pstmt.execute();
		//pstmt.close();
	}

}
