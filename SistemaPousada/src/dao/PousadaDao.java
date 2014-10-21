
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Pousada;
import util.Conexao;

public class PousadaDao {
    
    
    public void inserir( Pousada empresa ) {
        
        try {
            Conexao con = Conexao.getInstance();
            
            String SQL = "INSERT INTO pousada ( razaoSocial, "
                        +"                      fantasia, "
                        +"                      cnpj, "
                        +"                      endereco, "
                        +"                      numero, "
                        +"                      telefone,"
                        +"                      quantQuartos) "
                        +" VALUES (?,?,?,?,?,?,?)";
            
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            
            ps.setString(1, empresa.getRazaoSocial());
            ps.setString(2, empresa.getFantasia());
            ps.setString(3, String.format("%s", empresa.getCnpj()));
            ps.setString(4, empresa.getEndereco());
            ps.setInt(5, empresa.getNumEndereco());
            ps.setString(6, String.format("%s", empresa.getTelefone()));
            ps.setInt(7, empresa.getQuantQuarto());
            
            ps.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public Pousada consultar() {
        
        try {

            Conexao con = Conexao.getInstance();
            Statement statement = con.getConexao().createStatement();
            ResultSet resultado = statement.executeQuery("SELECT * FROM pousada");
            
            while(resultado.next()){
                
                
                int id = resultado.getInt("idpousada");
                String razao = resultado.getString("razaoSocial");
                String fantaisa = resultado.getString("fantasia");
                String cnpj = resultado.getString("cnpj");
                String telefone = resultado.getString("telefone");
                String endereco = resultado.getString("endereco");
                int numende = resultado.getInt("numero");
                int quartos = resultado.getInt("quantQuartos");
                
                Pousada pousada = new Pousada(id, razao, fantaisa, cnpj, telefone, endereco, numende, quartos);
                return pousada;
            }
            
            resultado.close();
            statement.close();
        
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public void alterar( Pousada pousada ) {
        try {
            
            Conexao con = Conexao.getInstance();
            
            String SQL = "UPDATE pousada SET  razaoSocial = ?, "
                        +"                    fantasia = ?, "
                        +"                    cnpj = ?, "
                        +"                    endereco = ?, "
                        +"                    numero = ?, "
                        +"                    telefone = ?,"
                        +"                    quantQuartos = ?"
                        +" WHERE idpousada = ?";
            
            PreparedStatement statement = con.getConexao().prepareStatement(SQL);
            
            statement.setString(1, pousada.getRazaoSocial());
            statement.setString(2, pousada.getFantasia());
            statement.setString(3, pousada.getCnpj());
            statement.setString(4, pousada.getEndereco());
            statement.setInt   (5, pousada.getNumEndereco());
            statement.setString(6, pousada.getTelefone());
            statement.setInt   (7, pousada.getQuantQuarto());
            statement.setInt   (8, pousada.getId());
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void excluir( Pousada empresa ) {
        // implementar exclusão
    }
    
}