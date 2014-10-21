package view;

import dao.FuncionarioDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import model.Cliente;
import model.Funcionario;
import util.EventoBotoes;
import util.SysUtil;

public class CadFuncionario extends javax.swing.JDialog {
    
    Funcionario funcionarioConsulta;
    FuncionarioDao funcionarioDAO;
    
    public CadFuncionario(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        setTitle("Cadastro da Pousada");
        setLocationRelativeTo(null);
        
        URL url = getClass().getResource("/img/IconeTela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imagemTitulo);
        SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
        
        EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
        
        funcionarioDAO = new FuncionarioDao();
        
        jTableFuncionario.setModel(funcionarioDAO.carregarTabela("T",""));
        jTableFuncionario.setDefaultEditor(Object.class, null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsulta = new javax.swing.JPanel();
        jLabelConsulta = new javax.swing.JLabel();
        jLabelCodigoFuncionarioConsulta = new javax.swing.JLabel();
        jTextFieldCodigoFuncionarioConsulta = new javax.swing.JTextField();
        jScrollPaneTabelaFuncionario = new javax.swing.JScrollPane();
        jTableFuncionario = new javax.swing.JTable();
        jPanelCampos = new javax.swing.JPanel();
        jLabelGravacao = new javax.swing.JLabel();
        jLabelNomeFuncionario = new javax.swing.JLabel();
        jLabelEnderecoFuncionario = new javax.swing.JLabel();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jTextFieldEnderecoFuncionario = new javax.swing.JTextField();
        jLabelSalarioFuncionario = new javax.swing.JLabel();
        jTextFieldSalarioFuncionario = new javax.swing.JTextField();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonConsultar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelMeio = new javax.swing.JPanel();
        jPanelStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();

        jPanelConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelConsulta.setForeground(new java.awt.Color(42, 33, 33));

        jLabelCodigoFuncionarioConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCodigoFuncionarioConsulta.setText("Código do Funcionário:");

        jTextFieldCodigoFuncionarioConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCodigoFuncionarioConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoFuncionarioConsultaKeyPressed(evt);
            }
        });

        jTableFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFuncionario.setName(""); // NOI18N
        jTableFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFuncionarioMouseClicked(evt);
            }
        });
        jScrollPaneTabelaFuncionario.setViewportView(jTableFuncionario);

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addGroup(jPanelConsultaLayout.createSequentialGroup()
                        .addComponent(jLabelCodigoFuncionarioConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCodigoFuncionarioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPaneTabelaFuncionario))
                .addContainerGap())
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigoFuncionarioConsulta)
                    .addComponent(jTextFieldCodigoFuncionarioConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneTabelaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCampos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCampos.setName(""); // NOI18N

        jLabelNomeFuncionario.setText("Nome:");

        jLabelEnderecoFuncionario.setText("Endereço:");

        jLabelSalarioFuncionario.setText("Salário:");

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGravacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNomeFuncionario)
                                    .addComponent(jLabelEnderecoFuncionario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNomeFuncionario)
                                    .addComponent(jTextFieldEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addComponent(jLabelSalarioFuncionario)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFuncionario)
                    .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEnderecoFuncionario)
                    .addComponent(jTextFieldEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSalarioFuncionario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jLabelGravacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMeioLayout = new javax.swing.GroupLayout(jPanelMeio);
        jPanelMeio.setLayout(jPanelMeioLayout);
        jPanelMeioLayout.setHorizontalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelMeioLayout.setVerticalGroup(
            jPanelMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        jLabelStatus.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMeio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        
        EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
        SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
        limpaCampos();
        
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        
        EventoBotoes.editando(jPanelBotoes.getComponents(), jPanelStatus.getComponents(), jPanelCampos.getComponents(), "N", true);
        SysUtil.trocaPanels(jPanelMeio, jPanelCampos);               
        limpaCampos();
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        EventoBotoes.editando(jPanelBotoes.getComponents(), jPanelStatus.getComponents(), jPanelCampos.getComponents(),"E", true);
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (SysUtil.confirmDialog("Deseja excluir esse registro?", "Atenção")) {
          funcionarioDAO.excluirFuncionario(funcionarioConsulta);
          EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
          SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
          jLabelConsulta.setText("Registro excluído com sucesso !");
          limpaCampos();
        }
        jTableFuncionario.setModel(funcionarioDAO.carregarTabela("T",jTextFieldCodigoFuncionarioConsulta.getText()));
        
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        
        if(SysUtil.isEmpty(jPanelCampos.getComponents())) {
            if(jLabelStatus.getText().equals("Inserindo")) {
              funcionarioDAO.inserirFuncionario(new Funcionario(jTextFieldNomeFuncionario.getText(),
                                                    jTextFieldEnderecoFuncionario.getText(),
                                                    Double.parseDouble(jTextFieldSalarioFuncionario.getText())));
            }else if (jLabelStatus.getText().equals("Editando")) {
              funcionarioDAO.alterarFuncionario(funcionarioConsulta, new Funcionario(jTextFieldNomeFuncionario.getText(),
                                                    jTextFieldEnderecoFuncionario.getText(),
                                                    Double.parseDouble(jTextFieldSalarioFuncionario.getText())));
            }
            EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
            SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
            limpaCampos();
        }else{
            jLabelGravacao.setText("Preencha todos os campos !");
        }
        jLabelConsulta.setText("");
        jTableFuncionario.setModel(funcionarioDAO.carregarTabela("T",jTextFieldCodigoFuncionarioConsulta.getText()));
        
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if (SysUtil.confirmDialog("Deseja cancelar essa transação?", "Atenção")) {
            
            EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
            SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
            jLabelConsulta.setText("");
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldCodigoFuncionarioConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoFuncionarioConsultaKeyPressed

        if(!jTextFieldCodigoFuncionarioConsulta.getText().isEmpty()){
            jTableFuncionario.setModel(funcionarioDAO.carregarTabela("F",jTextFieldCodigoFuncionarioConsulta.getText()));
        } else if(jTextFieldCodigoFuncionarioConsulta.getText().isEmpty()) {
            jTableFuncionario.setModel(funcionarioDAO.carregarTabela("T",jTextFieldCodigoFuncionarioConsulta.getText()));
        }

    }//GEN-LAST:event_jTextFieldCodigoFuncionarioConsultaKeyPressed

    private void jTableFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFuncionarioMouseClicked
        
        if(evt.getClickCount() == 2 ) {

            funcionarioConsulta = funcionarioDAO.consultarFuncionario(jTableFuncionario.getValueAt(jTableFuncionario.getSelectedRow(), 1).toString());
            jTextFieldNomeFuncionario.setText(funcionarioConsulta.getNome());
            jTextFieldEnderecoFuncionario.setText(funcionarioConsulta.getEndereco());
            jTextFieldSalarioFuncionario.setText(String.format("%.2f",funcionarioConsulta.getSalario()));
            EventoBotoes.consultando(jPanelBotoes.getComponents(), jPanelStatus.getComponents(), jPanelCampos.getComponents());
            SysUtil.trocaPanels(jPanelMeio, jPanelCampos);
        }
    }//GEN-LAST:event_jTableFuncionarioMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadFuncionario dialog = new CadFuncionario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JLabel jLabelCodigoFuncionarioConsulta;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JLabel jLabelEnderecoFuncionario;
    private javax.swing.JLabel jLabelGravacao;
    private javax.swing.JLabel jLabelNomeFuncionario;
    private javax.swing.JLabel jLabelSalarioFuncionario;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPaneTabelaFuncionario;
    private javax.swing.JTable jTableFuncionario;
    private javax.swing.JTextField jTextFieldCodigoFuncionarioConsulta;
    private javax.swing.JTextField jTextFieldEnderecoFuncionario;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JTextField jTextFieldSalarioFuncionario;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        jTextFieldCodigoFuncionarioConsulta.setText("");
        jTextFieldNomeFuncionario.setText("");
        jTextFieldEnderecoFuncionario.setText("");
        jTextFieldSalarioFuncionario.setText("");
    }
}
