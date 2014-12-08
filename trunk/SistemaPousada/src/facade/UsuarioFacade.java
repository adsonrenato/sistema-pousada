package facade;

import controller.UsuarioController;

public class UsuarioFacade {
  
  UsuarioController usuarioControle;
  
  public UsuarioFacade() {
    usuarioControle = new UsuarioController();
  }
  
  public void cadastrarUsuario( int id, String nome, int senha ) {
    
    usuarioControle.cadastrar(id, nome, senha);
  }
  
  public void alterarUsuario( int id, String nome, int senha) {
    
    usuarioControle.alterar(id, nome, senha);
  }
  
  public void buscarAll( String nome ) {
    usuarioControle.buscarAll(nome);
  }
  
  public void buscar( int id  ) {
    usuarioControle.buscar(id);
  }
  
  public void excluir( int id  ) {
    usuarioControle.excluir(id);
  }
}
