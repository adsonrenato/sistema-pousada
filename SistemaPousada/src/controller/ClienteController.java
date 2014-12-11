package controller;

import dao.ClienteDao1;
import java.util.List;
import model.Cliente;

public class ClienteController {
  
  public ClienteController() {
    
  }
  
  public String cadastrar( String nome, String endereco ) {
    
    Cliente cliente = new Cliente( nome, endereco );
    ClienteDao1 clienteDao1 = new ClienteDao1();
    
    if(nome.equals("")){
      return "Nome vazio";
    }
    if(endereco.equals("")){
      return "Endereco vazio";
    }
    if(clienteDao1.salvar(cliente)) {
      return "Ok";
    }else{
      return "Erro ao gravar";
    }
  }
  
  public String alterar( int id, String nome, String endereco ) {
    
    Cliente cliente = new Cliente(nome, endereco);
    ClienteDao1 clienteDao1 = new ClienteDao1();
    
    if(id <= 0) {
      return "Id vazio";
    }
    if(nome.equals("")){
      return "Nome vazio";
    }
    if(endereco.equals("")){
      return "Endereco vazio";
    }
    if(clienteDao1.alterar(cliente)){
      return "Ok";
    }else {    
      return "Erro ao gravar";
    }
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
  
  public String buscar( int id ) {
    
    ClienteDao1 clienteDao1 = new ClienteDao1();
    Object cliente = clienteDao1.buscar(id);
    
    if(id <= 0) {
      return "Id vazio";
    }
    if(!(cliente == null)){
      return "Ok";
    }else{
      return "Erro ao gravar";
    }
  }
  
  public String excluir( int id ) {
    
    ClienteDao1 clienteDao1 = new ClienteDao1();
    Cliente cliente = clienteDao1.excluir(clienteDao1.buscar(id));
    
    if(id <= 0) {
      return "Id vazio";
    }
    if(!(cliente == null)){
      return "Ok";
    }else{
      return "Erro ao gravar";
    }
  }
}