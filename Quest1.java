package quest4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Quest1 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		//peça ao usuário que digite um argumento de pesquisa
	
		String url = "jdbc:ucanaccess://C:\\Users\\Juarez Coutinho\\Documents\\Oficina.mdb";
		
		System.out.println("Digite a chave primaria");
		Scanner c = new Scanner(System.in);
		int x = c.nextInt();
		
		try {
			conn = DriverManager.getConnection(url); // abre conexão			
			stmt = conn.createStatement(); // usando stmt para alteração
		//	stmt.executeUpdate("SELECT FROM Pessoa WHERE CodigoPessoa = " + x);
			
			rs = stmt.executeQuery("SELECT * FROM Pessoa WHERE CodigoPessoa = " + x );
			
			if(rs.next()){
				//mostre os valores lidos do banco de dados para os campos da tabela Pessoa
				String nomePessoa = rs.getString("NomePessoa");
				System.out.println(nomePessoa);
			}else{
				System.out.println("Código pesquisado não existe.");
			}
	/*
			
			while (rs.next()) {
				nomePessoa = rs.getString("NomePessoa");
				codigoPessoa = rs.getLong("CodigoPessoa");
				
				System.out.println("" + codigoPessoa + ", " + nomePessoa);
			} */
			
			conn.close();
		} catch (SQLException e) {
			System.out.println("Erro no acesso ao BD: " + e.getMessage());
			System.out.println("\n\nCausado por: " + e.getCause() + "\n\n");
			e.printStackTrace();
		}
	}
}
