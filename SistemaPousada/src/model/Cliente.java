/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Neto
 */
public class Cliente extends Pessoa{
    
    private int id;
    
    public Cliente(String nome, String endereco) {
        super(nome, endereco);
    }
    
    public Cliente(int id, String nome, String endereco) {
        super(nome, endereco);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
