package Recursividade;

import java.util.Scanner;

public class RecursaoEx01 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(calcularSerie(n));
    }

    public static int calcularSerie(int num){
        if(num == 100){
            return num;
        }
        return num + calcularSerie(num + 1);
    }
}
