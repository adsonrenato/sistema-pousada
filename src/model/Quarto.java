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
public class Quarto {
    
    private int idQuarto;
    private int numeroQuarto;
    private double valorDiaria;
    private String tipoCama;
    private String tipoClimatizacao;

    public Quarto(int idQuarto, int numeroQuarto, double valorDiaria, String tipoCama, String tipoClimatizacao) {
        
        this.idQuarto = idQuarto;
        this.numeroQuarto = numeroQuarto;
        this.valorDiaria = valorDiaria;
        this.tipoCama = tipoCama;
        this.tipoClimatizacao = tipoClimatizacao;
    }
    
    public Quarto( int numeroQuarto, double valorDiaria, String tipoCama, String tipoClimatizacao) {
        
        this.numeroQuarto = numeroQuarto;
        this.valorDiaria = valorDiaria;
        this.tipoCama = tipoCama;
        this.tipoClimatizacao = tipoClimatizacao;
    }

    public int getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(int idQuarto) {
        this.idQuarto = idQuarto;
    }
    
    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public String getTipoClimatizacao() {
        return tipoClimatizacao;
    }

    public void setTipoClimatizacao(String tipoClimatizacao) {
        this.tipoClimatizacao = tipoClimatizacao;
    }
}
