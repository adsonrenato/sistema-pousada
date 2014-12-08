package facade;

import controller.FuncionarioController;

public class FuncionarioFacade {
  
  FuncionarioController funcionarioController;
  
  public FuncionarioFacade() {
    funcionarioController = new FuncionarioController();
  }
  
  public void cadastrarCliente( String nome, String endereco, double salario ) {
    funcionarioController.cadastrar(nome, endereco, salario);
  }
  
  public void alterarCliente( int id, String nome, String endereco, double salario   ) {
    funcionarioController.alterar(id, nome, endereco, salario );
  }
  
  public void buscalAll( String nome ) {
    funcionarioController.buscarAll(nome);
  }
  
  public void buscar( int id ) {
    funcionarioController.buscar(id);
  }
  
  public void excluir( int id ) {
    funcionarioController.excluir(id);
  }
}
