package Matrizes;

import java.util.Random;

public class MatrizesEx01 {
    public static void main(String[] args) {
        int[][] tabuleiro = new int[8][8];
        int[] somas = new int[6];
        Random random = new Random();

        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                tabuleiro[i][j] = random.nextInt(0, 7);
                System.out.println(tabuleiro[i][j]);
                if(tabuleiro[i][j] != 6){
                    somas[tabuleiro[i][j]]++;
                }
            }
        }
        for(int i = 0; i <= 5; i++){
            System.out.println("Quantidade de peças " +i+ ": " +somas[i]);
        }
    }
}
