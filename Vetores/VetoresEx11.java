package Vetores;

import java.util.Scanner;

public class VetoresEx11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[50];
        int soma = 0;
        int contador = 0;
        int soma_impares = 0;
        float media = 0;

        for(int i = 0; i <= 49; i++){
            valores[i] = sc.nextInt();
            if(valores[i] >= 10 && valores[i] <= 100) {
                soma = soma + valores[i];
                contador = contador + 1;
            }
            if(valores[i] % 2 != 0){
                soma_impares = soma_impares + valores[i];
            }
        }
        media = soma / contador;
        System.out.println("Média dos números entre 10 e 100: " + media);
        System.out.println("Soma dos números ímpares: " + soma_impares);
    }
}
