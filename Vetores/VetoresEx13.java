package Vetores;

import java.util.Scanner;

public class VetoresEx13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[30];
        float soma = 0;
        float media = 0;
        int qtd = 0;

        for(int i = 0; i <= 29; i++){
            notas[i] = sc.nextFloat();
            soma = soma + notas[i];
        }
        media = soma / 30;
        System.out.println("Média das notas: " + media);
        for(int j = 0; j <= 29; j++){
            if(notas[j] >= media){
                qtd = qtd + 1;
            }else{
                System.out.println("A nota " + j + " é abaixo da média");
            }
        }
        System.out.println("Existem " + qtd + " notas acima da média");
    }
}
