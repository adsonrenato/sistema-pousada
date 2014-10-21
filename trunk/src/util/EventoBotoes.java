package util;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EventoBotoes {
    
    public static JButton botao;
    public static JLabel label;
    public static JTextField field;
    public static JComboBox combox;
    
    public static void inicio(Component[] comp, Component[] comp1) {
        
        for(Component c : comp) {
            
            botao = (JButton) c;
            
            if(botao.getText() == "Consultar") {
                botao.setEnabled(false);
            }
            if(botao.getText() == "Novo"){
                botao.setEnabled(true);
            }
            if(botao.getText() == "Editar"){
                botao.setEnabled(false);
            }
            if(botao.getText() == "Excluir"){
                botao.setEnabled(false);
            }
            if(botao.getText() == "Gravar"){
                botao.setEnabled(false);
            }
            if(botao.getText() == "Cancelar"){
                botao.setEnabled(false);
            }
            
        }
        
        for(Component c2 : comp1){
          label = (JLabel) c2;
          label.setText("Consultando");
        }
    }
    
    public static void consultando(Component[] comp, Component[] comp1, Component[] comp2) {
        
        for(Component c : comp) {
            
            botao = (JButton) c;
            
            if(botao.getText() == "Consultar") {
                botao.setEnabled(true);
            }
            if(botao.getText() == "Novo"){
                botao.setEnabled(true);
            }
            if(botao.getText() == "Editar"){
                botao.setEnabled(true);
            }
            if(botao.getText() == "Excluir"){
                botao.setEnabled(true);
            }
            if(botao.getText() == "Gravar"){
                botao.setEnabled(false);
            }
            if(botao.getText() == "Cancelar"){
                botao.setEnabled(false);
            }
            
        }
        
        for(Component c1 : comp1){    
          label = (JLabel) c1;    
          label.setText("Consultando");
        }
        
        for(Component c2 : comp2) {
          if(c2 instanceof JTextField) {
            field = (JTextField) c2;
            field.setEnabled(false);
          }
          if(c2 instanceof JComboBox) {
            combox = (JComboBox) c2;
            combox.setEnabled(false);
          }
        }
    }
    
    public static void editando(Component[] comp, Component[] comp1, Component[] comp2, String status, boolean acao) {
        
        for(Component c : comp) {
            
            botao = (JButton) c;
            
            if(botao.getText() == "Consultar") {
                botao.setEnabled(false);
            }
            if(botao.getText() == "Novo"){
                botao.setEnabled(false);
            }
            if(botao.getText() == "Editar"){
                botao.setEnabled(false);
            }
            if(botao.getText() == "Excluir"){
                botao.setEnabled(false);
            }
            if(botao.getText() == "Gravar"){
                botao.setEnabled(true);
            }
            if(botao.getText() == "Cancelar"){
                botao.setEnabled(true);
            }
            
        }
        
        for(Component c1 : comp1){
          label = (JLabel) c1;
            if(status == "E")
              label.setText("Editando");
            if(status == "N")
              label.setText("Inserindo");
        }
        
        for(Component c2 : comp2) {
          if(c2 instanceof JTextField) {
            field = (JTextField) c2;
            field.setEnabled(acao);
          }
          if(c2 instanceof JComboBox) {
            combox = (JComboBox) c2;
            combox.setEnabled(acao);
          }
        }
    }
    
}
