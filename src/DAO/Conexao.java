package DAO;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexao {
        
    public static Connection AbrirConexao() {
        
        Connection con = null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String url = "jdbc:mysql://localhost/proj_soft";
                con = (Connection) DriverManager.getConnection(url, "root", "");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco", "Banco de questões", 
                        JOptionPane.ERROR_MESSAGE);
                e.getMessage();
            }
        return con;
    }
    
    public static void FecharConexao(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
