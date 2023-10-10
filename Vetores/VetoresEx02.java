package Vetores;

import java.util.Scanner;

public class VetoresEx02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float[] alturas = new float[5];
        float soma = 0;
        float media = 0;
        float maior_altura = 0;

        for(int i = 0; i <= alturas.length - 1; i++){
            System.out.println("Insira a " + (i + 1) + "º altura:");
            alturas[i] = sc.nextFloat();
            soma = (soma + alturas[i]);
            if(alturas[i] > maior_altura){
                maior_altura = alturas[i];
            }
        }
        media = (soma / alturas.length);
        System.out.println("A média das alturas é: " + media);
        System.out.println("A maior altura foi: " + maior_altura);
    }
}
