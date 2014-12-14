/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Cliente;

/**
 *
 * @author Neto
 */
public class ClienteDao1 implements InterfaceDao<Cliente>{

  @Override
  public boolean salvar(Cliente bean) {
    return true;
  }

  @Override
  public boolean alterar(Cliente bean) {
    return true;
  }

  @Override
  public List<Cliente> buscar(String nome) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Cliente buscar(int id) {
    
    Cliente cliente = new Cliente("Teste", "Teste");
    
    return cliente;
  }

  @Override
  public Cliente excluir(Cliente bean) {
    
    Cliente cliente = new Cliente("Teste", "Teste");
    
    return cliente;
  }
  
}
