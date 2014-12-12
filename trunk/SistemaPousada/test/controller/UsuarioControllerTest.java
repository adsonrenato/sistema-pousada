/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Usuario;
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
public class UsuarioControllerTest {
  
  public UsuarioControllerTest() {
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
   * Test of cadastrar method, of class UsuarioController.
   */
  @Test
  public void testCadastrar() {
    System.out.println("cadastrar");
    int id = 0;
    String nome = "";
    int senha = 0;
    UsuarioController instance = new UsuarioController();
    Usuario expResult = null;
    Usuario result = instance.cadastrar(id, nome, senha);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of alterar method, of class UsuarioController.
   */
  @Test
  public void testAlterar() {
    System.out.println("alterar");
    int id = 0;
    String nome = "";
    int senha = 0;
    UsuarioController instance = new UsuarioController();
    Usuario expResult = null;
    Usuario result = instance.alterar(id, nome, senha);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of buscarAll method, of class UsuarioController.
   */
  @Test
  public void testBuscarAll() {
    System.out.println("buscarAll");
    String nome = "";
    UsuarioController instance = new UsuarioController();
    List expResult = null;
    List result = instance.buscarAll(nome);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of buscar method, of class UsuarioController.
   */
  @Test
  public void testBuscar() {
    System.out.println("buscar");
    int id = 0;
    UsuarioController instance = new UsuarioController();
    Usuario expResult = null;
    Usuario result = instance.buscar(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of excluir method, of class UsuarioController.
   */
  @Test
  public void testExcluir() {
    System.out.println("excluir");
    int id = 0;
    UsuarioController instance = new UsuarioController();
    Usuario expResult = null;
    Usuario result = instance.excluir(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
