package org.example;

public class Resistor {
    public static double faixa(String cor){
        switch (cor) {
            case "preto": return 0;
            case "marrom": return 1;
            case "vermelho": return 2;
            case "laranja": return 3;
            case "amarelo": return 4;
            case "verde": return 5;
            case "azul": return 6;
            case "roxo": return 7;
            case "cinza": return 8;
            case "branco": return 9;
        }
        return 999;
    }

    public static double multiplicador(String cor){
        switch (cor){
            case "preto": return 1;
            case "marrom": return 10;
            case "vermelho": return 100;
            case "laranja": return 1000;
            case "amarelo": return 10000;
            case "verde": return 100000;
            case "azul": return 1000000;
            case "roxo": return 10000000;
            case "cinza": return 100000000;
            case "branco": return 1000000000;
            case "ouro": return 0.1;
            case "prata": return 0.01;
        }
        return 999;
    }

    public static double tolerancia(String cor) {

        switch (cor) {
            case "preto":
                return 0;
            case "marrom":
                return 1;
            case "vermelho":
                return 2;
            case "verde":
                return 0.5;
            case "azul":
                return 0.25;
            case "roxo":
                return 0.1;
            case "cinza":
                return 0.05;
            case "ouro":
                return 5;
            case "prata":
                return 10;
            case "branco":
                return 20;


        }
        return 999;
    }
}




