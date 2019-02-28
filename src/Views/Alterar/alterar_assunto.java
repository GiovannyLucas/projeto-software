/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Alterar;

import Views.Cadastrar.*;
import DAO.AssuntoDAO;
import DAO.Conexao;
import DAO.DisciplinaDAO;
import DAO.QuestaoDAO;
import Modelo.Assunto;
import Modelo.Disciplina;
import Modelo.Questao;
import Principal.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author geova
 */
public class alterar_assunto extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public alterar_assunto() {
        initComponents();
        AtualizaCombo();
    }
    
    private void InserirDados(int id){
        Connection con = Conexao.AbrirConexao();
        AssuntoDAO sql = new AssuntoDAO((com.mysql.jdbc.Connection) con);
        List<Assunto> lista = new ArrayList<>();
        lista = sql.Pegar_Assunto(id);
        
        for (Assunto a : lista) {
            id_assu.setText("" + a.getId());
            nome_assu.setText("" + a.getNome());
        }
        
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    
    private void AtualizaCombo(){
        Connection con = Conexao.AbrirConexao();
        DisciplinaDAO sql = new DisciplinaDAO((com.mysql.jdbc.Connection) con);
        List<Disciplina> lista = new ArrayList<>();
        lista = sql.ListarComboDisciplina();
        jCB_disc.addItem("");
        
        for (Disciplina b : lista) {
            jCB_disc.addItem(b.getNome());
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        nome_assu = new javax.swing.JTextField();
        btn_cad_disc = new javax.swing.JButton();
        btn_Prova = new javax.swing.JButton();
        btn_Questao = new javax.swing.JButton();
        btn_Assunto = new javax.swing.JButton();
        jCB_disc = new javax.swing.JComboBox<>();
        jtf_id_disc = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        id_assunto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btn_pesq_disci = new javax.swing.JButton();
        id_assu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 30, 70, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Disciplina:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(300, 400, 230, 30);

        nome_assu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(nome_assu);
        nome_assu.setBounds(300, 350, 230, 40);

        btn_cad_disc.setBackground(new java.awt.Color(0, 153, 0));
        btn_cad_disc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cad_disc.setText("Alterar");
        btn_cad_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_discActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cad_disc);
        btn_cad_disc.setBounds(400, 490, 130, 50);

        btn_Prova.setBackground(new java.awt.Color(0, 153, 0));
        btn_Prova.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Prova.setForeground(new java.awt.Color(255, 255, 255));
        btn_Prova.setText("Prova");
        btn_Prova.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProvaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Prova);
        btn_Prova.setBounds(10, 20, 110, 40);

        btn_Questao.setBackground(new java.awt.Color(0, 153, 0));
        btn_Questao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Questao.setForeground(new java.awt.Color(255, 255, 255));
        btn_Questao.setText("Questão");
        btn_Questao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuestaoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Questao);
        btn_Questao.setBounds(150, 20, 120, 40);

        btn_Assunto.setBackground(new java.awt.Color(0, 204, 51));
        btn_Assunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Assunto.setForeground(new java.awt.Color(255, 255, 255));
        btn_Assunto.setText("Assunto");
        btn_Assunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AssuntoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Assunto);
        btn_Assunto.setBounds(300, 20, 120, 40);

        jCB_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_discActionPerformed(evt);
            }
        });
        jPanel1.add(jCB_disc);
        jCB_disc.setBounds(300, 430, 230, 40);

        jtf_id_disc.setEditable(false);
        jtf_id_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_discActionPerformed(evt);
            }
        });
        jPanel1.add(jtf_id_disc);
        jtf_id_disc.setBounds(300, 430, 50, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("Nome do assunto:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(300, 320, 230, 30);
        jPanel1.add(id_assunto);
        id_assunto.setBounds(300, 180, 120, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 0));
        jLabel16.setText("Digite o código da questão:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(300, 150, 200, 30);

        btn_pesq_disci.setBackground(new java.awt.Color(0, 153, 0));
        btn_pesq_disci.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_disci.setText("Pesquisar");
        btn_pesq_disci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_disciActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_disci);
        btn_pesq_disci.setBounds(430, 180, 90, 40);

        id_assu.setEditable(false);
        id_assu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(id_assu);
        id_assu.setBounds(300, 270, 230, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("Código:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(300, 240, 230, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 105);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Principal.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 120, 750, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cad_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_discActionPerformed
    String codigo = id_assu.getText();
    String nome = nome_assu.getText();
    String disc = jtf_id_disc.getText();
    
    if (codigo.equals("") || nome.equals("") || disc.equals("")) {
        JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!",
                    "Banco de questões", JOptionPane.WARNING_MESSAGE);
    } else {
        Connection con = Conexao.AbrirConexao();
        AssuntoDAO sql = new AssuntoDAO((com.mysql.jdbc.Connection) con);
        int cod = Integer.parseInt(codigo);
        int di = Integer.parseInt(disc);
        Assunto a = new Assunto();
        
        a.setNome(nome);
        a.setId_disc(di);
        a.setId(cod);
        
        sql.Alterar_Assunto(a);
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
        
        JOptionPane.showMessageDialog(null, "Assunto alterado com sucesso!",
                    "Banco de questões", JOptionPane.INFORMATION_MESSAGE);   
        dispose();
        new alterar_assunto().setVisible(true);
    }
    }//GEN-LAST:event_btn_cad_discActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_ProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProvaActionPerformed
        dispose();
        new TelaProf().setVisible(true);
    }//GEN-LAST:event_btn_ProvaActionPerformed

    private void btn_QuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuestaoActionPerformed
        dispose();
        new TelaProf().setVisible(true);
    }//GEN-LAST:event_btn_QuestaoActionPerformed

    private void btn_AssuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AssuntoActionPerformed
        dispose();
        new TelaProf().setVisible(true);
    }//GEN-LAST:event_btn_AssuntoActionPerformed

    private void jtf_id_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_discActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_discActionPerformed

    private void jCB_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_discActionPerformed
        Connection con = Conexao.AbrirConexao();
        DisciplinaDAO sql = new DisciplinaDAO((com.mysql.jdbc.Connection) con);
        List<Disciplina> lista = new ArrayList<>();
        String nome = jCB_disc.getSelectedItem().toString();

        lista = sql.ConsultaCodigoDisc(nome);

        for (Disciplina b : lista) {
            int a = b.getId();
            jtf_id_disc.setText("" + a);
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jCB_discActionPerformed

    private void btn_pesq_disciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_disciActionPerformed
        String id = id_assunto.getText();
        Connection con  = Conexao.AbrirConexao();
        AssuntoDAO sql = new AssuntoDAO((com.mysql.jdbc.Connection) con);
        int cod = Integer.parseInt(id);

        if (id.equals("")) {
            JOptionPane.showMessageDialog(null, "Digite um código para atualizar",
                "Banco de questões", JOptionPane.WARNING_MESSAGE);
        }

        InserirDados(cod);
        id_assunto.setText("");
    }//GEN-LAST:event_btn_pesq_disciActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(alterar_assunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterar_assunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterar_assunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterar_assunto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterar_assunto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Assunto;
    private javax.swing.JButton btn_Prova;
    private javax.swing.JButton btn_Questao;
    private javax.swing.JButton btn_cad_disc;
    private javax.swing.JButton btn_pesq_disci;
    private javax.swing.JTextField id_assu;
    private javax.swing.JTextField id_assunto;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCB_disc;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtf_id_disc;
    private javax.swing.JTextField nome_assu;
    // End of variables declaration//GEN-END:variables
}