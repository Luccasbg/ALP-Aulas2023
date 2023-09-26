import java.util.Scanner;

public class Lote01Ex34 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número e mostrarei sua tabuada:");
        int num = sc.nextInt();
        int resultado;

        for(int x = 1; x <= 10; x++){
            resultado = num * x;
            System.out.println(num+ " x " +x+ " = " +resultado);
        }
    }
}