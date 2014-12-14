package controller;

import dao.ClienteDao1;
import java.util.List;
import model.Cliente;

public class ClienteController {
  
  public ClienteController() {
    
  }
  
  public Cliente cadastrar( String nome, String endereco ) {
    
    Cliente cliente = new Cliente( nome, endereco );
    ClienteDao1 clienteDao1 = new ClienteDao1();
    
    if(nome.equals("") || endereco.equals("")){
      return null;
    } else {
      if(clienteDao1.salvar(cliente)) {
        return cliente;
      }
    }
    return null;
  }
  
  public Cliente alterar( int id, String nome, String endereco ) {
    
    Cliente cliente = new Cliente(nome, endereco);
    ClienteDao1 clienteDao1 = new ClienteDao1();
    
    if(id <= 0 || nome.equals("") || endereco.equals("")){
      return null;
    } else{
      if(clienteDao1.alterar(cliente)) {
        return cliente;
      }
    }
    return null;
  }
  
  public String buscarAll( String nome ) {
    
    ClienteDao1 clienteDao1 = new ClienteDao1();    
    List<Cliente> listaCliente = clienteDao1.buscar(nome);
    
    if(nome.equals("")){
      return "Nome vazio";
    }
    if(!(listaCliente == null)) {
      return "Ok";
    }else{
      return "Erro ao gravar";
    }
  }
  
  public Cliente buscar( int id ) {
    
    ClienteDao1 clienteDao1 = new ClienteDao1();
    Object cliente = clienteDao1.buscar(id);
    
    if(id <= 0) {
      return null;
    }else {
      if(!(cliente == null)){
        return (Cliente) cliente;
      }
    }
    
    return null;
  }
  
  public Cliente excluir( int id ) {
    
    ClienteDao1 clienteDao1 = new ClienteDao1();
    Cliente cliente = clienteDao1.excluir(clienteDao1.buscar(id));
    
    if(id <= 0) {
      return null;
    }else {
      if(!(cliente == null)){
        return (Cliente) cliente;
      }
    }
    
    return null;
  }
}