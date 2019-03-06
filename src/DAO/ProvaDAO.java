package DAO;

import Modelo.Disciplina;
import Modelo.Professor;
import Modelo.Prova;
import Modelo.Questao;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Admin;

public class ProvaDAO extends ExecuteSQL{
    
    public ProvaDAO(Connection con) {
        super(con);
    }
    
    public String Cadastrar_Prova(Prova a) {
        String sql = "INSERT INTO prova VALUES (0,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);

            ps.setInt(1, a.getId_q1());
            ps.setInt(2, a.getId_q2());
            ps.setInt(3, a.getId_q3());
            ps.setInt(4, a.getId_q4());
            ps.setInt(5, a.getId_q5());
            ps.setInt(6, a.getId_disc());
            ps.setInt(7, a.getId_assu());
            ps.setInt(8, a.getId_turma());

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
    
    public List<Prova> ListarComboProva(){
        String sql = "SELECT id FROM prova";
        List<Prova> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Prova a = new Prova();
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
    
    public List<Prova> ListarComboProva_ID(int id_turma){
        String sql = "SELECT id FROM prova WHERE id_turma = "+ id_turma +"";
        /*String s = "SELECT prova.id_disciplina 'prova.id_disciplina', assunto.nome 'assunto.nome'"+ 
        "FROM prova prova INNER JOIN disciplina disciplina ON prova.id_disciplina = assunto.id";*/
        List<Prova> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Prova a = new Prova();
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
    
    public List<Prova> Listar_Prova() {
        String sql = "SELECT * FROM prova";
        List<Prova> lista = new ArrayList<>();
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Prova a = new Prova();
                    a.setId(rs.getInt(1));
                    a.setId_q1(rs.getInt(2));
                    a.setId_q2(rs.getInt(3));
                    a.setId_q3(rs.getInt(4));
                    a.setId_q4(rs.getInt(5));
                    a.setId_q5(rs.getInt(6));
                    a.setId_disc(rs.getInt(7));
                    a.setId_assu(rs.getInt(8));
                    a.setId_turma(rs.getInt(9));
                    
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
    
    public List<Prova> Pesquisar_Cod_Prova(int cod){
        String sql = "SELECT * "
                + "FROM prova WHERE id = '"+ cod +"'";
       
        List<Prova> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Prova a = new Prova();
                    a.setId(rs.getInt(1));
                    a.setId_q1(rs.getInt(2));
                    a.setId_q2(rs.getInt(3));
                    a.setId_q3(rs.getInt(4));
                    a.setId_q4(rs.getInt(5));
                    a.setId_q5(rs.getInt(6));
                    a.setId_disc(rs.getInt(7));
                    a.setId_assu(rs.getInt(8));
                    a.setId_turma(rs.getInt(9));
                    
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
    
    public List<Prova> Pesquisar_Cod_Prova_Assunto(int cod){
        String sql = "SELECT * "
                + "FROM prova WHERE id_assunto = '"+ cod +"'";
       
        List<Prova> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Prova a = new Prova();
                    a.setId(rs.getInt(1));
                    a.setId_q1(rs.getInt(2));
                    a.setId_q2(rs.getInt(3));
                    a.setId_q3(rs.getInt(4));
                    a.setId_q4(rs.getInt(5));
                    a.setId_q5(rs.getInt(6));
                    a.setId_disc(rs.getInt(7));
                    a.setId_assu(rs.getInt(8));
                    a.setId_turma(rs.getInt(9));
                    
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
    
    public List<Prova> Pesquisar_Cod_Prova_Turma(int cod){
        String sql = "SELECT * "
                + "FROM prova WHERE id_turma = '"+ cod +"'";
       
        List<Prova> lista = new ArrayList<>();
            
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Prova a = new Prova();
                    a.setId(rs.getInt(1));
                    a.setId_q1(rs.getInt(2));
                    a.setId_q2(rs.getInt(3));
                    a.setId_q3(rs.getInt(4));
                    a.setId_q4(rs.getInt(5));
                    a.setId_q5(rs.getInt(6));
                    a.setId_disc(rs.getInt(7));
                    a.setId_assu(rs.getInt(8));
                    a.setId_turma(rs.getInt(9));
                    
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
    
    public List<Prova> ConsultaCodigoProva(int id){
        String sql = "SELECT id FROM prova WHERE id = '"+ id +"'";
        List<Prova> lista = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            if (rs != null) {
                while (rs.next()) {
                    Prova a = new Prova();
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
    
    public String Excluir_Prova(Prova a){
        String sql = "DELETE FROM prova WHERE id = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setInt(1, a.getId());
            
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
