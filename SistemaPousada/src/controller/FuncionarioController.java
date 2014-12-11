package controller;

import dao.FuncionarioDao1;
import java.util.List;
import model.Funcionario;

public class FuncionarioController {
  
  public FuncionarioController() {
    
  }
  
  public String cadastrar( String nome, String endereco, double salario ) {
    
    Funcionario funcionario = new Funcionario( nome, endereco, salario );
    FuncionarioDao1 funcionarioDao1 = new FuncionarioDao1();
    
    if(nome.equals("")) {
      return "Nome vazio";
    }
    if(endereco.equals("")) {
      return "Endereco vazio";
    }
    if(salario <= 0.00) {
      return "Salário vazio";
    }
    if(funcionarioDao1.salvar(funcionario)) {
      return "Ok";
    }else{
      return "Erro ao gravar";
    }
  }
  
  public String alterar( int id, String nome, String endereco, double salario ) {
    
    Funcionario funcionario = new Funcionario( id, nome, endereco, salario );
    FuncionarioDao1 funcionarioDao1 = new FuncionarioDao1();
    
    if(id <= 0) {
      return "Id vazio";
    }
    if(nome.equals("")) {
      return "Nome vazio";
    }
    if(endereco.equals("")) {
      return "Endereco vazio";
    }
    if(salario <= 0.00) {
      return "Salário vazio";
    }
    if(funcionarioDao1.alterar(funcionario)) {
      return "Ok";
    }else{
      return "Erro ao gravar";
    }
  }
  
  public String buscarAll( String nome ) {
    
    FuncionarioDao1 funcionarioDao = new FuncionarioDao1();
    List<Funcionario> listaFuncionarios = funcionarioDao.buscar(nome);
    
    if(nome.equals("")){
      return "Nome vazio";
    }
    if(!(listaFuncionarios == null)) {
      return "Ok";
    }else{
      return "Erro ao gravar";
    }
    
  }
  
  public Funcionario buscar( int id ) {
    return null;
  }
  
  public Funcionario excluir( int id ) {
    return null;
  }
}
