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
import model.Funcionario;
import util.Conexao;

public class FuncionarioDao {
    
    public void inserirFuncionario( Funcionario funcionario ) {
        
        try {
            
            Conexao con = Conexao.getInstance();
            
            String SQL = "INSERT INTO funcionario ( nome, "
                        +"                          endereco,"
                        +"                          salario ) "
                        +" VALUES ( ?, ? , ?)";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getEndereco());
            ps.setDouble(3, funcionario.getSalario());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Funcionario consultarFuncionario(String nome) {
        
        try {
            
            Conexao con = Conexao.getInstance();
            Statement statement = con.getConexao().createStatement();
            ResultSet resultado = statement.executeQuery(
                    "SELECT * FROM funcionario where nome = '" + nome + "'");

            while(resultado.next()){

                Funcionario funcionario = new Funcionario(resultado.getInt("idfuncionario"), 
                                                          resultado.getString("nome"),
                                                          resultado.getString("endereco"),
                                                          resultado.getDouble("salario"));


                return funcionario;
            }

            resultado.close();
            statement.close();
        
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
    }
        
    public DefaultTableModel carregarTabela( String opcao, String filtro ) {
        
        DefaultTableModel model = new DefaultTableModel();
        
        String SQL = null; 
        
        if(opcao == "T") {
            SQL = "SELECT * FROM funcionario";
        } else if (opcao == "F"){
            SQL = "SELECT * FROM funcionario WHERE idfuncionario = '" + filtro +"'";
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
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    
    public void alterarFuncionario( Funcionario funcionarioOld, Funcionario funcionarioNew ) {
        
        try {
            
            Conexao con = Conexao.getInstance();
            
            String SQL = "UPDATE funcionario SET nome = ?, "
                    + "                      endereco = ?, "
                    + "                      salario = ? "
                    + " WHERE idfuncionario = ? ";            
            
            PreparedStatement statement = con.getConexao().prepareStatement(SQL);
            
            statement.setString (1, funcionarioNew.getNome());
            statement.setString (2, funcionarioNew.getEndereco());
            statement.setDouble (3, funcionarioNew.getSalario());
            statement.setInt    (4, funcionarioOld.getId());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void excluirFuncionario( Funcionario funcionario ) {
        try {
            
            Conexao con = Conexao.getInstance();
            
            String SQL = "DELETE FROM funcionario WHERE idFuncionario = ? ";            
            
            PreparedStatement statement = con.getConexao().prepareStatement(SQL);
            
            statement.setInt (1, funcionario.getId());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
