package quest4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Quest3 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		//peça ao usuário que digite um argumento de pesquisa
	
		String url = "jdbc:ucanaccess://C:\\Users\\Juarez Coutinho\\Documents\\Oficina.mdb";
		
		System.out.println("Digite o estilo: (Sedan, Cupe, Off road e Monovolume)");
		Scanner c = new Scanner(System.in);
		int x= c.nextInt();
		
		try {
			conn = DriverManager.getConnection(url); // abre conexão			
			stmt = conn.createStatement(); // usando stmt para alteração
			
			rs = stmt.executeQuery("SELECT * FROM Carro WHERE CodigoPessoa = " + x );	
			
			while (rs.next()) {
				String nomeCarro = rs.getString("NomeCarro");
			  	long ano = rs.getLong("Ano");
				
				System.out.println("" + ano + ", " + nomeCarro);
			} 
			
			conn.close();
		} catch (SQLException e) {
			System.out.println("Erro no acesso ao BD: " + e.getMessage());
			System.out.println("\n\nCausado por: " + e.getCause() + "\n\n");
			e.printStackTrace();
		}
	}
}
