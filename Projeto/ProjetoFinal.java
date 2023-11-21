package Projeto;

import java.util.Scanner;

public class ProjetoFinal {

    static CarregarNotas carregarNotas = new CarregarNotas();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int[] valores = new int[6];

        do{
           op = sc.nextInt();
           switch (op){
               case 1:
                   valores = carregarNotas.carregarNotas(valores);
                   break;
           }
        }while(op != 9);
    }
}
