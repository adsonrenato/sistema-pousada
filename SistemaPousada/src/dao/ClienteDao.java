/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import util.Conexao;

/**
 *
 * @author Neto
 */
public class ClienteDao {

  private Cliente cliente;

  public void inserirCliente(Cliente cliente) {

    try {

      Conexao con = Conexao.getInstance();

      String SQL = "INSERT INTO cliente ( nome, "
              + "                     endereco) "
              + " VALUES ( ?, ? )";
      PreparedStatement ps = con.getConexao().prepareStatement(SQL);

      ps.setString(1, cliente.getNome());
      ps.setString(2, cliente.getEndereco());

      ps.executeUpdate();

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e);
    }
  }

  public Cliente consultarCliente(String nome) {

    try {

      Conexao con = Conexao.getInstance();
      Statement statement = con.getConexao().createStatement();
      ResultSet resultado = statement.executeQuery(
              "SELECT * FROM cliente where nome = '" + nome + "'");

      while (resultado.next()) {

        Cliente cliente = new Cliente(resultado.getInt("idcliente"),
                resultado.getString("nome"),
                resultado.getString("endereco"));

        return cliente;
      }

      resultado.close();
      statement.close();

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e);
    }
    return null;
  }

  public DefaultTableModel carregarTabela(String opcao, String filtro) {

    DefaultTableModel model = new DefaultTableModel();

    String SQL = null;

    if (opcao == "T" || filtro == "") {
      SQL = "SELECT * FROM cliente";
    } else if (opcao == "F" && filtro != null) {
      SQL = "SELECT * FROM cliente WHERE idcliente = '" + filtro + "'";
    }

    try {

      Conexao con = Conexao.getInstance();
      Statement statement = con.getConexao().createStatement();
      ResultSet resultado = statement.executeQuery(SQL);

      ResultSetMetaData metaData = resultado.getMetaData();

      int numberOfColumns = metaData.getColumnCount();
      Vector columnNames = new Vector();

      // Get the column names
      for (int column = 0; column < numberOfColumns; column++) {
        columnNames.addElement(metaData.getColumnLabel(column + 1));
      }

      // Get all rows.
      Vector rows = new Vector();

      while (resultado.next()) {
        Vector newRow = new Vector();

        for (int i = 1; i <= numberOfColumns; i++) {
          newRow.addElement(resultado.getObject(i));
        }

        rows.addElement(newRow);
      }

      resultado.close();
      statement.close();

      return new DefaultTableModel(rows, columnNames);

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e);
    }
    return null;
  }

  public void alterarCliente(Cliente clienteOld, Cliente clienteNew) {

    try {

      Conexao con = Conexao.getInstance();

      String SQL = "UPDATE cliente SET nome = ?, "
              + "                     endereco = ? "
              + " WHERE idcliente = ? ";

      PreparedStatement statement = con.getConexao().prepareStatement(SQL);

      statement.setString(1, clienteNew.getNome());
      statement.setString(2, clienteNew.getEndereco());
      statement.setInt(3, clienteOld.getId());

      statement.executeUpdate();

      statement.close();

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e);
    }
  }

  public void excluirClietne(Cliente cliente) {
    try {

      Conexao con = Conexao.getInstance();

      String SQL = "DELETE FROM cliente WHERE idCliente = ? ";

      PreparedStatement statement = con.getConexao().prepareStatement(SQL);

      statement.setInt(1, cliente.getId());

      statement.executeUpdate();

      statement.close();

    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, e);
    }
  }
}
