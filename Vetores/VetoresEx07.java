package Vetores;

public class VetoresEx07 {
    public static void main(String args[]) {
      int[] serie = new int[15];
      int soma = 0;
      
      for(int i = 0; i <= 14; i++){
          if(i % 2 != 0){
              soma = soma + i;
              serie[i] = soma;
              System.out.print(serie[i] + " ");
          }
      }
    }
}