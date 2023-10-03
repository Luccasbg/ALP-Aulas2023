package Recursividade;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número:");
        int n = sc.nextInt();
        System.out.println(calcularFatorial(n));
    }

    public static int calcularFatorial(int num){
        if(num == 1){
            return 1;
        }
        return num * calcularFatorial(num - 1);
    }
}
