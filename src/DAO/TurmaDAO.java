package DAO;

import Modelo.Disciplina;
import Modelo.Professor;
import Modelo.Turma;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TurmaDAO extends ExecuteSQL {

    public TurmaDAO(Connection con) {
        super(con);
    }
    
    public String Cadastrar_Turma(Turma a) {
        String sql = "INSERT INTO turma VALUES (0,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getSerie());
            
            if (ps.executeUpdate() > 0) {
                return "Cadastrado com sucesso!";
            } else {
                return "Erro ao cadastrar";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public List<Turma> ConsultaCodigoTurma(String serie){
        String sql = "SELECT id FROM turma WHERE serie = '"+ serie +"'";
        List<Turma> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Turma a = new Turma();
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
    
    public List<Turma> Pegar_Turma(int id){
        String sql = "SELECT * FROM turma WHERE id = "+ id + "";
        List<Turma> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {                    
                    Turma a = new Turma();
                    a.setId(rs.getInt(1));
                    a.setSerie(rs.getString(2));
                    
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
    
    public String Alterar_Turma(Turma a){
        String sql = "UPDATE turma SET serie = ? WHERE id = ?";

        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setString(1, a.getSerie());
            ps.setInt(2, a.getId());

            if (ps.executeUpdate() > 0) {
                return "Atualizado com sucesso!";
            } else {
                return "Erro ao atualizar!";
            }
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
    public List<Turma> Pesquisar_Nome_Turma(String nome){
        String sql = "SELECT id, serie "
                + "FROM turma WHERE serie LIKE '%"+ nome +"%'";
       
        List<Turma> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Turma a = new Turma();
                    a.setId(rs.getInt(1));
                    a.setSerie(rs.getString(2));
                    
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
    
    public List<Turma> Pesquisar_Cod_Turma(int cod){
        String sql = "SELECT id, serie "
                + "FROM turma WHERE id = '"+ cod +"'";
       
        List<Turma> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Turma a = new Turma();
                    a.setId(rs.getInt(1));
                    a.setSerie(rs.getString(2));
                    
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
    
    public List<Turma> Listar_Turma() {
        String sql = "SELECT id, serie FROM turma";
        List<Turma> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Turma a = new Turma();
                    a.setId(rs.getInt(1));
                    a.setSerie(rs.getString(2));
                    
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
    
    public List<Turma> ListarComboTurma(){
        String sql = "SELECT serie FROM turma ORDER BY serie";
        List<Turma> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Turma a = new Turma();
                    a.setSerie(rs.getString(1));
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
    
    public String Excluir_Turma(Turma a){
        String sql = "DELETE FROM turma WHERE id = ? AND serie = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId());
            ps.setString(2, a.getSerie());
            
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
