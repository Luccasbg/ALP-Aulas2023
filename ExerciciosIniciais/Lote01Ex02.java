import java.util.Scanner;

public class Lote01Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float salario = sc.nextFloat();

        System.out.println("Seu novo salário, com reajuste de 15%, é igual a: " + salario * 1.15);
    }
}