package DAO;

import Modelo.Assunto;
import Modelo.Prova;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AssuntoDAO extends ExecuteSQL {

    public AssuntoDAO(Connection con) {
        super(con);
    }
    
    public String Cadastrar_Assunto(Assunto a) {
        String sql = "INSERT INTO assunto VALUES (0,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setInt(2, a.getId_disc());

            
            if (ps.executeUpdate() > 0) {
                return "Cadastrado com sucesso!";
            } else {
                return "Erro ao cadastrar";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public List<Assunto> ConsultaCodigoAssunto(String nome){
        String sql = "SELECT id FROM assunto WHERE nome = '"+ nome +"'";
        List<Assunto> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Assunto a = new Assunto();
                    a.setId(rs.getInt(1));
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Assunto> ListarComboAssunto(){
        String sql = "SELECT nome FROM assunto ORDER BY nome";
        List<Assunto> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Assunto a = new Assunto();
                    a.setNome(rs.getString(1));
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Assunto> ListarComboAssunto(int id_disc){
        String sql = "SELECT nome FROM assunto WHERE id_disc = "+ id_disc +" ORDER BY nome";
        List<Assunto> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Assunto a = new Assunto();
                    a.setNome(rs.getString(1));
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
    public List<Assunto> Pegar_Assunto(int id){
        String sql = "SELECT id,nome FROM assunto WHERE id = "+ id + "";
        List<Assunto> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {                    
                    Assunto a = new Assunto();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
    
    public String Alterar_Assunto(Assunto a){
        String sql = "UPDATE assunto SET nome = ?, id_disc = ? WHERE id = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setInt(2, a.getId_disc());
            ps.setInt(3, a.getId());

            if (ps.executeUpdate() > 0) {
                return "Atualizado com sucesso!";
            } else {
                return "Erro ao atualizar!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Assunto> Pesquisar_Nome_Assunto(String nome){
        String sql = "SELECT * "
                + "FROM assunto WHERE nome LIKE '%"+ nome +"%'";
       
        List<Assunto> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Assunto a = new Assunto();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setId_disc(rs.getInt(3));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public List<Assunto> Pesquisar_Cod_Assunto(int cod){
        String sql = "SELECT * "
                + "FROM assunto WHERE id = '"+ cod +"'";
       
        List<Assunto> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Assunto a = new Assunto();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setId_disc(rs.getInt(3));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }   
    }
    
    public List<Assunto> Pesquisar_Cod_Disc_Assun(int cod){
        String sql = "SELECT * "
                + "FROM assunto WHERE id_disc = '"+ cod +"'";
       
        List<Assunto> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Assunto a = new Assunto();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setId_disc(rs.getInt(3));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }   
    }
    
    public List<Assunto> Listar_Assunto() {
        String sql = "SELECT id,nome FROM assunto";
        List<Assunto> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Assunto a = new Assunto();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    
    }
    
    public List<Assunto> Listar_Assunto_Consulta() {
        String sql = "SELECT * FROM assunto";
        List<Assunto> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Assunto a = new Assunto();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setId_disc(rs.getInt(3));
                    
                    lista.add(a);
                }
                return lista;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    
    }
    
    public String Excluir_Assunto(Assunto a){
        String sql = "DELETE FROM assunto WHERE id = ? AND nome = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId());
            ps.setString(2, a.getNome());
            
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso!";
            } else {
                return "Erro ao excluir!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}
