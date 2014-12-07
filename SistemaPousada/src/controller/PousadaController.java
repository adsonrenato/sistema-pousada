/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PousadaDao1;
import java.util.List;
import model.Pousada;

/**
 *
 * @author qualidade-2
 */
public class PousadaController {

  public PousadaController() {
  
  }
  
  public Pousada cadastrar( String razaoSocial, 
                            String fantasia, 
                            String cnpj, 
                            String telefone, 
                            String endereco, 
                            int numEndereco, 
                            int quantQuarto ) {
    
    Pousada pousada = new Pousada(razaoSocial, 
                                  fantasia, 
                                  cnpj, 
                                  telefone, 
                                  endereco,
                                  numEndereco, 
                                  quantQuarto);
    
    PousadaDao1 pousadaDao1 = new PousadaDao1();
    
    if(pousadaDao1.salvar(pousada)) {
      return pousada;
    }else{
      return null;
    }
  }
  
  public Pousada alterar( String razaoSocial, 
                          String fantasia, 
                          String cnpj, 
                          String telefone, 
                          String endereco, 
                          int numEndereco, 
                          int quantQuarto ) {
    
    return null;
  }
    
  public Pousada buscar( int id ) {
    return null;
  }
  
  public Pousada excluir( int id ) {
    return null;
  }
  
}
