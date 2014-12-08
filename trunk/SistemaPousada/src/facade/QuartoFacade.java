package facade;

import controller.QuartoController;

public class QuartoFacade {
  
  QuartoController quartoControle;
  
  public QuartoFacade() {
    quartoControle = new QuartoController();
  }
  
  public void cadastrarQuarto( int numeroQuarto, 
                               double valorDiaria, 
                               String tipoCama, 
                               String tipoClimatizacao ) {
    
    quartoControle.cadastrar( numeroQuarto, 
                              valorDiaria, 
                              tipoCama, 
                              tipoClimatizacao);
    
  }
  
  public void alterarQuarto( int numeroQuarto, 
                             double valorDiaria, 
                             String tipoCama, 
                             String tipoClimatizacao) {
    
    quartoControle.alterar( numeroQuarto, 
                            valorDiaria, 
                            tipoCama, 
                            tipoClimatizacao);
  }
  
  public void buscarAll( String nome ) {
    quartoControle.buscarAll(nome);
  }
  
  public void buscar( int id  ) {
    quartoControle.buscar(id);
  }
  
  public void excluir( int id  ) {
    quartoControle.excluir(id);
  }
}
