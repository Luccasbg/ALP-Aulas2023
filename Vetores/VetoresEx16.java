package Vetores;

import java.util.Scanner;

public class VetoresEx16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[20];
        int somatoria = 0;

        for(int i = 0; i <= 19; i++){
            valores[i] = sc.nextInt();
        }

        for(int j = 1; j <= 10; j++){
            somatoria = (somatoria + (valores[0] - valores[19]));
        }
        System.out.println(somatoria);
    }
}
