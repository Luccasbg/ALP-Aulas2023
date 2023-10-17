package Vetores;

import java.util.Scanner;

public class VetoresEx10 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        for(int i = 0; i <= 9; i++){
            a[i] = sc.nextInt();
            System.out.println(a[i]);
        }

        for(int x = 0; x <= 9; x++){
            b[x] = sc.nextInt();
            System.out.println(b[x]);
        }

        for(int y = 0; y <= 19; y++){
            if(y <= 9){
                c[y] = a[y];
                System.out.println(c[y]);
            }else{
                c[y] = b[y - 10];
                System.out.println(c[y]);
            }
        }
    }
}
