/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Quarto;
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
public class QuartoControllerTest {
  
  public QuartoControllerTest() {
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
   * Test of cadastrar method, of class QuartoController.
   */
  @Test
  public void testCadastrar() {
    System.out.println("cadastrar");
    int numeroQuarto = 0;
    double valorDiaria = 0.0;
    String tipoCama = "";
    String tipoClimatizacao = "";
    QuartoController instance = new QuartoController();
    Quarto expResult = null;
    Quarto result = instance.cadastrar(numeroQuarto, valorDiaria, tipoCama, tipoClimatizacao);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of alterar method, of class QuartoController.
   */
  @Test
  public void testAlterar() {
    System.out.println("alterar");
    int numeroQuarto = 0;
    double valorDiaria = 0.0;
    String tipoCama = "";
    String tipoClimatizacao = "";
    QuartoController instance = new QuartoController();
    Quarto expResult = null;
    Quarto result = instance.alterar(numeroQuarto, valorDiaria, tipoCama, tipoClimatizacao);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of buscarAll method, of class QuartoController.
   */
  @Test
  public void testBuscarAll() {
    System.out.println("buscarAll");
    String nome = "";
    QuartoController instance = new QuartoController();
    List expResult = null;
    List result = instance.buscarAll(nome);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of buscar method, of class QuartoController.
   */
  @Test
  public void testBuscar() {
    System.out.println("buscar");
    int id = 0;
    QuartoController instance = new QuartoController();
    Quarto expResult = null;
    Quarto result = instance.buscar(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of excluir method, of class QuartoController.
   */
  @Test
  public void testExcluir() {
    System.out.println("excluir");
    int id = 0;
    QuartoController instance = new QuartoController();
    Quarto expResult = null;
    Quarto result = instance.excluir(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
