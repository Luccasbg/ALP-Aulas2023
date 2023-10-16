package Vetores;

import java.util.Scanner;

public class VetoresEx08 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);    
      int[] numeros = new int[20];
      int maiorValor = 0;
      
      for(int i = 0; i <= 19; i++){
          numeros[i] = sc.nextInt();
      }
      
      for(int x = 0; x <= 19; x++){
          if(numeros[x] > maiorValor){
              maiorValor = numeros[x];
          }
      }
      System.out.print("O maior valor foi: " + maiorValor);
    }
}