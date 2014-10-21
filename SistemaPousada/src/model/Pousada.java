
package model;

public class Pousada {
    
    private int id;
    private String razaoSocial;
    private String fantasia;
    private String cnpj;
    private String telefone;
    private String endereco;
    private int numEndereco;
    private int quantQuarto;

    public Pousada( int id, String razaoSocial, String fantasia, String cnpj, 
                    String telefone, String endereco, int numEndereco, int quantQuarto) {
                    
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numEndereco = numEndereco;
        this.quantQuarto = quantQuarto;
    }
    
        public Pousada( String razaoSocial, String fantasia, String cnpj, 
                        String telefone, String endereco, int numEndereco, int quantQuarto) {
            
        this.razaoSocial = razaoSocial;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numEndereco = numEndereco;
        this.quantQuarto = quantQuarto;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(int numEndereco) {
        this.numEndereco = numEndereco;
    }

    public int getQuantQuarto() {
        return quantQuarto;
    }

    public void setQuantQuarto(int quantQuarto) {
        this.quantQuarto = quantQuarto;
    }
}
