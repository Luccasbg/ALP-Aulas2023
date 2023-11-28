package Projeto;

import java.util.Scanner;

public class CarregarNotas {
    Scanner sc = new Scanner(System.in);
    int[] valores = new int[7];
    int valor_total;

    public int[] carregarNotas(int[] val){
        valores = val;
        for(int i = 0; i <= 6; i++){
            valores[i] = sc.nextInt();
        }
        return valores;
    }

    public int valorTotal(){
        for(int i = 0; i <= 6; i++){
            if(i == 0){
                valor_total = valor_total + valores[i] * 100;
            }else if(i == 1){
                valor_total = valor_total + valores[i] * 50;
            }else if(i == 2){
                valor_total = valor_total + valores[i] * 20;
            }else if(i == 3){
                valor_total = valor_total + valores[i] * 10;
            }else if(i == 4){
                valor_total = valor_total + valores[i] * 5;
            }else if(i == 5){
                valor_total = valor_total + valores[i] * 2;
            }else if(i == 6){
                valor_total = valor_total + valores[i];
            }
        }
        System.out.println(valor_total);
        return valor_total;
    }

    public int getQtdNotas(int i){
        return valores[i];
    }
}
