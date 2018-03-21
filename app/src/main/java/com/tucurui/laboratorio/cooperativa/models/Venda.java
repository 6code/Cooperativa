package com.tucurui.laboratorio.cooperativa.models;

/**
 * Created by edu on 21/03/18.
 */

public class Venda {

    private String prodruto;
    private String comprador;
    private String quantidade;
    private String valor;
    private String criterio;

    @Override
    public String toString() {
        return "prodruto: " + prodruto +
                "\ncomprador: " + comprador +
                "\nquantidade: " + quantidade +
                "\nvalor: " + valor +
                "\ncriterio: " + criterio;
    }

    public String getProdruto() {
        return prodruto;
    }

    public void setProdruto(String prodruto) {
        this.prodruto = prodruto;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCriterio() {
        return criterio;
    }

    public void setCriterio(String criterio) {
        this.criterio = criterio;
    }
}
