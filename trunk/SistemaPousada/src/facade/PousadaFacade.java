/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import controller.PousadaController;

/**
 *
 * @author qualidade-2
 */
public class PousadaFacade {
  
  PousadaController pousadaController;
  
  public PousadaFacade() {
    pousadaController = new PousadaController();
  }
  
  public void cadastrarPousada( String razaoSocial, 
                                String fantasia, 
                                String cnpj, 
                                String telefone, 
                                String endereco, 
                                int numEndereco, 
                                int quantQuarto ) {
    
    pousadaController.cadastrar(razaoSocial, 
                                fantasia, 
                                cnpj, 
                                telefone, 
                                endereco, 
                                numEndereco, 
                                quantQuarto);
    
  }
  
  public void alterarPousada( String razaoSocial, 
                              String fantasia, 
                              String cnpj, 
                              String telefone, 
                              String endereco, 
                              int numEndereco, 
                              int quantQuarto ) {
    
    pousadaController.alterar(razaoSocial, 
                              fantasia, 
                              cnpj, 
                              telefone, 
                              endereco, 
                              numEndereco, 
                              quantQuarto);
  }
  
  public void buscarPousada( int id ) {
    pousadaController.buscar(id);
  }  
  
  public void excluir( int id ) {
    pousadaController.excluir(id);
  }
}
