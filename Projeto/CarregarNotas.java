package Projeto;

import java.util.Scanner;

public class CarregarNotas {
    Scanner sc = new Scanner(System.in);

    public int[] carregarNotas(int[] valores){
        for(int i = 0; i <= 5; i++){
            valores[i] = sc.nextInt();
        }
        return valores;
    }
}
