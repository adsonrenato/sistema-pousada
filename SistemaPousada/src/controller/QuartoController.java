/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.QuartoDao1;
import java.util.List;
import model.Quarto;

/**
 *
 * @author qualidade-2
 */
public class QuartoController {
  
  public QuartoController() {
    
  }
  
  public Quarto cadastrar( int numeroQuarto, 
                           double valorDiaria, 
                           String tipoCama, 
                           String tipoClimatizacao ) {
    
    Quarto quarto = new Quarto( numeroQuarto,
                                valorDiaria,
                                tipoCama,
                                tipoClimatizacao );
    
    QuartoDao1 quartoDao1 = new QuartoDao1();
    
    if(quartoDao1.salvar(quarto)) {
      return quarto;
    }else{
      return null;
    }
  }
  
  public Quarto alterar( int numeroQuarto, 
                         double valorDiaria, 
                         String tipoCama, 
                         String tipoClimatizacao ) {
    
    return null;
  }
  
  public List buscarAll( String nome ) {
    return null;
  }
  
  public Quarto buscar( int id ) {
    return null;
  }
  
  public Quarto excluir( int id ) {
    return null;
  }
}
