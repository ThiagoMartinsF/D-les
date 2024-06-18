package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {
        private static final  String URL = "jdbc:mysql://db4free.net:3306/bonappetit2?useSSL=false";
        private static final  String USUARIO = "thiago_martins2";
        private static final  String SENHA = "33429851thiago";
        private static final  String driver = "com.mysql.cj.jdbc.Driver";
       
public static java.sql.Connection conectar() {
        java.sql.Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERRO! Conexao:" + e);
        }
        return conn;
    }
}
