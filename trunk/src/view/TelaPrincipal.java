package view;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import util.SysUtil;

public class TelaPrincipal extends javax.swing.JFrame {

    public TelaPrincipal() {
        
        initComponents();
        //
        URL url = getClass().getResource("/img/IconeTela.png"); // url icone tela principal
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        //
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Pousadas");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);       
        setIconImage(imagemTitulo); 
    }
    
    /**
      * Este método é chamado de dentro do construtor para inicializar o formulário. 
      * ATENÇÃO: Não modifique este código. O conteúdo deste método é sempre 
      * Regenerado pelo editor de formulários.  
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpNomeEmpresa = new javax.swing.JPanel();
        jpMeio = new javax.swing.JPanel();
        jmBarra = new javax.swing.JMenuBar();
        jmReservas = new javax.swing.JMenu();
        jmiEfetuarReservas = new javax.swing.JMenuItem();
        jmiCancelarReservas = new javax.swing.JMenuItem();
        jmCadastros = new javax.swing.JMenu();
        jmiCadastroQuartos = new javax.swing.JMenuItem();
        jmiCadastroClientes = new javax.swing.JMenuItem();
        jmiCadastroFuncionarios = new javax.swing.JMenuItem();
        jmiCadastroPousada = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmiRelCustosLucros = new javax.swing.JMenuItem();
        jmiRelQuartos = new javax.swing.JMenuItem();
        jmiRelClientes = new javax.swing.JMenuItem();
        jmLancamentos = new javax.swing.JMenu();
        jmiLancEntrada = new javax.swing.JMenuItem();
        jmiLancSaida = new javax.swing.JMenuItem();
        jmSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("TelaPrincipal"); // NOI18N

        jpNomeEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        jpNomeEmpresa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jpNomeEmpresaLayout = new javax.swing.GroupLayout(jpNomeEmpresa);
        jpNomeEmpresa.setLayout(jpNomeEmpresaLayout);
        jpNomeEmpresaLayout.setHorizontalGroup(
            jpNomeEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        jpNomeEmpresaLayout.setVerticalGroup(
            jpNomeEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpMeioLayout = new javax.swing.GroupLayout(jpMeio);
        jpMeio.setLayout(jpMeioLayout);
        jpMeioLayout.setHorizontalGroup(
            jpMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpMeioLayout.setVerticalGroup(
            jpMeioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        jmReservas.setText("Reservas");

        jmiEfetuarReservas.setText("Efetuar Reservas");
        jmReservas.add(jmiEfetuarReservas);

        jmiCancelarReservas.setText("Confirmar\\Cancelar Reservas");
        jmReservas.add(jmiCancelarReservas);

        jmBarra.add(jmReservas);

        jmCadastros.setText("Cadastros");

        jmiCadastroQuartos.setText("Quartos");
        jmiCadastroQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroQuartosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastroQuartos);

        jmiCadastroClientes.setText("Clientes");
        jmiCadastroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroClientesActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastroClientes);

        jmiCadastroFuncionarios.setText("Funcionários");
        jmiCadastroFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroFuncionariosActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastroFuncionarios);

        jmiCadastroPousada.setText("Pousada");
        jmiCadastroPousada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCadastroPousadaActionPerformed(evt);
            }
        });
        jmCadastros.add(jmiCadastroPousada);

        jmBarra.add(jmCadastros);

        jmRelatorios.setText("Relatórios");

        jmiRelCustosLucros.setText("Custos e Lucros");
        jmRelatorios.add(jmiRelCustosLucros);

        jmiRelQuartos.setText("Quartos");
        jmRelatorios.add(jmiRelQuartos);

        jmiRelClientes.setText("Clientes");
        jmRelatorios.add(jmiRelClientes);

        jmBarra.add(jmRelatorios);

        jmLancamentos.setText("Lançamentos");

        jmiLancEntrada.setText("Entrada");
        jmLancamentos.add(jmiLancEntrada);

        jmiLancSaida.setText("Saída");
        jmLancamentos.add(jmiLancSaida);

        jmBarra.add(jmLancamentos);

        jmSair.setText("<html><u>S</u>air");
        jmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSairMouseClicked(evt);
            }
        });
        jmBarra.add(jmSair);

        setJMenuBar(jmBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpNomeEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpMeio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpNomeEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSairMouseClicked
        
        if ( SysUtil.confirmDialog("Realmente deseja sair do sistema?", "Atenção")) {
            this.dispose();
        } 
    }//GEN-LAST:event_jmSairMouseClicked

    private void jmiCadastroPousadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroPousadaActionPerformed
       
        CadPousada cadPousada = new CadPousada(null, true);
        cadPousada.setVisible(true);
        
    }//GEN-LAST:event_jmiCadastroPousadaActionPerformed

    private void jmiCadastroQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroQuartosActionPerformed
        
        CadQuarto cadQuarto = new CadQuarto(null, true);
        cadQuarto.setVisible(true);
        
    }//GEN-LAST:event_jmiCadastroQuartosActionPerformed

    private void jmiCadastroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroClientesActionPerformed
        
        CadCliente cadCliente = new CadCliente(null, true);
        cadCliente.setVisible(true);
        
    }//GEN-LAST:event_jmiCadastroClientesActionPerformed

    private void jmiCadastroFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCadastroFuncionariosActionPerformed
        
        CadFuncionario cadFuncionario = new CadFuncionario(null, true);
        cadFuncionario.setVisible(true);
        
    }//GEN-LAST:event_jmiCadastroFuncionariosActionPerformed

    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        new Locale("pt", "BR");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //TelaPrincipal telaPrincipal = new TelaPrincipal();
                //telaPrincipal.setVisible(true);
                
                Login login = new Login();
                login.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jmBarra;
    private javax.swing.JMenu jmCadastros;
    private javax.swing.JMenu jmLancamentos;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenu jmReservas;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiCadastroClientes;
    private javax.swing.JMenuItem jmiCadastroFuncionarios;
    private javax.swing.JMenuItem jmiCadastroPousada;
    private javax.swing.JMenuItem jmiCadastroQuartos;
    private javax.swing.JMenuItem jmiCancelarReservas;
    private javax.swing.JMenuItem jmiEfetuarReservas;
    private javax.swing.JMenuItem jmiLancEntrada;
    private javax.swing.JMenuItem jmiLancSaida;
    private javax.swing.JMenuItem jmiRelClientes;
    private javax.swing.JMenuItem jmiRelCustosLucros;
    private javax.swing.JMenuItem jmiRelQuartos;
    private javax.swing.JPanel jpMeio;
    private javax.swing.JPanel jpNomeEmpresa;
    // End of variables declaration//GEN-END:variables
}