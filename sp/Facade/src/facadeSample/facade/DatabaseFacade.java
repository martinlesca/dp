package facadeSample.facade;

import java.sql.ResultSet;
import java.sql.SQLException;

import facadeSample.database.Database;

public class DatabaseFacade {
	
	private String url = null;
	private String usuario = null;
	private String senha = null;
	private Database conn = null;
	
	public DatabaseFacade(String urlCon, String user, String password) throws SQLException {
    	try {
    		url = urlCon;
    		usuario = user;
    		senha = password;
        } catch (Exception e) {
            throw e;
        }
    }	

    public boolean conectarDatabaseFacade() throws SQLException {
        //final Database conn;
    	try {
            conn = new Database(url,usuario,senha);
            return true;
        } catch (SQLException e) {
            throw e;
        }
    }

    public ResultSet executarQuery(String sql) throws SQLException {
        try {
            return executarQuery(sql);
        } catch (SQLException e) {
           throw e;
        }
    }

    public int executarUpdate(String sql) throws SQLException {
        try {
            return executarUpdate(sql);
        } catch (SQLException e) {
            throw e;
        }
    }

    public void fecharConexao() throws SQLException {
        try {
        	fecharConexao();
        } catch (SQLException e) {
            throw e;
        }
    }

}
