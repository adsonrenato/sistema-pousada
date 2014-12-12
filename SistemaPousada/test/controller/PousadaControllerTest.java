/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Pousada;
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
public class PousadaControllerTest {
  
  public PousadaControllerTest() {
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
   * Test of cadastrar method, of class PousadaController.
   */
  @Test
  public void testCadastrar() {
    System.out.println("cadastrar");
    String razaoSocial = "";
    String fantasia = "";
    String cnpj = "";
    String telefone = "";
    String endereco = "";
    int numEndereco = 0;
    int quantQuarto = 0;
    PousadaController instance = new PousadaController();
    Pousada expResult = null;
    Pousada result = instance.cadastrar(razaoSocial, fantasia, cnpj, telefone, endereco, numEndereco, quantQuarto);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of alterar method, of class PousadaController.
   */
  @Test
  public void testAlterar() {
    System.out.println("alterar");
    String razaoSocial = "";
    String fantasia = "";
    String cnpj = "";
    String telefone = "";
    String endereco = "";
    int numEndereco = 0;
    int quantQuarto = 0;
    PousadaController instance = new PousadaController();
    Pousada expResult = null;
    Pousada result = instance.alterar(razaoSocial, fantasia, cnpj, telefone, endereco, numEndereco, quantQuarto);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of buscar method, of class PousadaController.
   */
  @Test
  public void testBuscar() {
    System.out.println("buscar");
    int id = 0;
    PousadaController instance = new PousadaController();
    Pousada expResult = null;
    Pousada result = instance.buscar(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of excluir method, of class PousadaController.
   */
  @Test
  public void testExcluir() {
    System.out.println("excluir");
    int id = 0;
    PousadaController instance = new PousadaController();
    Pousada expResult = null;
    Pousada result = instance.excluir(id);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
