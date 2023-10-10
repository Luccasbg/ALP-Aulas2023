package Vetores;

import java.util.Scanner;

public class VetoresEx01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[5];
        float soma = 0;
        float media = 0;

        for(int i = 0; i <= notas.length - 1; i++){
            System.out.println("Insira a " + (i + 1) + "º nota:");
            notas[i] = sc.nextInt();
            soma = (soma + notas[i]);
        }
        media = (soma / notas.length);
        System.out.println("A média das notas é: " + media);
    }
}
