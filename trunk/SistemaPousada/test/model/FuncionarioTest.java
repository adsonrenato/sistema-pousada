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
public class FuncionarioTest extends TestCase {
  
  Funcionario funcionario = new Funcionario(1, "Roque", "Avenida", 999.99);
  
  public FuncionarioTest(String testName) {
    super(testName);
  }

  public void testSomeMethod() {
  }
  
  public void testGetId() {
    assertEquals(1, funcionario.getId());
  }
  
  public void testGetNome() {
    assertEquals("Roque", funcionario.getNome());
  }
  
  public void testGetEndereco() {
    assertEquals("Avenida", funcionario.getEndereco());
  }
  
  public void testGetSalario() {
    assertEquals(999.99, funcionario.getSalario());
  }
  
}
