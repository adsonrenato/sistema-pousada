package util;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Funções importantes para o sistema
 * @author Neto
 */
public class SysUtil {
    
    /**
    * retira simbolos da string:
    *   {, . / - ( )}
     * @param text String com os simbolos
     * @return String sem os simbolos.
    */
    public static String retirarSimbolos(String text) {
        
        String replace = text.replace("/", "").
                              replace(".", "").
                              replace("(", "").
                              replace(")", "").
                              replace("-", "").
                              replace(",", "");
        
        return replace;
    }
    
    /**
    * Tela de confirmação:
    * Utilizada para receber uma resposta do usuario positiva ou negativa
    * @param mensagem central do JoptionPane.
    * @param titulo do JoptionPane.
    * @return True se o usuário responder sim.
    */
    public static boolean confirmDialog(String mensagem, String titulo) {
        return JOptionPane.showConfirmDialog( 
                null, mensagem, titulo, javax.swing.JOptionPane.YES_NO_OPTION ) == 0;
    }
    
    /**
     * Coloca o segundo JPanel sobre o primeiro.
     * @param p1 Jpanel que deve desaparecer
     * @param p2 Jpanel que deve aparecer, sobre o primeiro
     */
    public static void trocaPanels(JPanel p1, JPanel p2 ) {   
        p1.removeAll();
        p2.setSize( new Dimension(p1.getWidth(), p1.getHeight()));
        p1.add(p2);
        p1.validate();
        p1.repaint();
        p2.setVisible(true);
    }
    
    public static JTextField text;
    public static JComboBox  combox;
    public static JFormattedTextField formatted;
    
    public static boolean isEmpty(Component[] comp) {
        
        boolean resultado = true;
        
        for (Component comp1 : comp) {
            if(comp1 instanceof JTextField) {
                text = (JTextField) comp1;
                if(text.getText().isEmpty()){
                  text.grabFocus();
                  resultado = false;
                }
            }
            if(comp1 instanceof JComboBox) {
                combox = (JComboBox) comp1;
                if(combox.getSelectedIndex() == -1) {
                  combox.grabFocus();
                  resultado = false;
                }
            }
            if(comp1 instanceof JFormattedTextField) {
                formatted = (JFormattedTextField) comp1;
                if(retirarSimbolos(formatted.getText()).isEmpty() ) {
                  formatted.grabFocus();
                  resultado = false;
                }
            }
        }
        return resultado;
    }
}
