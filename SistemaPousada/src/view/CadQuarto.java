package view;

import dao.QuartoDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import model.Quarto;
import util.EventoBotoes;
import util.SysUtil;



public class CadQuarto extends javax.swing.JDialog {
    
    Quarto quartoConsulta;
    QuartoDao quartoDAO;
    
    public CadQuarto(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        setTitle("Cadastro da Pousada");
        setLocationRelativeTo(null);
        
        URL url = getClass().getResource("/img/IconeTela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imagemTitulo);
        SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
        
        EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
        
        quartoDAO = new QuartoDao();
        
        jTableQuartos.setModel(quartoDAO.carregaTabela("T",""));
        jTableQuartos.setDefaultEditor(Object.class, null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCampos = new javax.swing.JPanel();
        jLabelGravacao = new javax.swing.JLabel();
        jLabelNumeroQuarto = new javax.swing.JLabel();
        jTextFieldNumeroQuarto = new javax.swing.JTextField();
        jTextFieldValorDiaria = new javax.swing.JTextField();
        jLabelValorDiaria = new javax.swing.JLabel();
        jLabelTipoQuarto = new javax.swing.JLabel();
        jComboBoxTipoCama = new javax.swing.JComboBox();
        jComboBoxTipoClima = new javax.swing.JComboBox();
        jPanelConsulta = new javax.swing.JPanel();
        jLabelConsulta = new javax.swing.JLabel();
        jLabelCodigoQuartoConsulta = new javax.swing.JLabel();
        jTextFieldCodigoQuartoConsulta = new javax.swing.JTextField();
        jScrollPaneTabelaQuartos = new javax.swing.JScrollPane();
        jTableQuartos = new javax.swing.JTable();
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

        jLabelNumeroQuarto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNumeroQuarto.setText("Número do Quarto");

        jTextFieldNumeroQuarto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldValorDiaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelValorDiaria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelValorDiaria.setText("Valor da Diária");

        jLabelTipoQuarto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTipoQuarto.setText("Tipo do Quarto");

        jComboBoxTipoCama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casal", "Solteiro" }));
        jComboBoxTipoCama.setSelectedIndex(-1);
        jComboBoxTipoCama.setToolTipText("");

        jComboBoxTipoClima.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ventilador", "Ar Condicionado" }));
        jComboBoxTipoClima.setSelectedIndex(-1);

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelGravacao, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNumeroQuarto)
                                    .addComponent(jLabelValorDiaria))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldValorDiaria)
                                    .addComponent(jTextFieldNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxTipoClima, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxTipoCama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelTipoQuarto))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumeroQuarto)
                    .addComponent(jTextFieldNumeroQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValorDiaria)
                    .addComponent(jTextFieldValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabelTipoQuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxTipoCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTipoClima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabelGravacao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabelConsulta.setForeground(new java.awt.Color(42, 33, 33));

        jLabelCodigoQuartoConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCodigoQuartoConsulta.setText("Código do Quarto:");

        jTextFieldCodigoQuartoConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCodigoQuartoConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoQuartoConsultaKeyPressed(evt);
            }
        });

        jTableQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número do Quarto", "Valor da Diária", "Tipo de Cama", "Tipo de Climatização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableQuartos.setName(""); // NOI18N
        jTableQuartos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableQuartosMouseClicked(evt);
            }
        });
        jScrollPaneTabelaQuartos.setViewportView(jTableQuartos);

        javax.swing.GroupLayout jPanelConsultaLayout = new javax.swing.GroupLayout(jPanelConsulta);
        jPanelConsulta.setLayout(jPanelConsultaLayout);
        jPanelConsultaLayout.setHorizontalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addGap(44, 44, 44))
            .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelConsultaLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPaneTabelaQuartos)
                        .addGroup(jPanelConsultaLayout.createSequentialGroup()
                            .addComponent(jLabelCodigoQuartoConsulta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldCodigoQuartoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 307, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanelConsultaLayout.setVerticalGroup(
            jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelConsultaLayout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addComponent(jLabelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelConsultaLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanelConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCodigoQuartoConsulta)
                        .addComponent(jTextFieldCodigoQuartoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPaneTabelaQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(47, Short.MAX_VALUE)))
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
            .addGap(0, 323, Short.MAX_VALUE)
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
          quartoDAO.excluirQuarto(quartoConsulta);
          EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
          SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
          jLabelConsulta.setText("Registro excluído com sucesso !");
          limpaCampos();
        }
        jTableQuartos.setModel(quartoDAO.carregaTabela("T",jTextFieldCodigoQuartoConsulta.getText()));
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        
        if(SysUtil.isEmpty(jPanelCampos.getComponents())) {
            if(jLabelStatus.getText().equals("Inserindo")) {
              quartoDAO.inserirQuarto( new Quarto(Integer.parseInt(jTextFieldNumeroQuarto.getText()), 
                                                  Double.parseDouble(jTextFieldValorDiaria.getText()), 
                                                  jComboBoxTipoCama.getSelectedItem().toString(), 
                                                  jComboBoxTipoClima.getSelectedItem().toString()));
            }else if (jLabelStatus.getText().equals("Editando")) {
              quartoDAO.alterarQuarto(quartoConsulta, new Quarto(Integer.parseInt(jTextFieldNumeroQuarto.getText()), 
                                                      Double.parseDouble(jTextFieldValorDiaria.getText()), 
                                                      jComboBoxTipoCama.getSelectedItem().toString(), 
                                                      jComboBoxTipoClima.getSelectedItem().toString()));
            }
            EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
            SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
            limpaCampos();
        }else{
            jLabelGravacao.setText("Preencha todos os campos !");
        }
        jLabelConsulta.setText("");
        jTableQuartos.setModel(quartoDAO.carregaTabela("T",jTextFieldCodigoQuartoConsulta.getText()));
        
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if (SysUtil.confirmDialog("Deseja cancelar essa transação?", "Atenção")) {
            
            EventoBotoes.inicio(jPanelBotoes.getComponents(), jPanelStatus.getComponents());
            SysUtil.trocaPanels(jPanelMeio, jPanelConsulta);
            jLabelConsulta.setText("");
            limpaCampos();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldCodigoQuartoConsultaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoQuartoConsultaKeyPressed
        if(!jTextFieldCodigoQuartoConsulta.getText().isEmpty()){
            jTableQuartos.setModel(quartoDAO.carregaTabela("F",jTextFieldCodigoQuartoConsulta.getText()));
        } else if(jTextFieldCodigoQuartoConsulta.getText().isEmpty()) {
            jTableQuartos.setModel(quartoDAO.carregaTabela("T",jTextFieldCodigoQuartoConsulta.getText()));
        }
    }//GEN-LAST:event_jTextFieldCodigoQuartoConsultaKeyPressed

    private void jTableQuartosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableQuartosMouseClicked

        if(evt.getClickCount() == 2 ) {

            quartoConsulta = quartoDAO.consultarQuarto(jTableQuartos.getValueAt(jTableQuartos.getSelectedRow(), 1).toString());
            jTextFieldNumeroQuarto.setText(String.format("%d",quartoConsulta.getNumeroQuarto()));
            jTextFieldValorDiaria.setText(String.format("%.2f", quartoConsulta.getValorDiaria()));
            jComboBoxTipoCama.setSelectedItem(quartoConsulta.getTipoCama());
            jComboBoxTipoClima.setSelectedItem(quartoConsulta.getTipoClimatizacao());

            EventoBotoes.consultando(jPanelBotoes.getComponents(), jPanelStatus.getComponents(), jPanelCampos.getComponents());
            SysUtil.trocaPanels(jPanelMeio, jPanelCampos);
        }
    }//GEN-LAST:event_jTableQuartosMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadQuarto dialog = new CadQuarto(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox jComboBoxTipoCama;
    private javax.swing.JComboBox jComboBoxTipoClima;
    private javax.swing.JLabel jLabelCodigoQuartoConsulta;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JLabel jLabelGravacao;
    private javax.swing.JLabel jLabelNumeroQuarto;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelTipoQuarto;
    private javax.swing.JLabel jLabelValorDiaria;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelConsulta;
    private javax.swing.JPanel jPanelMeio;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JScrollPane jScrollPaneTabelaQuartos;
    private javax.swing.JTable jTableQuartos;
    private javax.swing.JTextField jTextFieldCodigoQuartoConsulta;
    private javax.swing.JTextField jTextFieldNumeroQuarto;
    private javax.swing.JTextField jTextFieldValorDiaria;
    // End of variables declaration//GEN-END:variables

    private void limpaCampos() {
        jTextFieldCodigoQuartoConsulta.setText("");
        jTextFieldNumeroQuarto.setText("");
        jTextFieldValorDiaria.setText("");
        jComboBoxTipoCama.setSelectedIndex(-1);
        jComboBoxTipoClima.setSelectedIndex(-1);
    }
}
