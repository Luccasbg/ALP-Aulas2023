package Matrizes;

import java.util.Scanner;

public class MatrizesEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mat[][] = new float[3][3];
        float diagonais[] = new float[3];

        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                if(i == 2 - j){
                    mat[i][j] = (float) Math.pow(2, i);
                    diagonais[i] = mat[i][j];
                }else{
                    System.out.println("Insira o valor da linha " + i + ", coluna " + j + ":" );
                    mat[i][j] = sc.nextFloat();
                }
            }
        }
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                mat[i][j] = mat[i][j] / diagonais[i];
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
