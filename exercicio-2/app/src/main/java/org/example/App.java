
package org.example;

public class App {
    public static void main(String[] args){
        double faixa1; // Primeira faixa de cor
        double faixa2; // Segunda faixa de cor
        double multiplicador; // Terceira faixa (multiplicador)
        double tolerancia; //Quarta faixa (tolerância da resistência)

        if (args.length == 3 ){ // Verifica se o usuário passou apenas 3 argumentos (sem a tolerância)
            faixa1 = Resistor.faixa(args[0]); // Converte a primeira cor em número
            faixa2 = Resistor.faixa(args[1]); // Converte a segunda cor em número
            multiplicador = Resistor.multiplicador(args[2]); // Converte a terceira cor em multiplicador
            tolerancia = 20; // Valor padrão de tolerância
        } else {
            faixa1 = Resistor.faixa(args[0]);
            faixa2 = Resistor.faixa(args[1]);
            multiplicador = Resistor.multiplicador(args[2]);
            tolerancia = Resistor.tolerancia(args[3]);
        }
        // Verifica se todos os valores retornados são válidos (diferentes de 999, que indica erro)
        if(faixa1 != 999 && faixa2 != 999 && multiplicador != 999 && tolerancia != 999){
            // Calcula o valor da resistência
            double ohms = faixa1 * 10; // Primeiro dígito multiplicado por 10, dezena
            ohms = ohms + faixa2; //Soma o segundo dígito
            ohms = ohms * multiplicador; // Multiplica pelo valor do multiplicador

            int resposta = (int) ohms; // Converte o valor para inteiro
            int respFaixa1 = (int) faixa1;
            int respFaixa2 = (int) faixa2;
            // Verifica a escala e imprime o resultado
            if (ohms >= 1000 && ohms < 1000000) {
                System.out.println("Resistencia: " + respFaixa1 + "," + respFaixa2 + " K Ohms (+- " + tolerancia + "%)" );
            } else if (ohms >= 1000000 && ohms < 1000000000 ){
                System.out.println("Resistencia: " + respFaixa1 + "," + respFaixa2 + " M  Ohms (+- " + tolerancia + "%)" );
            } else if (ohms >= 1000000000) {
                System.out.println("Resistencia: " + respFaixa1 + "," + respFaixa2 + " G  Ohms (+- " + tolerancia + "%)" );
            } else System.out.println("Resistencia: " + resposta + " Ohms (+- " + tolerancia + "%)");

        } else {
            // Caso alguma cor seja inválida, mostra mensagem de erro
            System.out.println("Voce deve passar as cores validas correspondentes separadas por espaço ");
        }

    }
}