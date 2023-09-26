import java.util.Scanner;

public class Lote01Ex11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o raio da circunferência:");
        int raio = sc.nextInt();
        float pi = (float) 3.1415;
        float circunferencia =  (2 * pi * raio);

        System.out.println("O valor da circunferência é: " +circunferencia);
    }
}