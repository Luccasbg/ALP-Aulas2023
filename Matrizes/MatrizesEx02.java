package Matrizes;

public class MatrizesEx02 {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];

        for(int valor = 1; valor <= 4; valor++){
            for(int i = (valor - 1); i <= (8 - valor); i++){
                for(int j = (valor - 1); j <= (8 - valor); j++){
                    matriz[i][j] = valor;
                }
            }
        }

        for(int i = 0; i <= 7; i++){
            for(int j = 0; j <= 7; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}
