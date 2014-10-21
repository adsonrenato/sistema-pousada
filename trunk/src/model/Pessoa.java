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
public class Pessoa {

    private String nome, endereco;

    public Pessoa(String nome, String endereco) {

        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getEndereco() {

        return this.endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }
}
