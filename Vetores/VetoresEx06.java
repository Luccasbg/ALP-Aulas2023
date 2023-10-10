package Vetores;

import java.util.Scanner;

public class VetoresEx06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for(int i = 0; i <= 9; i++){
            numeros[i] = sc.nextInt();
            if(numeros[i] % 2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("Ímpar");
            }
        }
    }
}
