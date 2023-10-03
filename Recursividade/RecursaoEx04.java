package Recursividade;

import java.util.Scanner;

public class RecursaoEx04 {

    static float n;
    static float x = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        n = sc.nextFloat();
        System.out.println(calcularSerie(n, x));
    }

    public static float calcularSerie(float numerador, float denominador){
        if(numerador == 1){
            return numerador/denominador;
        }
        return (numerador / denominador + (calcularSerie(numerador -1, denominador + 1)));
    }
}
