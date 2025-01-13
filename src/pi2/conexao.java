package pi2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
    Connection conn;
    
    public boolean conectar(){
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/massaspotiguar","root","alessiA22!");
            System.out.println("Conexão realizada com sucesso");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Falha na conexão com o banco " + ex.getMessage());
            return false;
}
    }
    
    public void desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {
        
        }
    }
}