package Vetores;

import java.util.Scanner;

public class VetoresEx04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i <= 9; i++){
            numeros[i] = sc.nextInt();
            System.out.println(numeros[i]);
        }

        for(int x = 0; x <= 9; x++){
            System.out.println(numeros[x] * 3);
        }
    }
}
