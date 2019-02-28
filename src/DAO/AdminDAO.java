package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Admin;

public class AdminDAO extends ExecuteSQL {

    public AdminDAO(Connection con) {
        super(con);
    }
    
    public boolean Logar(String login, String senha){
        boolean finalResult = false;
        
        try {
            String consulta  = "SELECT email, senha FROM admin WHERE email = '"+ login + "' AND senha = '"+ senha +"'";
            PreparedStatement ps = getCon().prepareStatement(consulta);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {                    
                    Admin a = new Admin();
                    a.setEmail(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
            }
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return finalResult;
    }

    
}
