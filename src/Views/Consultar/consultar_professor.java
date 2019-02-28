/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Consultar;

import Views.Cadastrar.*;
import DAO.Conexao;
import DAO.DisciplinaDAO;
import DAO.ProfessorDAO;
import Modelo.Disciplina;
import Modelo.Professor;
import Principal.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geova
 */
public class consultar_professor extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public consultar_professor() {
        initComponents();
        AtualizaTable();
        AtualizaTableDisc();
    }
    
    private void AtualizaTable() {
        Connection con = Conexao.AbrirConexao();
        ProfessorDAO bd = new ProfessorDAO((com.mysql.jdbc.Connection) con);
        List<Professor> lista = new ArrayList<>();
        lista = bd.Listar_Professor();
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Professor tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getNome(), i, 1);
            jTable.setValueAt(tab.getEmail(), i, 2);
            jTable.setValueAt(tab.getSenha(), i, 3);
            jTable.setValueAt(tab.getId_disc(), i, 4);
            i++;
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    
    private void AtualizaTableDisc() {
        Connection con = Conexao.AbrirConexao();
        DisciplinaDAO bd = new DisciplinaDAO((com.mysql.jdbc.Connection) con);
        List<Disciplina> lista = new ArrayList<>();
        lista = bd.Listar_Disciplina();
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Disciplina tab : lista) {
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getId(), i, 0);
            jTable1.setValueAt(tab.getNome(), i, 1);
            i++;
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        id_professor = new javax.swing.JTextField();
        btn_pesq_prof = new javax.swing.JButton();
        nome_professor = new javax.swing.JTextField();
        btn_pesq_all = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btn_pesq_nome = new javax.swing.JButton();
        id_disciplina = new javax.swing.JTextField();
        btn_pesq_disci = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Turma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(160, 20, 120, 40);

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Disciplina");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(300, 20, 120, 40);

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

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Professor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(20, 20, 120, 40);

        jTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "E-mail", "Senha", "Código da disciplina"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 590, 250);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setText("Pesquisar por código do professor:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(50, 190, 220, 30);
        jPanel1.add(id_professor);
        id_professor.setBounds(70, 220, 80, 40);

        btn_pesq_prof.setBackground(new java.awt.Color(255, 255, 102));
        btn_pesq_prof.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_prof.setText("Pesquisar");
        btn_pesq_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_profActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_prof);
        btn_pesq_prof.setBounds(160, 220, 90, 40);

        nome_professor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_professorActionPerformed(evt);
            }
        });
        jPanel1.add(nome_professor);
        nome_professor.setBounds(280, 220, 130, 40);

        btn_pesq_all.setBackground(new java.awt.Color(255, 255, 102));
        btn_pesq_all.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_all.setText("Todos");
        btn_pesq_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_allActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_all);
        btn_pesq_all.setBounds(620, 150, 80, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 51));
        jLabel12.setText("Pesquisar por código da disciplina:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(530, 190, 220, 30);

        btn_pesq_nome.setBackground(new java.awt.Color(255, 255, 102));
        btn_pesq_nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_nome.setText("Pesquisar");
        btn_pesq_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_nomeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_nome);
        btn_pesq_nome.setBounds(420, 220, 90, 40);
        jPanel1.add(id_disciplina);
        id_disciplina.setBounds(540, 220, 80, 40);

        btn_pesq_disci.setBackground(new java.awt.Color(255, 255, 102));
        btn_pesq_disci.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_disci.setText("Pesquisar");
        btn_pesq_disci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_disciActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_disci);
        btn_pesq_disci.setBounds(630, 220, 90, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Pesquisar por nome do professor:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(280, 190, 230, 30);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(630, 280, 120, 250);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuAdmin.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 105);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Principal (1).png"))); // NOI18N
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        new TelaAdmin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        new TelaAdmin().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new TelaAdmin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_pesq_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_profActionPerformed
        String codigo = id_professor.getText();
        int cod = Integer.parseInt(codigo);
        
        Connection con = Conexao.AbrirConexao();
        ProfessorDAO bd = new ProfessorDAO((com.mysql.jdbc.Connection) con);
        List<Professor> lista = new ArrayList<>();
        lista = bd.Pesquisar_Cod_Professor(cod); 
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Professor tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getNome(), i, 1);
            jTable.setValueAt(tab.getEmail(), i, 2);
            jTable.setValueAt(tab.getSenha(), i, 3);
            jTable.setValueAt(tab.getId_disc(), i, 4);
            i++;
        }
        id_professor.setText("");
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_btn_pesq_profActionPerformed

    private void btn_pesq_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_allActionPerformed
        AtualizaTable();
        id_professor.setText("");
        nome_professor.setText("");
    }//GEN-LAST:event_btn_pesq_allActionPerformed

    private void btn_pesq_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_nomeActionPerformed
        String nome = nome_professor.getText();
        
        Connection con = Conexao.AbrirConexao();
        ProfessorDAO bd = new ProfessorDAO((com.mysql.jdbc.Connection) con);
        List<Professor> lista = new ArrayList<>();
        lista = bd.Pesquisar_Nome_Professor(nome); 
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Professor tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getNome(), i, 1);
            jTable.setValueAt(tab.getEmail(), i, 2);
            jTable.setValueAt(tab.getSenha(), i, 3);
            jTable.setValueAt(tab.getId_disc(), i, 4);
            i++;
        }
        nome_professor.setText("");
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_btn_pesq_nomeActionPerformed

    private void btn_pesq_disciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_disciActionPerformed
        String codigo = id_disciplina.getText();
        int cod = Integer.parseInt(codigo);
        
        Connection con = Conexao.AbrirConexao();
        ProfessorDAO bd = new ProfessorDAO((com.mysql.jdbc.Connection) con);
        List<Professor> lista = new ArrayList<>();
        lista = bd.Pesquisar_Cod_Disc_Prof(cod); 
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Professor tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getNome(), i, 1);
            jTable.setValueAt(tab.getEmail(), i, 2);
            jTable.setValueAt(tab.getSenha(), i, 3);
            jTable.setValueAt(tab.getId_disc(), i, 4);
            i++;
        }
        id_disciplina.setText("");
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_btn_pesq_disciActionPerformed

    private void nome_professorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_professorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_professorActionPerformed

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
            java.util.logging.Logger.getLogger(consultar_professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultar_professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultar_professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultar_professor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultar_professor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pesq_all;
    private javax.swing.JButton btn_pesq_disci;
    private javax.swing.JButton btn_pesq_nome;
    private javax.swing.JButton btn_pesq_prof;
    private javax.swing.JTextField id_disciplina;
    private javax.swing.JTextField id_professor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nome_professor;
    // End of variables declaration//GEN-END:variables
}
