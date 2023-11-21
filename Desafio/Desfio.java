package Desafio;

import java.util.Scanner;

public class Desfio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String letra;
        double soma = 0;
        boolean verif_case = false;

            System.out.println("Insira uma letra em binário:");
            letra = sc.nextLine();
            if (letra.substring(0, 3).equals("010")){
                System.out.println("Essa letra é maiúscula!");
                verif_case = true;
            }else if(letra.substring(0, 3).equals("011")){
                System.out.println("Essa letra é minúscula!");
            }

        letra = letra.substring(3,8);
        for(int i = 0; i <= letra.length() - 1; i++){
            soma = (soma + ((Integer.parseInt(String.valueOf(letra.charAt((letra.length() - 1) - i)))) * (Math.pow(2, i))));
        }
        letra = String.valueOf(letras[(int) soma]);
        if(verif_case == true){
            System.out.println(letra.toUpperCase());
        }else{
            System.out.println(letra);
        }
    }
}
