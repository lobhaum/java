package lojaVirtual;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametros {

	public static void main(String[] args) throws SQLException {
		// instanciando os objetos string para query
		String nome = null;
		String descricao = null;

		ConnectionFactory cf = new ConnectionFactory(); // Criando objeto de conexão
		Connection con = cf.recuperaConexao(); // conectando ao banco de dados
		Statement stm = con.createStatement(); // cria um estado para enviar requisições ao banco de dados
		nome = "antivirus";
		descricao = "Kaspersky Security Cloud";
		
//		String sql = "INSERT INTO produto (nome, descricao) VALUES" 
//				+ "('" + nome + "','" + descricao + "')"; 
		
		// Usando PreparedStatement:
		String sql = "INSERT INTO produto (nome, descricao) VALUES"
				+ "(?,?);";
		stm.execute(sql,Statement.RETURN_GENERATED_KEYS);
		stm.close();
	}

}
