/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import controller.ClienteController;

/**
 *
 * @author qualidade-2
 */
public class ClienteFacade {
  
  ClienteController clienteController;
  
  public ClienteFacade() {
    clienteController = new ClienteController();
  }
  
  public void cadastrarCliente( String nome, String endereco ) {
    clienteController.cadastrar(nome, endereco);
  }
  
  public void alterarCliente( int id, String nome, String endereco  ) {
    clienteController.alterar(id, nome, endereco);
  }
  
  public void buscalAll( String nome ) {
    clienteController.buscarAll(nome);
  }
  
  public void buscar( int id ) {
    clienteController.buscar(id);
  }
  
  public void excluir( int id ) {
    clienteController.excluir(id);
  }
}
