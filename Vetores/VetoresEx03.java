package Vetores;

import java.util.Scanner;

public class VetoresEx03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float[] valores = new float[5];
        int[] qtd = new int[5];
        float valor_total = 0;
        double comissao = 0;

        for(int i = 0; i <= valores.length - 1; i++){
            valores[i] = sc.nextFloat();
            qtd[i] = sc.nextInt();
            valor_total = (valor_total + (valores[i] * qtd[i]));
        }
        comissao = (valor_total * 0.05);
        System.out.println("O valor total das vendas foi: R$" + valor_total);
        System.out.println("A comissão do funcionário será: R$" + comissao);
    }
}
