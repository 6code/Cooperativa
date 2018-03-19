package com.tucurui.laboratorio.cooperativa.models;

/**
 * Created by edu on 17/03/18.
 */

public class Cooperado {

    String nome;
    String saldo;

    public Cooperado(String nome, String saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cooperado{" +
                "nome='" + nome + '\'' +
                ", saldo='" + saldo + '\'' +
                '}';
    }
}
