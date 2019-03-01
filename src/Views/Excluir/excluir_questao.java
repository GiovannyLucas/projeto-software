/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Cadastrar;

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
public class cadastrar_prova extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdmin
     */
    public cadastrar_prova() {
        initComponents();
        AtualizaComboDisc();
        AtualizaComboTurma();
        AtualizaTable();
        AtualizaComboAssu();
        AtualizaComboQuestao();
        AtualizaTableAssu();
    }
    
    private void AtualizaTableAssu() {
        Connection con = Conexao.AbrirConexao();
        AssuntoDAO bd = new AssuntoDAO((com.mysql.jdbc.Connection) con);
        List<Assunto> lista = new ArrayList<>();
        lista = bd.Listar_Assunto();
        DefaultTableModel tbm = (DefaultTableModel) jTable1.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Assunto tab : lista) {
            tbm.addRow(new String[i]);
            jTable1.setValueAt(tab.getId(), i, 0);
            jTable1.setValueAt(tab.getNome(), i, 1);
            i++;
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    
    private void AtualizaComboQuestao(){
        Connection con = Conexao.AbrirConexao();
        QuestaoDAO sql = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        lista = sql.ListarComboQuestao();
        jCB_q1.addItem("");
        jCB_q2.addItem("");
        jCB_q3.addItem("");
        jCB_q4.addItem("");
        jCB_q5.addItem("");
        
        for (Questao b : lista) {
            jCB_q1.addItem(""+b.getId());
            jCB_q2.addItem(""+b.getId());
            jCB_q3.addItem(""+b.getId());
            jCB_q4.addItem(""+b.getId());
            jCB_q5.addItem(""+b.getId());
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    
    private void AtualizaTable() {
        Connection con = Conexao.AbrirConexao();
        QuestaoDAO bd = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        lista = bd.Listar_Questao();
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();
        
        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }
        
        int i = 0;
        for (Questao tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getId_assu(), i, 1);
            jTable.setValueAt(tab.getEnun(), i, 2);
            jTable.setValueAt(tab.getGab(), i, 3);
            i++;
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    
    private void AtualizaComboDisc(){
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
    
    private void AtualizaComboTurma(){
        Connection con = Conexao.AbrirConexao();
        TurmaDAO sql = new TurmaDAO((com.mysql.jdbc.Connection) con);
        List<Turma> lista = new ArrayList<>();
        lista = sql.ListarComboTurma();
        jCB_turma.addItem("");
        
        for (Turma b : lista) {
            jCB_turma.addItem(b.getSerie());
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    
    private void AtualizaComboAssu(){
        Connection con = Conexao.AbrirConexao();
        AssuntoDAO sql = new AssuntoDAO((com.mysql.jdbc.Connection) con);
        List<Assunto> lista = new ArrayList<>();
        lista = sql.ListarComboAssunto();
        jCB_assunto.addItem("");
        
        for (Assunto b : lista) {
            jCB_assunto.addItem(b.getNome());
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }
    
    private void AtualizaComboQuestao(int c){
        Connection con = Conexao.AbrirConexao();
        QuestaoDAO sql = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        lista = sql.ListarComboQuestaoEsp(c);
        jCB_q1.addItem("");
        jCB_q2.addItem("");
        jCB_q3.addItem("");
        jCB_q4.addItem("");
        jCB_q5.addItem("");
        
        for (Questao b : lista) {
            jCB_q1.addItem(""+b.getId());
            jCB_q2.addItem(""+b.getId());
            jCB_q3.addItem(""+b.getId());
            jCB_q4.addItem(""+b.getId());
            jCB_q5.addItem(""+b.getId());
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        id_assunto = new javax.swing.JTextField();
        btn_pesq_disci = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btn_pesq_disci1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jCB_disc = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jCB_assunto = new javax.swing.JComboBox<>();
        jCB_turma = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        btn_cad_disc = new javax.swing.JButton();
        jtf_id_disc = new javax.swing.JTextField();
        jtf_id_assunto = new javax.swing.JTextField();
        jtf_id_turma = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jCB_q1 = new javax.swing.JComboBox<>();
        jtf_id_q1 = new javax.swing.JTextField();
        jCB_q2 = new javax.swing.JComboBox<>();
        jtf_id_q2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jCB_q3 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jCB_q5 = new javax.swing.JComboBox<>();
        jtf_id_q5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jCB_q4 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jtf_id_q3 = new javax.swing.JTextField();
        jtf_id_q4 = new javax.swing.JTextField();
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

        jPanel3.setLayout(null);

        jTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Assunto", "Enunciado", "Gabarito"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(0, 130, 510, 250);
        jPanel3.add(id_assunto);
        id_assunto.setBounds(40, 50, 80, 40);

        btn_pesq_disci.setBackground(new java.awt.Color(0, 153, 0));
        btn_pesq_disci.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_disci.setText("Pesquisar");
        btn_pesq_disci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_disciActionPerformed(evt);
            }
        });
        jPanel3.add(btn_pesq_disci);
        btn_pesq_disci.setBounds(130, 50, 90, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("Assuntos:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(510, 100, 70, 30);

        btn_pesq_disci1.setBackground(new java.awt.Color(0, 153, 0));
        btn_pesq_disci1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_pesq_disci1.setText("Todos");
        btn_pesq_disci1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pesq_disci1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_pesq_disci1);
        btn_pesq_disci1.setBounds(510, 30, 90, 40);

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

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(510, 130, 120, 250);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("Pesquisar por código do assunto:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(30, 20, 220, 30);

        jTabbedPane1.addTab("Ver código das questões", jPanel3);

        jPanel2.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 0));
        jLabel17.setText("Assunto:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(30, 110, 290, 30);

        jCB_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_discActionPerformed(evt);
            }
        });
        jPanel2.add(jCB_disc);
        jCB_disc.setBounds(30, 50, 280, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setText("Disciplina:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(30, 20, 290, 30);

        jCB_assunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_assuntoActionPerformed(evt);
            }
        });
        jPanel2.add(jCB_assunto);
        jCB_assunto.setBounds(30, 140, 280, 40);

        jCB_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_turmaActionPerformed(evt);
            }
        });
        jPanel2.add(jCB_turma);
        jCB_turma.setBounds(30, 240, 280, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 0));
        jLabel18.setText("Turma:");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(30, 210, 290, 30);

        btn_cad_disc.setBackground(new java.awt.Color(0, 153, 0));
        btn_cad_disc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_cad_disc.setText("Cadastrar");
        btn_cad_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_discActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cad_disc);
        btn_cad_disc.setBounds(100, 310, 130, 50);

        jtf_id_disc.setEditable(false);
        jtf_id_disc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_discActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_id_disc);
        jtf_id_disc.setBounds(180, 50, 50, 40);

        jtf_id_assunto.setEditable(false);
        jtf_id_assunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_assuntoActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_id_assunto);
        jtf_id_assunto.setBounds(180, 140, 50, 40);

        jtf_id_turma.setEditable(false);
        jtf_id_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_turmaActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_id_turma);
        jtf_id_turma.setBounds(180, 240, 50, 40);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 0));
        jLabel19.setText("Questão 1 (código):");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(350, 10, 260, 30);

        jCB_q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_q1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCB_q1);
        jCB_q1.setBounds(350, 40, 250, 30);

        jtf_id_q1.setEditable(false);
        jtf_id_q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_q1ActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_id_q1);
        jtf_id_q1.setBounds(490, 40, 50, 30);

        jCB_q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_q2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCB_q2);
        jCB_q2.setBounds(350, 110, 250, 30);

        jtf_id_q2.setEditable(false);
        jtf_id_q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_q2ActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_id_q2);
        jtf_id_q2.setBounds(490, 110, 50, 30);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 153, 0));
        jLabel20.setText("Questão 2 (código):");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(350, 80, 260, 30);

        jCB_q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_q3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCB_q3);
        jCB_q3.setBounds(350, 180, 250, 30);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 153, 0));
        jLabel21.setText("Questão 3 (código):");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(350, 150, 260, 30);

        jCB_q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_q5ActionPerformed(evt);
            }
        });
        jPanel2.add(jCB_q5);
        jCB_q5.setBounds(350, 330, 250, 30);

        jtf_id_q5.setEditable(false);
        jtf_id_q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_q5ActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_id_q5);
        jtf_id_q5.setBounds(490, 330, 50, 30);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 153, 0));
        jLabel22.setText("Questão 5 (código):");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(350, 300, 260, 30);

        jCB_q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB_q4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCB_q4);
        jCB_q4.setBounds(350, 260, 250, 30);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 153, 0));
        jLabel23.setText("Questão 4 (código):");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(350, 230, 260, 30);

        jtf_id_q3.setEditable(false);
        jtf_id_q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_q3ActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_id_q3);
        jtf_id_q3.setBounds(490, 180, 50, 30);

        jtf_id_q4.setEditable(false);
        jtf_id_q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_id_q4ActionPerformed(evt);
            }
        });
        jPanel2.add(jtf_id_q4);
        jtf_id_q4.setBounds(490, 260, 50, 30);

        jTabbedPane1.addTab("Cadastrar prova", jPanel2);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(80, 140, 640, 410);

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
        String id_questao1 = jtf_id_q1.getText();
        String id_questao2 = jtf_id_q2.getText();
        String id_questao3 = jtf_id_q3.getText();
        String id_questao4 = jtf_id_q4.getText();
        String id_questao5 = jtf_id_q5.getText();
        String id_disc = jtf_id_disc.getText();
        String id_assu = jtf_id_assunto.getText();
        String id_turma = jtf_id_turma.getText();


        
        if (id_questao1.equals("") || id_questao2.equals("") || id_questao3.equals("") || id_questao4.equals("") || 
            id_questao5.equals("") || id_disc.equals("") || id_assu.equals("") || id_turma.equals("")) {
            JOptionPane.showMessageDialog(null, "Selecione todos os campos!", 
                    "Banco de questões", JOptionPane.WARNING_MESSAGE);
        } else {
            Connection con = Conexao.AbrirConexao();
            ProvaDAO sql = new ProvaDAO((com.mysql.jdbc.Connection) con);
            Prova a = new Prova();
            int id_q1 = Integer.parseInt(id_questao1);
            int id_q2 = Integer.parseInt(id_questao2);
            int id_q3 = Integer.parseInt(id_questao3);
            int id_q4 = Integer.parseInt(id_questao4);
            int id_q5 = Integer.parseInt(id_questao5);
            int id_d = Integer.parseInt(id_disc);
            int id_a = Integer.parseInt(id_assu);
            int id_t = Integer.parseInt(id_turma);
            
            a.setId_q1(id_q1);
            a.setId_q2(id_q2);
            a.setId_q3(id_q3);
            a.setId_q4(id_q4);
            a.setId_q5(id_q5);
            a.setId_disc(id_d);
            a.setId_assu(id_a);
            a.setId_turma(id_t);
            
            sql.Cadastrar_Prova(a);
            Conexao.FecharConexao((com.mysql.jdbc.Connection) con);

            jtf_id_q1.setText("");
            jtf_id_q2.setText("");
            jtf_id_q3.setText("");
            jtf_id_q4.setText("");
            jtf_id_q5.setText("");
            jtf_id_disc.setText("");
            jtf_id_assunto.setText("");
            jtf_id_turma.setText("");
            
            JOptionPane.showMessageDialog(null, "Prova cadastrada com sucesso!",
                    "Banco de questões", JOptionPane.INFORMATION_MESSAGE); 
            dispose();
            new cadastrar_prova().setVisible(true);
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

    private void jtf_id_assuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_assuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_assuntoActionPerformed

    private void jCB_assuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_assuntoActionPerformed
        Connection con = Conexao.AbrirConexao();
        AssuntoDAO sql = new AssuntoDAO((com.mysql.jdbc.Connection) con);
        List<Assunto> lista = new ArrayList<>();
        String nome = jCB_assunto.getSelectedItem().toString();

        lista = sql.ConsultaCodigoAssunto(nome);

        for (Assunto b : lista) {
            int a = b.getId();
            jtf_id_assunto.setText("" + a);
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jCB_assuntoActionPerformed

    private void jCB_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_turmaActionPerformed
       Connection con = Conexao.AbrirConexao();
        TurmaDAO sql = new TurmaDAO((com.mysql.jdbc.Connection) con);
        List<Turma> lista = new ArrayList<>();
        String serie = jCB_turma.getSelectedItem().toString();

        lista = sql.ConsultaCodigoTurma(serie);

        for (Turma b : lista) {
            int a = b.getId();
            jtf_id_turma.setText("" + a);
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jCB_turmaActionPerformed

    private void jtf_id_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_turmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_turmaActionPerformed

    private void jCB_q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_q1ActionPerformed
        Connection con = Conexao.AbrirConexao();
        QuestaoDAO sql = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        String questao = jCB_q1.getSelectedItem().toString();

        lista = sql.ConsultaCodigoQuestao(questao);

        for (Questao b : lista) {
            int a = b.getId();
            jtf_id_q1.setText("" + a);
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jCB_q1ActionPerformed

    private void jtf_id_q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_q1ActionPerformed

    private void jtf_id_q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_q2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_q2ActionPerformed

    private void jCB_q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_q2ActionPerformed
        Connection con = Conexao.AbrirConexao();
        QuestaoDAO sql = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        String questao = jCB_q2.getSelectedItem().toString();

        lista = sql.ConsultaCodigoQuestao(questao);

        for (Questao b : lista) {
            int a = b.getId();
            jtf_id_q2.setText("" + a);
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jCB_q2ActionPerformed

    private void jtf_id_q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_q5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_q5ActionPerformed

    private void jCB_q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_q3ActionPerformed
        Connection con = Conexao.AbrirConexao();
        QuestaoDAO sql = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        String questao = jCB_q3.getSelectedItem().toString();

        lista = sql.ConsultaCodigoQuestao(questao);

        for (Questao b : lista) {
            int a = b.getId();
            jtf_id_q3.setText("" + a);
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jCB_q3ActionPerformed

    private void jCB_q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_q5ActionPerformed
        Connection con = Conexao.AbrirConexao();
        QuestaoDAO sql = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        String questao = jCB_q5.getSelectedItem().toString();

        lista = sql.ConsultaCodigoQuestao(questao);

        for (Questao b : lista) {
            int a = b.getId();
            jtf_id_q5.setText("" + a);
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jCB_q5ActionPerformed

    private void jCB_q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB_q4ActionPerformed
        Connection con = Conexao.AbrirConexao();
        QuestaoDAO sql = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        String questao = jCB_q4.getSelectedItem().toString();

        lista = sql.ConsultaCodigoQuestao(questao);

        for (Questao b : lista) {
            int a = b.getId();
            jtf_id_q4.setText("" + a);
        }
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_jCB_q4ActionPerformed

    private void jtf_id_q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_q3ActionPerformed
        
    }//GEN-LAST:event_jtf_id_q3ActionPerformed

    private void jtf_id_q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_id_q4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_id_q4ActionPerformed

    private void btn_pesq_disciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_disciActionPerformed
        String codigo = id_assunto.getText();
        int cod = Integer.parseInt(codigo);

        Connection con = Conexao.AbrirConexao();
        QuestaoDAO bd = new QuestaoDAO((com.mysql.jdbc.Connection) con);
        List<Questao> lista = new ArrayList<>();
        lista = bd.Pesquisar_Cod_Questao_Assunto(cod);
        DefaultTableModel tbm = (DefaultTableModel) jTable.getModel();

        while (tbm.getRowCount() > 0) {
            tbm.removeRow(0);
        }

        int i = 0;
        for (Questao tab : lista) {
            tbm.addRow(new String[i]);
            jTable.setValueAt(tab.getId(), i, 0);
            jTable.setValueAt(tab.getId_assu(), i, 1);
            jTable.setValueAt(tab.getEnun(), i, 2);
            jTable.setValueAt(tab.getGab(), i, 3);
            i++;
        }
        id_assunto.setText("");
        Conexao.FecharConexao((com.mysql.jdbc.Connection) con);
    }//GEN-LAST:event_btn_pesq_disciActionPerformed

    private void btn_pesq_disci1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pesq_disci1ActionPerformed
        AtualizaTable();
        id_assunto.setText("");        
    }//GEN-LAST:event_btn_pesq_disci1ActionPerformed

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
            java.util.logging.Logger.getLogger(cadastrar_prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastrar_prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastrar_prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastrar_prova.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastrar_prova().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Assunto;
    private javax.swing.JButton btn_Prova;
    private javax.swing.JButton btn_Questao;
    private javax.swing.JButton btn_cad_disc;
    private javax.swing.JButton btn_pesq_disci;
    private javax.swing.JButton btn_pesq_disci1;
    private javax.swing.JTextField id_assunto;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCB_assunto;
    private javax.swing.JComboBox<String> jCB_disc;
    private javax.swing.JComboBox<String> jCB_q1;
    private javax.swing.JComboBox<String> jCB_q2;
    private javax.swing.JComboBox<String> jCB_q3;
    private javax.swing.JComboBox<String> jCB_q4;
    private javax.swing.JComboBox<String> jCB_q5;
    private javax.swing.JComboBox<String> jCB_turma;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtf_id_assunto;
    private javax.swing.JTextField jtf_id_disc;
    private javax.swing.JTextField jtf_id_q1;
    private javax.swing.JTextField jtf_id_q2;
    private javax.swing.JTextField jtf_id_q3;
    private javax.swing.JTextField jtf_id_q4;
    private javax.swing.JTextField jtf_id_q5;
    private javax.swing.JTextField jtf_id_turma;
    // End of variables declaration//GEN-END:variables
}
