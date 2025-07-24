package facadeSample.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	    private Connection conexao;
	    private Statement statement;

	    public Database(String url, String usuario, String senha) throws SQLException {
	        try {
	            conexao = DriverManager.getConnection(url, usuario, senha);
	            statement = conexao.createStatement();
	        } catch (SQLException e) {
	            throw new SQLException("Erro ao conectar com o banco de dados: " + e.getMessage(), e);
	        }
	    }

	    public ResultSet executarQuery(String sql) throws SQLException {
	        try {
	            return statement.executeQuery(sql);
	        } catch (SQLException e) {
	           throw new SQLException("Erro ao executar a consulta: " + e.getMessage(), e);
	        }
	    }

	    public int executarUpdate(String sql) throws SQLException {
	        try {
	            return statement.executeUpdate(sql);
	        } catch (SQLException e) {
	            throw new SQLException("Erro ao executar a atualização: " + e.getMessage(), e);
	        }
	    }

	    public void fecharConexao() throws SQLException {
	        try {
	            if (statement != null) {
	                statement.close();
	            }
	            if (conexao != null) {
	                conexao.close();
	            }
	        } catch (SQLException e) {
	            throw new SQLException("Erro ao fechar a conexão: " + e.getMessage(), e);
	        }
	    }

}
