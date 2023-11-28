package Projeto;

import java.util.Scanner;

public class ProjetoFinal {

    static CarregarNotas carregarNotas = new CarregarNotas();
    static RetirarValor retirarValor = new RetirarValor();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        int[] valores = new int[7];

        do{
           op = sc.nextInt();
           switch (op){
               case 1:
                   valores = carregarNotas.carregarNotas(valores);
                   break;
               case 2:
                   System.out.println("Insira o valor a ser sacado:");
                   int valor = sc.nextInt();
                   System.out.println("Insira o código do banco:");
                   int cod = sc.nextInt();
                   retirarValor.retirarValor(valor, cod);
                   break;
           }
        }while(op != 9);
    }
}
