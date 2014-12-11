/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UsuarioDao1;
import java.util.List;
import model.Usuario;

/**
 *
 * @author qualidade-2
 */
public class UsuarioController {
  
  public UsuarioController() {
    
  }
  
  public Usuario cadastrar( int id, String nome, int senha ) {
    
    Usuario usuario = new Usuario( id, nome, senha );
    
    UsuarioDao1 usuarioDao1 = new UsuarioDao1();
    
    if(usuarioDao1.salvar(usuario)) {
      return usuario;
    }else{
      return null;
    }
  }
  
  public Usuario alterar( int id, String nome, int senha ) {
    
    return null;
  }
  
  public List buscarAll( String nome ) {
    return null;
  }
  
  public Usuario buscar( int id ) {
    return null;
  }
  
  public Usuario excluir( int id ) {
    return null;
  }
}
