import java.util.Scanner;

public class CalculoPotencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor da base:");
        int base = sc.nextInt();

        System.out.println("Insira o valor do expoente:");
        int expoente = sc.nextInt();

        int potencia = 1;

        for(int i = 1; i <= expoente; i++){
            potencia = potencia * base;
        }
        System.out.println("O valor da potência é: " +potencia);
    }
}