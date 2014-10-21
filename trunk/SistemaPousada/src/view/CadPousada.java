package view;

import dao.PousadaDao;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import model.Pousada;
import util.SysUtil;

public class CadPousada extends javax.swing.JDialog {

    public CadPousada(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        setTitle("Cadastro da Pousada");
        setLocationRelativeTo(null);
        
// coloca o icone na tela
        URL url = getClass().getResource("/img/IconeTela.png"); // url icone tela principal
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imagemTitulo);

// desabilita botão consulta pois só existe uma pousada
        jButonConsultar.setEnabled(false);
        consultaDados();
        carregarDados();
        bloqueiaDesbloqueiaCampos(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jButonConsultar = new javax.swing.JButton();
        jButonNovo = new javax.swing.JButton();
        jButonEditar = new javax.swing.JButton();
        jButonExcluir = new javax.swing.JButton();
        jButonGravar = new javax.swing.JButton();
        jButonCancelar = new javax.swing.JButton();
        jPanelCampos = new javax.swing.JPanel();
        jLabelNomePousada = new javax.swing.JLabel();
        jLabelCnpj = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jTextFieldFormatCnpj = new javax.swing.JFormattedTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelFantasia = new javax.swing.JLabel();
        jTextFieldFantasia = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JFormattedTextField();
        jLabelQuantQuartos = new javax.swing.JLabel();
        jTextFieldQuantQuartos = new javax.swing.JTextField();
        jLabelStatusGravacao = new javax.swing.JLabel();
        jPanelStatus = new javax.swing.JPanel();
        jLabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButonConsultar.setText("Consultar");

        jButonNovo.setText("Novo");

        jButonEditar.setText("Editar");
        jButonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonEditarActionPerformed(evt);
            }
        });

        jButonExcluir.setText("Excluir");

        jButonGravar.setText("Gravar");
        jButonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonGravarActionPerformed(evt);
            }
        });

        jButonCancelar.setText("Cancelar");
        jButonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButonConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButonGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButonCancelar)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButonConsultar)
                    .addComponent(jButonNovo)
                    .addComponent(jButonEditar)
                    .addComponent(jButonExcluir)
                    .addComponent(jButonGravar)
                    .addComponent(jButonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelCampos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        jPanelCampos.setName(""); // NOI18N

        jLabelNomePousada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNomePousada.setText("Razão Social");

        jLabelCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelCnpj.setText("Cnpj");

        jLabelEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelEndereco.setText("Endereço");

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNumero.setText("Número");

        jTextFieldRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            jTextFieldFormatCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldFormatCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldEndereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextFieldNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldNumero.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabelTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTelefone.setText("Telefone");

        jLabelFantasia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelFantasia.setText("Fantasia");

        jTextFieldFantasia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        try {
            jTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextFieldTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelQuantQuartos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelQuantQuartos.setText("Quant. Quartos");

        jTextFieldQuantQuartos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabelStatusGravacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomePousada)
                            .addComponent(jLabelCnpj)
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelFantasia))
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                                    .addComponent(jTextFieldFormatCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFantasia)))
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addComponent(jLabelQuantQuartos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldQuantQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEndereco)
                            .addComponent(jLabelNumero))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelStatusGravacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePousada)
                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFantasia)
                    .addComponent(jTextFieldFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCnpj)
                    .addComponent(jTextFieldFormatCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelQuantQuartos)
                    .addComponent(jTextFieldQuantQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabelStatusGravacao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jLabelStatus.setText("  ");

        javax.swing.GroupLayout jPanelStatusLayout = new javax.swing.GroupLayout(jPanelStatus);
        jPanelStatus.setLayout(jPanelStatusLayout);
        jPanelStatusLayout.setHorizontalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStatusLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelStatusLayout.setVerticalGroup(
            jPanelStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonCancelarActionPerformed
        if ( SysUtil.confirmDialog("Deseja cancelar essa transação?", "ATENÇÃO")) {
            this.dispose();
        }
    }//GEN-LAST:event_jButonCancelarActionPerformed

    private void jButonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonEditarActionPerformed
        editarCampos();
    }//GEN-LAST:event_jButonEditarActionPerformed

    private void jButonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonGravarActionPerformed
        gravar();
    }//GEN-LAST:event_jButonGravarActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadPousada dialog = new CadPousada(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButonCancelar;
    private javax.swing.JButton jButonConsultar;
    private javax.swing.JButton jButonEditar;
    private javax.swing.JButton jButonExcluir;
    private javax.swing.JButton jButonGravar;
    private javax.swing.JButton jButonNovo;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelFantasia;
    private javax.swing.JLabel jLabelNomePousada;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelQuantQuartos;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatusGravacao;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JPanel jPanelStatus;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldFantasia;
    private javax.swing.JFormattedTextField jTextFieldFormatCnpj;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldQuantQuartos;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JFormattedTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
    
    private void consultaDados() {
        
        jButonNovo.setEnabled(false);
        jButonEditar.setEnabled(true);
        jButonExcluir.setEnabled(false);
        jButonGravar.setEnabled(false);
        jLabelStatus.setText("Consultando");
    }
    
    private void carregarDados() {
        
        Pousada pousada = new PousadaDao().consultar();
        
        if(pousada != null){
            jTextFieldRazaoSocial.setText(pousada.getRazaoSocial());
            jTextFieldFantasia.setText(pousada.getFantasia());
            jTextFieldFormatCnpj.setText(pousada.getCnpj());
            jTextFieldTelefone.setText(pousada.getTelefone());
            jTextFieldEndereco.setText(pousada.getEndereco());
            jTextFieldNumero.setText(String.format("%s",pousada.getNumEndereco()));
            jTextFieldQuantQuartos.setText(String.format("%s",pousada.getQuantQuarto()));
        }  
    }
    
    private void editarCampos(){
        
        bloqueiaDesbloqueiaCampos(true);
        jButonGravar.setEnabled(true);
        jButonEditar.setEnabled(false);
    }
    private void bloqueiaDesbloqueiaCampos(boolean opcao) {
        
        jTextFieldRazaoSocial.setEditable(opcao);
        jTextFieldFantasia.setEditable(opcao);
        jTextFieldFormatCnpj.setEditable(opcao);
        jTextFieldTelefone.setEditable(opcao);
        jTextFieldEndereco.setEditable(opcao);
        jTextFieldNumero.setEditable(opcao);
        jTextFieldQuantQuartos.setEditable(opcao);
    }
    
    private void gravar() {
        
        if(SysUtil.isEmpty(jPanelCampos.getComponents())) {
            
            Pousada pousada = new PousadaDao().consultar();

            if(pousada == null){
                new PousadaDao().inserir(new Pousada(
                                                jTextFieldRazaoSocial.getText(), 
                                                jTextFieldFantasia.getText(), 
                                                SysUtil.retirarSimbolos(jTextFieldFormatCnpj.getText()), 
                                                SysUtil.retirarSimbolos(jTextFieldTelefone.getText()),
                                                jTextFieldEndereco. getText(),
                                                Integer.parseInt(jTextFieldNumero.getText()),
                                                Integer.parseInt(jTextFieldQuantQuartos.getText())));
            } else {
                new PousadaDao().alterar(new Pousada(
                                                pousada.getId(),
                                                jTextFieldRazaoSocial.getText(), 
                                                jTextFieldFantasia.getText(), 
                                                SysUtil.retirarSimbolos(jTextFieldFormatCnpj.getText()), 
                                                SysUtil.retirarSimbolos(jTextFieldTelefone.getText()),
                                                jTextFieldEndereco. getText(),
                                                Integer.parseInt(jTextFieldNumero.getText()),
                                                Integer.parseInt(jTextFieldQuantQuartos.getText())));
            }
            
            bloqueiaDesbloqueiaCampos(false);
            jButonGravar.setEnabled(false);
            jButonEditar.setEnabled(true);
            jLabelStatusGravacao.setText("Dados gravados com sucesso !");
        } else {
            jLabelStatusGravacao.setText("Preencha todos os campos!");
        }
    }
}
