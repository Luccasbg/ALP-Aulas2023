package Vetores;

import java.util.Scanner;

public class VetoresEx05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];

        for(int i = 0; i <= 19; i++){
            numeros[i] = sc.nextInt();
            System.out.println(numeros[i]);
        }

        for(int x = 0; x <= 19; x++){
            if(numeros[x] < 10) {
                numeros[x] = 0;
            }
            System.out.println(numeros[x]);
        }
    }
}
