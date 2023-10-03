package Recursividade;

import java.util.Scanner;

public class RecursaoEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = sc.nextInt();
        System.out.println(calcularSerie(n));
    }

    public static int calcularSerie(int num){
        if(num == 1){
            return 1;
        }
        return num + calcularSerie(num - 1);
    }
}
