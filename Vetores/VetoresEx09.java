package Vetores;

import java.util.Scanner;

public class VetoresEx09 {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);    
      int[] numeros = new int[10];
      
      for(int i = 0; i <= 9; i++){
          numeros[i] = sc.nextInt();
      }
      
      for(int x = 0; x <= 9; x++){
          if(numeros[x] % 2 == 0 && numeros[x] % 3 == 0){
              System.out.println(numeros[x] + " é múltiplo de 2 e 3");
          }else if(numeros[x] % 2 == 0){
              System.out.println(numeros[x] + " é apenas múltiplo de 2");
          }else if(numeros[x] % 3 == 0){
              System.out.println(numeros[x] + " é apenas múltiplo de 3");
          }else{
              System.out.println(numeros[x] + " não é múltiplo de 2 nem de 3");
          }
      }
    }
}