package org.example;

public class Resistor {
     // Método que retorna o valor da primeira ou segunda faixa do resistor com base na cor.
    public static double faixa(String cor){
        switch (cor) { // O switch verifica qual cor foi passada e retorna o valor correspondente (de 0 a 9)
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
        return 999;  // Se a cor não for válida, retorna 999 (valor usado para indicar erro)
    }

    public static double multiplicador(String cor){ // Método que retorna o valor do multiplicador com base na cor da terceira faixa
        switch (cor){  // O switch define o fator multiplicador de acordo com a cor da faixa
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
        return 999; // Se a cor não for válida, retorna 999 (valor usado para indicar erro)
    }

    public static double tolerancia(String cor) {  // Método que retorna a tolerância em porcentagem com base na cor da quarta faixa

        switch (cor) {  // O switch associa a cor a um valor percentual de tolerância
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
                return 0.10;
            case "cinza":
                return 0.05;
            case "ouro":
                return 5;
            case "prata":
                return 10;
            case "branco":
                return 20;


        }
        return 999; // indicar valor invalido
    }
}