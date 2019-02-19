/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.DisciplinaC;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DisciplinaM;

/**
 *
 * @author vinicius
 */
public class DisciplinaV extends javax.swing.JInternalFrame {

    public DisciplinaC dc = new DisciplinaC();
    public DisciplinaM dm;
    public ResultSet dados;
    public DefaultTableModel dt;

    /**
     * Creates new form DisciplinaV
     */
    public DisciplinaV() {
        initComponents();
        super.setTitle("Disciplina");
        String[] nomeColunas = {"Codigo", "Nome", "CH", "Semestre", "Nome Professor"};
        dt = new DefaultTableModel(nomeColunas, 5);
        Jtabela.setModel(dt);

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTcodigo = new javax.swing.JTextField();
        JTnome = new javax.swing.JTextField();
        JBcadastrar = new javax.swing.JButton();
        JBatualizar = new javax.swing.JButton();
        JBlimpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtabela = new javax.swing.JTable();
        Jcodconsulta = new javax.swing.JTextField();
        JBconsulta = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTcargahoraria = new javax.swing.JTextField();
        JTsemestre = new javax.swing.JTextField();
        JTprofessor = new javax.swing.JTextField();
        JBexcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestão de Disciplina"));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nome");

        JBcadastrar.setText("Cadastrar");
        JBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar(evt);
            }
        });

        JBatualizar.setText("Atualizar");
        JBatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizar(evt);
            }
        });

        JBlimpar.setText("Limpar");
        JBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta de Curso"));

        Jtabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Jtabela);

        JBconsulta.setText("Consulta");
        JBconsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulta(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Jcodconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBconsulta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jcodconsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBconsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setText("Carga Horaria:");

        jLabel5.setText("Semestre:");

        jLabel6.setText("Professor:");

        JBexcluir.setText("Excluir");
        JBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBcadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(JBatualizar)
                        .addGap(18, 18, 18)
                        .addComponent(JBlimpar)
                        .addGap(18, 18, 18)
                        .addComponent(JBexcluir)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JTnome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTcargahoraria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                .addComponent(JTsemestre, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(JTprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(JTcargahoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTsemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTprofessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcadastrar)
                    .addComponent(JBatualizar)
                    .addComponent(JBlimpar)
                    .addComponent(JBexcluir))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar
        try {
            dm = new DisciplinaM(Integer.parseInt(JTcodigo.getText()), JTnome.getText(), Integer.parseInt(JTcargahoraria.getText()), Integer.parseInt(JTsemestre.getText()), JTprofessor.getText());
            dc.salvarDisciplina(dm);
            JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso!");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Informado Invalido!");
        }
    }//GEN-LAST:event_cadastrar

    private void atualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizar
        try {
            dm = new DisciplinaM(Integer.parseInt(JTcodigo.getText()), JTnome.getText(), Integer.parseInt(JTcargahoraria.getText()), Integer.parseInt(JTsemestre.getText()), JTprofessor.getText());
            dc.atualizarDisciplina(dm);
            JOptionPane.showMessageDialog(null, "Atualização Realizada com Sucesso!");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Informado Invalido!");
        }

    }//GEN-LAST:event_atualizar

    private void limpar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar
        JTcodigo.setText("");
        JTnome.setText("");
        JTcargahoraria.setText("");
        JTsemestre.setText("");
        JTprofessor.setText("");
    }//GEN-LAST:event_limpar

    private void excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir
          try {
            dc.deletarPorCodigo(Integer.parseInt(JTcodigo.getText()));
            JOptionPane.showMessageDialog(null, "Exclusão Realizada com Sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor Informado Invalido!");

        }
    }//GEN-LAST:event_excluir

    private void consulta(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulta
         try {
            if (Jcodconsulta.getText().equals("")) {
                dados = dc.buscarDisciplina();
            } else {
                dados = dc.buscarDisciplinaCodigo(Integer.parseInt(Jcodconsulta.getText()));
            }
            int linha = 0;
            while (dados.next()) {
                dt.setNumRows(linha + 1);
                for (int coluna = 1; coluna <= 3; coluna++) {
                    Jtabela.setValueAt(dados.getString(coluna), linha, coluna - 1);
                }
                linha++;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de SQL");
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Valor Informado Invalido!");
        }
    }//GEN-LAST:event_consulta


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBatualizar;
    private javax.swing.JButton JBcadastrar;
    private javax.swing.JButton JBconsulta;
    private javax.swing.JButton JBexcluir;
    private javax.swing.JButton JBlimpar;
    private javax.swing.JTextField JTcargahoraria;
    private javax.swing.JTextField JTcodigo;
    private javax.swing.JTextField JTnome;
    private javax.swing.JTextField JTprofessor;
    private javax.swing.JTextField JTsemestre;
    private javax.swing.JTextField Jcodconsulta;
    private javax.swing.JTable Jtabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}