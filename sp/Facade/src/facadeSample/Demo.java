package facadeSample;

import java.sql.ResultSet;
import java.sql.SQLException;

import facadeSample.facade.DatabaseFacade;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            DatabaseFacade facade = new DatabaseFacade("jdbc:mysql://localhost:3306/meu_banco", "usuario", "senha");
	            facade.conectarDatabaseFacade();
	            ResultSet resultSet = facade.executarQuery("SELECT * FROM tabela");
	            while (resultSet.next()) {
	                System.out.println(resultSet.getString("coluna1") + ", " + resultSet.getInt("coluna2"));
	            }

	            int linhasAfetadas = facade.executarUpdate("UPDATE tabela SET coluna1 = 'novo valor' WHERE id = 1");
	            System.out.println("Linhas afetadas: " + linhasAfetadas);

	            facade.fecharConexao();

	        } catch (SQLException e) {
	            System.err.println("Erro: " + e.getMessage());
	        }
	    }
	
	}


