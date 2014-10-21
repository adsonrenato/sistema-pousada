package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Usuario;
import util.Conexao;

public class UsuarioDao {
        
    private Usuario usuario;
    
    public static boolean efetuarLogin( String codUsuario, String senhaUsuario) {
        
        try {
            
            Conexao con = Conexao.getInstance();
            Statement statement = con.getConexao().createStatement();
            ResultSet resultado = statement.executeQuery("SELECT codigo, senha, nome "
                                                         + "FROM usuario WHERE codigo =  '"+codUsuario+"'");
            
            while(resultado.next()){
                if(codUsuario.equals(resultado.getString("codigo"))) {
                    if (senhaUsuario.equals(resultado.getString("senha"))) {
                        JOptionPane.showMessageDialog(null, "Bem Vindo: "+resultado.getString("nome"));
                        return true;
                    }
                }
            }
            resultado.close();
            statement.close();
        } catch(SQLException e){
            
        }
        return false;
    }
    public void inserirUsuario( Usuario usuario ) {
        // implementar inserção
    }
    
    public Usuario consultarUsuario() {
        // implementar consulta
        return usuario;
    }
    
    public void alterarUsuario( Usuario usuario ) {
        // implemetar alteração
    }
    
    public void excluirUsuario( Usuario usuario ) {
        // implementar exclusão
    }
}