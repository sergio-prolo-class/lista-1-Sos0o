package org.example;

import java.util.Random;

public class BatalhaNaval {
    public static void main(String[] args) {
        // Criando o tabuleiro com dimensoes 10x10
        char[][] tabuleiro = new char[10][10];

        // Preenchendo o tabuleiro com agua
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                tabuleiro[i][j] = '.';
            }
        }

        Random rand = new Random();

        // Determinando a lista de navios do jogo conforme a tabela 1
        char[] navios = {'P', 'E', 'C', 'S', 'N'};
        int[] tamanhos = {5, 4, 3, 3, 2};

        for(int n = 0; n < navios.length; n++) {
            while(true) {
                int x = rand.nextInt(10);
                int y = rand.nextInt(10);
                int dir = rand.nextInt(2); // 0=horizontal, 1=vertical
                int cabe = 1;

                // Verificando se o navio cabe no tabuleiro ou nao
                if(dir == 0 && y + tamanhos[n] <= 10) {
                    for(int j = y; j < y + tamanhos[n]; j++) {
                        if(tabuleiro[x][j] != '.') cabe = 0;
                    }
                    if(cabe == 1) {
                        for(int j = y; j < y + tamanhos[n]; j++) {
                            tabuleiro[x][j] = navios[n];
                        }
                        break;
                    }
                } else if(dir == 1 && x + tamanhos[n] <= 10) {
                    for(int i = x; i < x + tamanhos[n]; i++) {
                        if(tabuleiro[i][y] != '.') cabe = 0;
                    }
                    if(cabe == 1) {
                        for(int i = x; i < x + tamanhos[n]; i++) {
                            tabuleiro[i][y] = navios[n];
                        }
                        break;
                    }
                }
            }
        }

        // Imprimindo o tabuleiro
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}