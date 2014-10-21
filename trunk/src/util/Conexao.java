package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {
    
    /*
        Classe de conexão com o banco SQLSERVER
        Padrão Singleton
    */
    
    private Connection conexao;
    private static Conexao INSTANCE;
    
    private String DRIVER   = "com.mysql.jdbc.Driver";
    private String prefixo  = "jdbc:mysql://";
    private String server   = "localhost";
    private String banco    = "sistemahotel";
    private String user     = "root";
    private String password = "root";
    private String URL = prefixo+server+"/"+banco+"?user="+user+"&password="+password;
        
    private Conexao() {
        
        try {
            
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL);
            System.out.println("Conexão aberta com sucesso !");
        } catch (ClassNotFoundException e) {
        
            JOptionPane.showMessageDialog(null, "Não foi possivel carregar o driver:" + e);
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Erro sql " + e);
            
        }
    }
    
    /*
    Ao marcarmos um método como synchronized, o sistema de execução Java 
    garantirá que apenas uma thread de cada vez acesse tal método. Se outras 
    threads tentarem fazer o mesmo, elas serão colocadas em espera até que a 
    thread atual finalize seu trabalho e libere o método.
    */
    public static synchronized Conexao getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Conexao();
        }
        return INSTANCE;
    }
    
    public Connection getConexao() {  
        return conexao;  
    } 
}