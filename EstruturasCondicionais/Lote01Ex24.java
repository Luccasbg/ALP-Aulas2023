import java.util.Scanner;

public class Lote01Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num % 2 == 0 && num % 3 == 0){
            System.out.println(num+ " é divisível por 2 e por 3");
        }else if(num % 2 == 0){
            System.out.println("Divisível por 2");
        }else if(num % 3 == 0){
            System.out.println("Divisível por 3");
        }else{
            System.out.println("Não é divisível por 2 e nem por 3");
        }
    }
}