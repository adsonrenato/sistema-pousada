/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import junit.framework.TestCase;

/**
 *
 * @author Neto
 */
public class PessoaTest extends TestCase {
  
  Pessoa pessoa = new Pessoa("Roque", "Avenida");
  
  public PessoaTest(String testName) {
    super(testName);
  }

  public void testSomeMethod() {
  }
  
  public void testGetNome(){
    assertEquals("Roque", pessoa.getNome());
  }
  
  public void testGetEndereco() {
    assertEquals("Avenida", pessoa.getEndereco());
  }
  
}
