package quest4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Quest04 {
	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		
		//peça ao usuário que digite um argumento de pesquisa
		/*Scanner c = new Scanner(System.in);
		String url = "jdbc:ucanaccess://C:\\Users\\Juarez Coutinho\\Documents\\Oficina.mdb";
		System.out.println("Nome da pessoa a ser adicionada");
		String nome = c.nextLine();
		System.out.println("Quantos carros serão adicionados??");
		int qtd = c.nextInt();
		System.out.println("Digite os carros desejados e suas especificações (NomeCarro/Estilo/Ano)");
		ArrayList<String[]> x;
		
		Pessoa p = new Pessoa(nome, nome, x);
		
		*/ // ajeitar o metodo incluir pessoa
		try {
			conn = DriverManager.getConnection(url); // abre conexão
			
			stmt = conn.createStatement(); // usando stmt para inserção
			stmt.executeUpdate("INSERT INTO Pessoa (NomePessoa) values ('Thiago')");

			stmt.close(); 
			
			// reusando statement para consulta
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM Pessoa WHERE NomePessoa = 'Thiago'");
			stmt.close(); 
			/*
			if(rs.next()){
				//mostre os valores lidos do banco de dados para os campos da tabela Pessoa
				int y = rs.getInt("CodigoPessoa");
				for (int i = 1; i < qtd; i++) {
					stmt = conn.createStatement();
					stmt.executeUpdate("INSERT INTO Carro ()")
				}
				
				
			}else{
				System.out.println("Código pesquisado não existe.");
			}
			*/
			/*String nomePessoa;
			long codigoPessoa;
			
			while (rs.next()) {
				nomePessoa = rs.getString("NomePessoa");
				codigoPessoa = rs.getLong("CodigoPessoa");
				
				System.out.println("" + codigoPessoa + ", " + nomePessoa);
			} */
			
			conn.close();
			
			conn.close();
		} catch (SQLException e) {
			System.out.println("Erro no acesso ao BD: " + e.getMessage());
			System.out.println("\n\nCausado por: " + e.getCause() + "\n\n");
			e.printStackTrace();
		}
	}
}
