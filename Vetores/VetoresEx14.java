package Vetores;

import java.util.Scanner;

public class VetoresEx14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        int aux = 0;

        //Lendo valores no vetor
        for(int i = 0; i <= 9; i++){
            valores[i] = sc.nextInt();
        }

        //Bubble sort - ordenando vetor em order crescente
        for(int j = 0; j <= 8; j++){
            for(int k = 0; k <= 8; k++){
                if(valores[k] > valores[k + 1]){
                    aux = valores[k + 1];
                    valores[k + 1] = valores[k];
                    valores[k] = aux;
                }
            }
        }

        //Nostrando valores ordenados
        for(int l = 0; l <= 9; l++){
            System.out.println(valores[l]);
        }

    }
}
