package lojaVirtual;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recuperaConexao();
		
		Statement stm = connection.createStatement();
		// metodo execute retorna true quando é lista
		// metodo execute insert retorna false
		//boolean resultado = 
//		stm.execute("INSERT INTO produto (nome, descricao) VALUES ('ssd', 'SSD Kingston A400, 240GB'),"
//				+ "('notebook','Acer Aspire 5 i5-8265U 8GB, 1TB, SSD 128GB'),"
//				+ "('videogame','Microsoft Xbox One S 1TB'),"
//				+ "('mainboard','Gigabyte Z390 M Gaming LGA 1151 DDR4');"
//				, Statement.RETURN_GENERATED_KEYS);
		stm.execute("INSERT INTO produto (nome, descricao) VALUES ('headset', 'Headset Gamer Razer Electra V2 7.1 Virtual - USB'),"
				+ "('teclado','Teclado Mecânico Gamer Razer Blackwindow Tournament V2 Chroma');"
				,Statement.RETURN_GENERATED_KEYS);
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			Integer id = rst.getInt(1);
			
		}
		stm.close();
		
		
	}

}
