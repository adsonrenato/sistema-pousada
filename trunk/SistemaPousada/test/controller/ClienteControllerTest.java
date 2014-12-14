/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cliente;
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
    
    Cliente cliente = new ClienteController().cadastrar("Roque", "Teste");
    Cliente cliente2 = new ClienteController().cadastrar("", "Teste");
    Cliente cliente3 = new ClienteController().cadastrar("Roque", "");
    Cliente cliente4 = new ClienteController().cadastrar("", "");
    
    assertNotNull(cliente);
    assertNull(cliente2);
    assertNull(cliente3);
    assertNull(cliente4);
  }

  /**
   * Test of alterar method, of class ClienteController.
   */
  @Test
  public void testAlterar() {
    
    Cliente cliente = new ClienteController().alterar(1 ,"Roque", "Teste");
    Cliente cliente2 = new ClienteController().alterar(0 ,"Roque", "Teste");
    Cliente cliente3 = new ClienteController().alterar(1, "", "Teste");
    Cliente cliente4 = new ClienteController().alterar(0, "", "");
    
    assertNotNull(cliente);
    assertNull(cliente2);
    assertNull(cliente3);
    assertNull(cliente4);
  }

  /**
   * Test of buscar method, of class ClienteController.
   */
  @Test
  public void testBuscar() {
    
    Cliente cliente = new ClienteController().buscar(1);
    Cliente cliente2 = new ClienteController().buscar(0);
    
    assertNotNull(cliente);
    assertNull(cliente2);
  }

  /**
   * Test of excluir method, of class ClienteController.
   */
  @Test
  public void testExcluir() {
    Cliente cliente = new ClienteController().buscar(1);
    Cliente cliente2 = new ClienteController().buscar(0);
    
    assertNotNull(cliente);
    assertNull(cliente2);
  }
  
}
