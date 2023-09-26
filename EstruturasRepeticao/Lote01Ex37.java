package EstruturasRepeticao;

import java.util.Scanner;

public class Lote01Ex37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o termo da sequência de Fibonacci que você deseja ver:");
        int termo = sc.nextInt();
        int num_anterior = 1;
        int num_atual = 1;
        int fibonacci = 0;

        if(termo == 1 || termo == 2){
            System.out.println(1);
        }else if(termo >= 3){
            for(int i = 3; i <= termo; i++){
                fibonacci = num_anterior + num_atual;
                num_anterior = num_atual;
                num_atual = fibonacci;
            }
            System.out.println(fibonacci);
        }
    }
}