package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Quarto;
import util.Conexao;

public class QuartoDao {
    
    public void inserirQuarto( Quarto quarto ) {
        
        try {
            Conexao con = Conexao.getInstance();
            
            String SQL = "INSERT INTO quarto ( numQuarto, "
                        +"                     valorDiaria, "
                        +"                     tipoCama, "
                        +"                     tipoClima) "
                        +" VALUES ( ?, ?, ?, ?)";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            
            ps.setInt(1, quarto.getNumeroQuarto());
            ps.setDouble(2, quarto.getValorDiaria());
            ps.setString(3, quarto.getTipoCama());
            ps.setString(4, quarto.getTipoClimatizacao());

            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public Quarto consultarQuarto(String numeroQuarto) {
        try {

            Conexao con = Conexao.getInstance();
            Statement statement = con.getConexao().createStatement();
            ResultSet resultado = statement.executeQuery(
                    "SELECT * FROM quarto where numQuarto = '" + numeroQuarto+"'");
            System.out.println("SELECT * FROM quarto where numQuarto = '" + numeroQuarto+"'");
            while(resultado.next()){
                
                Quarto quarto = new Quarto(resultado.getInt("idQuarto"), 
                                           resultado.getInt("numQuarto"), 
                                           resultado.getDouble("valorDiaria"), 
                                           resultado.getString("tipoCama"),
                                           resultado.getString("tipoClima"));
                
                
                return quarto;
            }
            
            resultado.close();
            statement.close();
        
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public TableModel carregaTabela(String opcao, String filtro){
        
        DefaultTableModel model = new DefaultTableModel();
        
        String SQL = null; 
        
        if(opcao == "T") {
          SQL = "SELECT * FROM quarto";
        } else if (opcao == "F"){
          SQL = "SELECT * FROM quarto WHERE idQuarto = '" + filtro+"'";
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
    
    public void alterarQuarto( Quarto quartoOld, Quarto quartoNew ) {
         
        try {
            
            Conexao con = Conexao.getInstance();
            
            String SQL = "UPDATE quarto SET numQuarto = ?, "
                    + "                     valorDiaria = ?, "
                    + "                     tipoCama = ?, "
                    + "                     tipoClima = ? "
                    + " WHERE idQuarto = ? ";            
            
            PreparedStatement statement = con.getConexao().prepareStatement(SQL);
            
            statement.setInt    (1, quartoNew.getNumeroQuarto());
            statement.setDouble (2, quartoNew.getValorDiaria());
            statement.setString (3, quartoNew.getTipoCama());
            statement.setString (4, quartoNew.getTipoClimatizacao());
            statement.setInt    (5, quartoOld.getIdQuarto());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void excluirQuarto( Quarto quarto ) {
        try {
            
            Conexao con = Conexao.getInstance();
            
            String SQL = "DELETE FROM quarto WHERE idQuarto = ? ";            
            
            PreparedStatement statement = con.getConexao().prepareStatement(SQL);
            
            statement.setInt (1, quarto.getIdQuarto());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
