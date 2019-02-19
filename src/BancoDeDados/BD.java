
package BancoDeDados;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author vinicius
 */
public class BD {
    public Connection conn;
    public Statement stmnt;
    String driver = "org.postgresql.Driver";
    String url = "jdbc:postgresql://localhost:5432/universidade";
    String usuario = "postgres";
    String senha = "123456";

 
    
    public void abrirConexao(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado ao postgre! ");
            stmnt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);      
        } catch (ClassNotFoundException c) {
            System.out.println("Erro ao carregar a classe! ");
        }catch(SQLException e){
            System.out.println("Erro ao conectar! ");
        }
        
    }
    
    public void fecharConexao(){
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexao! ");
            }
        }
    }
    
    public Connection getConn() {
        return conn;
    }

    public Statement getStatement() {
        return stmnt;
    }

}