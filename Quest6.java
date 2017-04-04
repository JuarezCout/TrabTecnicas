package quest4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Quest6 {
	
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		//peça ao usuário que digite um argumento de pesquisa
	
		String url = "jdbc:ucanaccess://C:\\Users\\Juarez Coutinho\\Documents\\Oficina.mdb";
		
		//PEGAR CHAVE DO CARRO A SER ALTERADO
		System.out.println("Digite a chave do Carro");
		Scanner c = new Scanner(System.in);
		int x = c.nextInt();
		
		try {
			conn = DriverManager.getConnection(url); // abre conexão	
			String nomeCarro;
			String estiloT;
		  	long anoT;
			
			stmt = conn.createStatement(); // usando stmt para alteração
			
			stmt.executeUpdate("UPDATE Carro SET NOMECARRO = 'Fusion', ESTILO = 'Sedan', ANO = '2016'  WHERE CodigoCarro = " + x );	
			
			stmt.close(); 
			
			// reusando statement para consulta
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Carro");
			System.out.println("\n\n ----------- Tabela Nova ------------ \n");
			while (rs.next()) {
				nomeCarro = rs.getString("NomeCarro");
				estiloT = rs.getString("Estilo");
			  	anoT = rs.getLong("Ano");
				
				System.out.println("" + nomeCarro + ", " + estiloT + ", " + anoT);
			} 
			
			conn.close();
		} catch (SQLException e) {
			System.out.println("Erro no acesso ao BD: " + e.getMessage());
			System.out.println("\n\nCausado por: " + e.getCause() + "\n\n");
			e.printStackTrace();
		}
	}
}
