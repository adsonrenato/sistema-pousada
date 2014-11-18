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
public class ClienteTest extends TestCase {
  
  Cliente cliente = new Cliente( 1 ,"Roque", "Avenida");
  
  public ClienteTest(String testName) {
    super(testName);
  }

  public void testSomeMethod() {
  }
  
  public void testGetId() {
    assertEquals(1, cliente.getId());
  }
  
  public void testGetNome() {
    assertEquals("Roque", cliente.getNome());
  }
  
  public void testGetEndereco() {
    assertEquals("Avenida", cliente.getEndereco());
  }
}
