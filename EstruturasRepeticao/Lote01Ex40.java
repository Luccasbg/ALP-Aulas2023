import java.util.Scanner;

public class Lote01Ex40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int contador = 0;

        if(num1 <= num2){
            for(int i = num1; i <= num2; i++){
                for(int x = num2; x >= 1; x--) {
                    if (i % x == 0 && x != i && x != 1) {
                        contador++;
                    }
                }
                if(contador == 0){
                    System.out.println(i + " é um número primo");
                }
                contador = 0;
            }
        }else{
            for(int i = num2; i <= num1; i++){
                for(int x = num1; x >= 1; x--){
                    if(i % x == 0 && x != i && x != 1){
                        contador++;
                    }
                }
                if(contador == 0){
                    System.out.println(i + " é um número primo");
                }
                contador = 0;
            }
        }
    }
}