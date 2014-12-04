package controller;
import dao.ClienteDao1;
import model.Cliente;

public class ClienteController {
  
  public ClienteController(){
    
  }
  
  public Cliente cadastrar( String nome, String endereco ){
    
    Cliente cliente = new Cliente(nome, endereco);
    ClienteDao1 clienteDao1 = new ClienteDao1();
    
    if(clienteDao1.salvar(cliente)){
      return cliente;
    }else{
      return null;
    }
  }
  
}