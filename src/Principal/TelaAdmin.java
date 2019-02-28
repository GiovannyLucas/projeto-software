/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Views.Alterar.*;
import Views.Cadastrar.*;
import Views.Consultar.*;

/**
 *
 * @author geova
 */
public class TelaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public TelaAdmin() {
        initComponents();
        LimparTela();
    }
    
    public void LimparTela() {
        cad_prof.setVisible(true);
        cad_turma.setVisible(false);
        cad_disc.setVisible(false);
        alt_prof.setVisible(true);
        alt_turma.setVisible(false);
        alt_disc.setVisible(false);
        cons_prof.setVisible(true);
        cons_turma.setVisible(false);
        cons_disc.setVisible(false);
        exc_prof.setVisible(true);
        exc_turma.setVisible(false);
        exc_disc.setVisible(false);
    }
    
    public void professor(){
        cad_prof.setVisible(true);
        cad_turma.setVisible(false);
        cad_disc.setVisible(false);
        alt_prof.setVisible(true);
        alt_turma.setVisible(false);
        alt_disc.setVisible(false);
        cons_prof.setVisible(true);
        cons_turma.setVisible(false);
        cons_disc.setVisible(false);
        exc_prof.setVisible(true);
        exc_turma.setVisible(false);
        exc_disc.setVisible(false);
    }
    public void turma(){
        cad_prof.setVisible(false);
        cad_turma.setVisible(true);
        cad_disc.setVisible(false);
        alt_prof.setVisible(false);
        alt_turma.setVisible(true);
        alt_disc.setVisible(false);
        cons_prof.setVisible(false);
        cons_turma.setVisible(true);
        cons_disc.setVisible(false);
        exc_prof.setVisible(false);
        exc_turma.setVisible(true);
        exc_disc.setVisible(false);
    }
    public void disciplina(){
        cad_prof.setVisible(false);
        cad_turma.setVisible(false);
        cad_disc.setVisible(true);
        alt_prof.setVisible(false);
        alt_turma.setVisible(false);
        alt_disc.setVisible(true);
        cons_prof.setVisible(false);
        cons_turma.setVisible(false);
        cons_disc.setVisible(true);
        exc_prof.setVisible(false);
        exc_turma.setVisible(false);
        exc_disc.setVisible(true);
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
        btn_Turma = new javax.swing.JButton();
        btn_Disc = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_Prof = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        alt_disc = new javax.swing.JButton();
        cad_disc = new javax.swing.JButton();
        exc_disc = new javax.swing.JButton();
        cons_disc = new javax.swing.JButton();
        cad_prof = new javax.swing.JButton();
        cons_prof = new javax.swing.JButton();
        exc_prof = new javax.swing.JButton();
        alt_prof = new javax.swing.JButton();
        cad_turma = new javax.swing.JButton();
        alt_turma = new javax.swing.JButton();
        cons_turma = new javax.swing.JButton();
        exc_turma = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        btn_Turma.setBackground(new java.awt.Color(255, 255, 0));
        btn_Turma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Turma.setText("Turma");
        btn_Turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TurmaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Turma);
        btn_Turma.setBounds(160, 20, 120, 40);

        btn_Disc.setBackground(new java.awt.Color(255, 255, 0));
        btn_Disc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Disc.setText("Disciplina");
        btn_Disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DiscActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Disc);
        btn_Disc.setBounds(300, 20, 120, 40);

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sair");
        jPanel1.add(jButton3);
        jButton3.setBounds(450, 30, 70, 20);

        btn_Prof.setBackground(new java.awt.Color(255, 255, 0));
        btn_Prof.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Prof.setText("Professor");
        btn_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProfActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Prof);
        btn_Prof.setBounds(20, 20, 120, 40);

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Professor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(20, 20, 120, 40);

        alt_disc.setBackground(new java.awt.Color(255, 255, 0));
        alt_disc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alt_disc.setText("Alterar Displina");
        alt_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alt_discActionPerformed(evt);
            }
        });
        jPanel1.add(alt_disc);
        alt_disc.setBounds(460, 210, 210, 100);

        cad_disc.setBackground(new java.awt.Color(255, 255, 0));
        cad_disc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cad_disc.setText("Cadastrar Disciplina");
        cad_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_discActionPerformed(evt);
            }
        });
        jPanel1.add(cad_disc);
        cad_disc.setBounds(120, 210, 210, 100);

        exc_disc.setBackground(new java.awt.Color(255, 255, 0));
        exc_disc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exc_disc.setText("Excluir Disciplina");
        exc_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exc_discActionPerformed(evt);
            }
        });
        jPanel1.add(exc_disc);
        exc_disc.setBounds(460, 380, 210, 100);

        cons_disc.setBackground(new java.awt.Color(255, 255, 0));
        cons_disc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cons_disc.setText("Consultar Disciplina");
        cons_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_discActionPerformed(evt);
            }
        });
        jPanel1.add(cons_disc);
        cons_disc.setBounds(120, 380, 210, 100);

        cad_prof.setBackground(new java.awt.Color(255, 255, 0));
        cad_prof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cad_prof.setText("Cadastrar Professor");
        cad_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_profActionPerformed(evt);
            }
        });
        jPanel1.add(cad_prof);
        cad_prof.setBounds(120, 210, 210, 100);

        cons_prof.setBackground(new java.awt.Color(255, 255, 0));
        cons_prof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cons_prof.setText("Consultar Professor");
        cons_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_profActionPerformed(evt);
            }
        });
        jPanel1.add(cons_prof);
        cons_prof.setBounds(120, 380, 210, 100);

        exc_prof.setBackground(new java.awt.Color(255, 255, 0));
        exc_prof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exc_prof.setText("Excluir Professor");
        exc_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exc_profActionPerformed(evt);
            }
        });
        jPanel1.add(exc_prof);
        exc_prof.setBounds(460, 380, 210, 100);

        alt_prof.setBackground(new java.awt.Color(255, 255, 0));
        alt_prof.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alt_prof.setText("Alterar Professor");
        alt_prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alt_profActionPerformed(evt);
            }
        });
        jPanel1.add(alt_prof);
        alt_prof.setBounds(460, 210, 210, 100);

        cad_turma.setBackground(new java.awt.Color(255, 255, 0));
        cad_turma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cad_turma.setText("Cadastrar Turma");
        cad_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cad_turmaActionPerformed(evt);
            }
        });
        jPanel1.add(cad_turma);
        cad_turma.setBounds(120, 210, 210, 100);

        alt_turma.setBackground(new java.awt.Color(255, 255, 0));
        alt_turma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        alt_turma.setText("Alterar Turma");
        alt_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alt_turmaActionPerformed(evt);
            }
        });
        jPanel1.add(alt_turma);
        alt_turma.setBounds(460, 210, 210, 100);

        cons_turma.setBackground(new java.awt.Color(255, 255, 0));
        cons_turma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cons_turma.setText("Consultar Turma");
        cons_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cons_turmaActionPerformed(evt);
            }
        });
        jPanel1.add(cons_turma);
        cons_turma.setBounds(120, 380, 210, 100);

        exc_turma.setBackground(new java.awt.Color(255, 255, 0));
        exc_turma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exc_turma.setText("Excluir Turma");
        exc_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exc_turmaActionPerformed(evt);
            }
        });
        jPanel1.add(exc_turma);
        exc_turma.setBounds(460, 380, 210, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuAdmin.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 800, 105);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Principal (1).png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 120, 750, 460);

        jButton6.setText("jButton6");
        jPanel1.add(jButton6);
        jButton6.setBounds(90, 170, 73, 23);

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

    private void btn_DiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DiscActionPerformed
        disciplina();
    }//GEN-LAST:event_btn_DiscActionPerformed

    private void btn_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProfActionPerformed
        professor();
    }//GEN-LAST:event_btn_ProfActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void alt_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alt_discActionPerformed
        dispose();
        new alterar_disciplina().setVisible(true);
    }//GEN-LAST:event_alt_discActionPerformed

    private void cad_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_discActionPerformed
        dispose();
        new cadastrar_disciplina().setVisible(true);
    }//GEN-LAST:event_cad_discActionPerformed

    private void exc_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exc_discActionPerformed
        dispose();
        new excluir_disciplina().setVisible(true);
    }//GEN-LAST:event_exc_discActionPerformed

    private void cons_discActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_discActionPerformed
        dispose();
            new consultar_disciplina().setVisible(true);
    }//GEN-LAST:event_cons_discActionPerformed

    private void cad_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_profActionPerformed
        dispose();
        new cadastrar_professor().setVisible(true);
    }//GEN-LAST:event_cad_profActionPerformed

    private void cons_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_profActionPerformed
        dispose();
        new consultar_professor().setVisible(true);
    }//GEN-LAST:event_cons_profActionPerformed

    private void exc_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exc_profActionPerformed
        dispose();
        new excluir_professor().setVisible(true);
    }//GEN-LAST:event_exc_profActionPerformed

    private void alt_profActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alt_profActionPerformed
        dispose();
        new alterar_professor().setVisible(true);
    }//GEN-LAST:event_alt_profActionPerformed

    private void cad_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cad_turmaActionPerformed
        dispose();
        new cadastrar_turma().setVisible(true);
    }//GEN-LAST:event_cad_turmaActionPerformed

    private void alt_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alt_turmaActionPerformed
        dispose();
        new alterar_turma().setVisible(true);
    }//GEN-LAST:event_alt_turmaActionPerformed

    private void cons_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cons_turmaActionPerformed
        dispose();
        new consultar_turma().setVisible(true);
    }//GEN-LAST:event_cons_turmaActionPerformed

    private void exc_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exc_turmaActionPerformed
        dispose();
        new excluir_turma().setVisible(true);
    }//GEN-LAST:event_exc_turmaActionPerformed

    private void btn_TurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TurmaActionPerformed
        turma();
    }//GEN-LAST:event_btn_TurmaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alt_disc;
    private javax.swing.JButton alt_prof;
    private javax.swing.JButton alt_turma;
    private javax.swing.JButton btn_Disc;
    private javax.swing.JButton btn_Prof;
    private javax.swing.JButton btn_Turma;
    private javax.swing.JButton cad_disc;
    private javax.swing.JButton cad_prof;
    private javax.swing.JButton cad_turma;
    private javax.swing.JButton cons_disc;
    private javax.swing.JButton cons_prof;
    private javax.swing.JButton cons_turma;
    private javax.swing.JButton exc_disc;
    private javax.swing.JButton exc_prof;
    private javax.swing.JButton exc_turma;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
