import java.util.Scanner;

public class Lote01Ex13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a quantidade de alimento, em kg:");
        int qtd_alimento = sc.nextInt();
        int dias = ((qtd_alimento * 1000) / 50);

        System.out.println("Consumindo 50g por dia, você terá comida suficiente para os próximos " +dias+ " dias");
    }
}