package lojaVirtual;

import java.sql.Connection;

public class TestaInsercaoComParametros {

	public static void main(String[] args) {

		ConnectionFactory factory = new ConnectionFactory(); // Criando objeto de conexão
		Connection con = factory.recuperaConexao(); // conectando ao banco de dados
		
	}

}
