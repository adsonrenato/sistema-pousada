/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author qualidade-2
 */
public class ClienteControllerTest {
  
  public ClienteControllerTest() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  /**
   * Test of cadastrar method, of class ClienteController.
   */
  @Test
  public void testCadastrar() {
    System.out.println("cadastrar");
    String nome = "";
    String endereco = "";
    ClienteController instance = new ClienteController();
    String expResult = "";
    String result = instance.cadastrar(nome, endereco);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of alterar method, of class ClienteController.
   */
  @Test
  public void testAlterar() {
    System.out.println("alterar");
    int id = 0;
    String nome = "";
    String endereco = "";
    ClienteController instance = new ClienteController();
    String expResult = "";
    String result = instance.alterar(id, nome, endereco);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of buscarAll method, of class ClienteController.
   */
  @Test
  public void testBuscarAll() {
    System.out.println("buscarAll");
    String nome = "";
    ClienteController instance = new ClienteController();
    String expResult = "";
    String result = instance.buscarAll(nome);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of buscar method, of class ClienteController.
   */
  @Test
  public void testBuscar() {
    System.out.println("buscar");
    int id = 0;
    ClienteController instance = new ClienteController();
    String expResult = "";
    String result = instance.buscar(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of excluir method, of class ClienteController.
   */
  @Test
  public void testExcluir() {
    System.out.println("excluir");
    int id = 0;
    ClienteController instance = new ClienteController();
    String expResult = "";
    String result = instance.excluir(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
