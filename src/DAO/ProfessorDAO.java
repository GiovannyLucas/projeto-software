package DAO;

import Modelo.Disciplina;
import Modelo.Professor;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO extends ExecuteSQL{
    
    public ProfessorDAO(Connection con) {
        super(con);
    }
    
    public String Cadastrar_Professor(Professor a) {
        String sql = "INSERT INTO professor VALUES (0,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getNome());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getSenha());
            ps.setInt(4, a.getId_disc());

            if (ps.executeUpdate() > 0) {
                return "Cadastrado com sucesso!";
            } else {
                return "Erro ao cadastrar";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Professor> Pegar_Professor(int id){
        String sql = "SELECT * FROM professor WHERE id = "+ id + "";
        List<Professor> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {                    
                    Professor a = new Professor();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setEmail(rs.getString(3));
                    a.setSenha(rs.getString(4));
                    
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
    
    public String Alterar_Professor(Professor a){
        String sql = "UPDATE professor SET nome = ?, email = ?, senha = ?, id_disc = ? WHERE id = ?";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getEmail());
            ps.setString(3, a.getSenha());
            ps.setInt(4, a.getId_disc());
            ps.setInt(5, a.getId());
            
            if (ps.executeUpdate() > 0) {
                return "Atualizado com sucesso!";
            } else {
                return "Erro ao atualizar!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Professor> ListarComboProfessor(){
        String sql = "SELECT nome FROM professor ORDER BY nome";
        List<Professor> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Professor a = new Professor();
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
    
        public List<Professor> Pesquisar_Nome_Professor(String nome){
        String sql = "SELECT id, nome, email, senha, id_disc "
                + "FROM professor WHERE nome LIKE '%"+ nome +"%'";
       
        List<Professor> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Professor a = new Professor();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setEmail(rs.getString(3));
                    a.setSenha(rs.getString(4));
                    a.setId_disc(rs.getInt(5));
                    
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
    
    public List<Professor> Pesquisar_Cod_Professor(int cod){
        String sql = "SELECT id, nome, email, senha, id_disc "
                + "FROM professor WHERE id = '"+ cod +"'";
       
        List<Professor> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Professor a = new Professor();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setEmail(rs.getString(3));
                    a.setSenha(rs.getString(4));
                    a.setId_disc(rs.getInt(5));
                    
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
    
    public List<Professor> Listar_Professor() {
        String sql = "SELECT id, nome, email, senha, id_disc FROM professor";
        List<Professor> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Professor a = new Professor();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setEmail(rs.getString(3));
                    a.setSenha(rs.getString(4));
                    a.setId_disc(rs.getInt(5));
                    
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
    
    public List<Professor> Pesquisar_Cod_Disc_Prof(int cod){
        String sql = "SELECT * "
                + "FROM professor WHERE id_disc = '"+ cod +"'";
       
        List<Professor> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Professor a = new Professor();
                    a.setId(rs.getInt(1));
                    a.setNome(rs.getString(2));
                    a.setEmail(rs.getString(3));
                    a.setSenha(rs.getString(4));
                    a.setId_disc(rs.getInt(5));a.setId(rs.getInt(1));
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
    
    public List<Professor> ConsultaCodigoProf(String nome){
        String sql = "SELECT id FROM professor WHERE nome = '"+ nome +"'";
        List<Professor> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Professor a = new Professor();
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
    
    public String Excluir_Professor(Professor a){
        String sql = "DELETE FROM professor WHERE id = ? AND nome = ?";
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
