package com.tucurui.laboratorio.cooperativa.models;

/**
 * Created by edu on 17/03/18.
 */

public class Cooperado {

    String nome;
    String estoque;
    String qtdVenda;

    public Cooperado(String nome, String estoque, String qtdVenda) {
        this.nome = nome;
        this.estoque = estoque;
        this.qtdVenda = qtdVenda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public String getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(String qtdVenda) {
        this.qtdVenda = qtdVenda;
    }
}
