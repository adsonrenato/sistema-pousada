package controller;
import dao.ClienteDao1;
import java.util.List;
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
  
  public Cliente alterar(int id, String nome, String Endereco){
    return null;
  }
  
  public List buscarAll(String nome) {
    return null;
  }
  
  public Cliente buscar(int id) {
    return null;
  }
  
  public Cliente excluir(int id){
    return null;
  }
}