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
public class PousadaTest extends TestCase {
  
  Pousada pousada = new Pousada(1, 
                                "Razao Social", 
                                "Fantasia", 
                                "1234567890", 
                                "(75)1234-5678", 
                                "Avenida", 
                                123, 
                                10);
  
  public PousadaTest(String testName) {
    super(testName);
  }

  public void testSomeMethod() {
  }
  
  public void testGetId() {
    assertEquals(1, pousada.getId());
  }
  
  public void testGetRazaoSocial() {
    assertEquals("Razao Social", pousada.getRazaoSocial());
  }
  
  public void testGetFantasia() {
    assertEquals("Fantasia", pousada.getFantasia());
  }
  
  public void testGetCnpj() {
    assertEquals("1234567890", pousada.getCnpj());
  }
  
  public void testGetTelefone() {
    assertEquals("(75)1234-5678", pousada.getTelefone());
  }
  
  public void testEndereco() {
    assertEquals("Avenida", pousada.getEndereco());
  }
  
  public void testNumEndereco() {
    assertEquals(123, pousada.getNumEndereco());
  }
  
  public void testQuantQuarto() {
    assertEquals(10, pousada.getQuantQuarto());
  }
}