/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FuncionarioDao1;
import java.util.List;
import model.Funcionario;

/**
 *
 * @author qualidade-2
 */
public class FuncionarioController {
  
  public FuncionarioController() {
    
  }
  
  public Funcionario cadastrar( String nome, String endereco, double salario ) {
    
    Funcionario funcionario = new Funcionario( nome, endereco, salario );
    FuncionarioDao1 funcionarioDao1 = new FuncionarioDao1();
    
    if(funcionarioDao1.salvar(funcionario)) {
      return funcionario;
    }else{
      return null;
    }
  }
  
  public Funcionario alterar( int id, String nome, String Endereco, double salario ) {
    return null;
  }
  
  public List buscarAll( String nome ) {
    return null;
  }
  
  public Funcionario buscar( int id ) {
    return null;
  }
  
  public Funcionario excluir( int id ) {
    return null;
  }
}
