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
public class Funcionario extends Pessoa {

    private int id;
    private double salario;

    public Funcionario(String nome, String endereco, double salario) {

        super(nome, endereco);

        this.salario = salario;
    }
    
    public Funcionario(int id, String nome, String endereco, double salario) {

        super(nome, endereco);
        this.id = id;
        this.salario = salario;
    }

    public double getSalario() {

        return salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }
}
