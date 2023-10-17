package Vetores;

import java.util.Scanner;

public class VetoresEx12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        int maiorValor = 0;
        int menorValor = 0;
        float soma = 0;
        float media = 0;

        for(int i = 0; i <= 9; i++){
            valores[i] = sc.nextInt();
            soma = soma + valores[i];
            if(i == 0){
                maiorValor = valores[i];
                menorValor = valores[i];
            }

            if(valores[i] > maiorValor){
                maiorValor = valores[i];
            }

            if(valores[i] < menorValor) {
                menorValor = valores[i];
            }
        }
        media = soma / 9;
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Média dos valores: " + media);
    }
}
