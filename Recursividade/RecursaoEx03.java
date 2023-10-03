package Recursividade;

import java.util.Scanner;

public class RecursaoEx03 {

    static float n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        n = sc.nextInt();
        System.out.println(calcularSerie(1));
    }

    public static float calcularSerie(float num){
        if(num == n){
            return 1/num;
        }
        return (1/num + (calcularSerie(num + 1)));
    }
}
