package com.tucurui.laboratorio.cooperativa.act;


public class GerarLogin {

    public String gerarSenhaAleatoria() {
        int qtdeMaximaCaracteres = 8;
        String[] caracteres = {"1", "2", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();
    }

    public String gerarEmailAleatoro(String nome) {

        int qtdeMaximaCaracteres = 4;

        String[] caracteres = {"1", "2", "4", "5", "6", "7", "8",
                "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                "x", "y", "z"};


        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            stringBuilder.append(caracteres[posicao]);
        }

        String login = nome + "_" + stringBuilder.toString() + "@cooperado.com";

        return login;
    }


}