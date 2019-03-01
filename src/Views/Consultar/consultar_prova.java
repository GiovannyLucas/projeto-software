/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Consultar;

import Views.Cadastrar.*;
import DAO.AssuntoDAO;
import DAO.Conexao;
import DAO.DisciplinaDAO;
import DAO.ProfessorDAO;
import DAO.ProvaDAO;
import DAO.QuestaoDAO;
import DAO.TurmaDAO;
import Modelo.Assunto;
import Modelo.Disciplina;
import Modelo.Professor;
import Modelo.Prova;
import Modelo.Questao;
import Modelo.Turma;
import Principal.*;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geova
 */
public class consultar_prova extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public consultar_prova() {
        initComponents();
        AtualizaTable();
    }
    

    private void AtualizaTable() {
        Connection con = Conexao.AbrirConexao();
        ProvaDAO bd = new ProvaDAO((com.mysql.jdbc.Connection) con);
        List<Prova> lista = new ArrayList<>();
        lista = bd.Listar_Prova();
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Prova tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getId_q1(), i, 1);
            jTable.setValueAt(tab.getId_q2(), i, 2);
            jTable.setValueAt(tab.getId_q3(), i, 3);
            jTable.setValueAt(tab.getId_q4(), i, 4);
            jTable.setValueAt(tab.getId_q5(), i, 5);
            jTable.setValueAt(tab.getId_disc(), i, 6);
            jTable.setValueAt(tab.getId_assu(), i, 7);
            jTable.setValueAt(tab.getId_turma(), i, 8);
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
        jButton3 = new javax.swing.JButton();
        btn_Prova = new javax.swing.JButton();
        btn_Questao = new javax.swing.JButton();
        btn_Assunto = new javax.swing.JButton();
        id_prova = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btn_pesq_disci = new javax.swing.JButton();
        btn_pesq_disci1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        id_assunto = new javax.swing.JTextField();
        btn_pesq_disci2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        id_turma = new javax.swing.JTextField();
        btn_pesq_disci3 = new javax.swing.JButton();
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

        btn_Prova.setBackground(new java.awt.Color(0, 204, 51));
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

        btn_Assunto.setBackground(new java.awt.Color(0, 153, 0));
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
        jPanel1.add(id_prova);
        id_prova.setBounds(70, 220, 80, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("Pesquisar por código da prova:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(60, 190, 210, 30);

        btn_pesq_disci.setBackground(new java.awt.Color(0, 153, 0));
        btn_pesq_disci.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_disci.setText("Pesquisar");
        btn_pesq_disci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_disciActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_disci);
        btn_pesq_disci.setBounds(160, 220, 90, 40);

        btn_pesq_disci1.setBackground(new java.awt.Color(0, 153, 0));
        btn_pesq_disci1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_disci1.setText("Todos");
        btn_pesq_disci1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_disci1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_disci1);
        btn_pesq_disci1.setBounds(600, 150, 100, 30);

        jTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Questão 1", "Questão 2", "Questão 3", "Questão 4", "Questão 5", "Cód. Disciplina", "Cód. Assunto", "Cód. Turma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 280, 710, 230);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setText("Pesquisar por código do assunto:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(280, 190, 220, 30);
        jPanel1.add(id_assunto);
        id_assunto.setBounds(290, 220, 80, 40);

        btn_pesq_disci2.setBackground(new java.awt.Color(0, 153, 0));
        btn_pesq_disci2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_disci2.setText("Pesquisar");
        btn_pesq_disci2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_disci2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_disci2);
        btn_pesq_disci2.setBounds(380, 220, 90, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 0));
        jLabel15.setText("Pesquisar por código da turma:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(510, 190, 220, 30);
        jPanel1.add(id_turma);
        id_turma.setBounds(520, 220, 80, 40);

        btn_pesq_disci3.setBackground(new java.awt.Color(0, 153, 0));
        btn_pesq_disci3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_disci3.setText("Pesquisar");
        btn_pesq_disci3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_disci3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pesq_disci3);
        btn_pesq_disci3.setBounds(610, 220, 90, 40);

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

    private void btn_pesq_disci1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_disci1ActionPerformed
        AtualizaTable();
        id_assunto.setText("");
        id_prova.setText("");
        id_turma.setText("");
    }//GEN-LAST:event_btn_pesq_disci1ActionPerformed

    private void btn_pesq_disciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_disciActionPerformed
        String codigo = id_prova.getText();
        int cod = Integer.parseInt(codigo);
        
        Connection con = Conexao.AbrirConexao();
        ProvaDAO bd = new ProvaDAO((com.mysql.jdbc.Connection) con);
        List<Prova> lista = new ArrayList<>();
        lista = bd.Pesquisar_Cod_Prova(cod); 
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Prova tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getId_q1(), i, 1);
            jTable.setValueAt(tab.getId_q2(), i, 2);
            jTable.setValueAt(tab.getId_q3(), i, 3);
            jTable.setValueAt(tab.getId_q4(), i, 4);
            jTable.setValueAt(tab.getId_q5(), i, 5);
            jTable.setValueAt(tab.getId_disc(), i, 6);
            jTable.setValueAt(tab.getId_assu(), i, 7);
            jTable.setValueAt(tab.getId_turma(), i, 8);
            i++;
        }
        id_prova.setText("");
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_btn_pesq_disciActionPerformed

    private void btn_pesq_disci2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_disci2ActionPerformed
        String codigo = id_assunto.getText();
        int cod = Integer.parseInt(codigo);
        
        Connection con = Conexao.AbrirConexao();
        ProvaDAO bd = new ProvaDAO((com.mysql.jdbc.Connection) con);
        List<Prova> lista = new ArrayList<>();
        lista = bd.Pesquisar_Cod_Prova_Assunto(cod); 
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Prova tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getId_q1(), i, 1);
            jTable.setValueAt(tab.getId_q2(), i, 2);
            jTable.setValueAt(tab.getId_q3(), i, 3);
            jTable.setValueAt(tab.getId_q4(), i, 4);
            jTable.setValueAt(tab.getId_q5(), i, 5);
            jTable.setValueAt(tab.getId_disc(), i, 6);
            jTable.setValueAt(tab.getId_assu(), i, 7);
            jTable.setValueAt(tab.getId_turma(), i, 8);
            i++;
        }
        id_assunto.setText("");
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);  
    }//GEN-LAST:event_btn_pesq_disci2ActionPerformed

    private void btn_pesq_disci3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_disci3ActionPerformed
        String codigo = id_turma.getText();
        int cod = Integer.parseInt(codigo);
        
        Connection con = Conexao.AbrirConexao();
        ProvaDAO bd = new ProvaDAO((com.mysql.jdbc.Connection) con);
        List<Prova> lista = new ArrayList<>();
        lista = bd.Pesquisar_Cod_Prova_Turma(cod); 
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Prova tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getId_q1(), i, 1);
            jTable.setValueAt(tab.getId_q2(), i, 2);
            jTable.setValueAt(tab.getId_q3(), i, 3);
            jTable.setValueAt(tab.getId_q4(), i, 4);
            jTable.setValueAt(tab.getId_q5(), i, 5);
            jTable.setValueAt(tab.getId_disc(), i, 6);
            jTable.setValueAt(tab.getId_assu(), i, 7);
            jTable.setValueAt(tab.getId_turma(), i, 8);
            i++;
        }
        id_turma.setText("");
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);  
    }//GEN-LAST:event_btn_pesq_disci3ActionPerformed

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
            java.util.logging.Logger.getLogger(consultar_prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultar_prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultar_prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultar_prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new consultar_prova().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Assunto;
    private javax.swing.JButton btn_Prova;
    private javax.swing.JButton btn_Questao;
    private javax.swing.JButton btn_pesq_disci;
    private javax.swing.JButton btn_pesq_disci1;
    private javax.swing.JButton btn_pesq_disci2;
    private javax.swing.JButton btn_pesq_disci3;
    private javax.swing.JTextField id_assunto;
    private javax.swing.JTextField id_prova;
    private javax.swing.JTextField id_turma;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
