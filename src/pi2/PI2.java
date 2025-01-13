package pi2;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class PI2 {
    
    
    public static void main(String[] args) {

        telaInicial ti = new telaInicial();
        ti.setLocationRelativeTo(null);
        ti.setVisible(true);
// TODO code application logic here

        try {
            Connection conn; 
            Statement st; 
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://localhost:3306/massaspotiguar", "root", "alessiA22!");//("jdbc:mysql://localhost:3306/massaspotiguar","root","alessiA22!");
        } catch (ClassNotFoundException ex) {
            System.out.println("driver não está disponível para acesso ou não existe");
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida");
        }
        conexao conector = new conexao();

        conector.conectar();

        /*Connection conn;          
        Statement stmt = null;
      try {
          stmt = conn.createStatement();
          System.out.println( "Pronto para execucao de comandos sql." );
      } catch ( SQLException sqle ) {
          System.out.println( "Erro no acesso ao Bando de Dados : " +
                                        sqle.getMessage() );
      }
          */
        
}
}
