import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a,b, resultado;
        char op;

        System.out.println("Insira a operação desejada:");
        System.out.println("Opções: +, -, *, /");
        op = sc.next().charAt(0);
        a = sc.nextInt();
        b = sc.nextInt();

        switch (op){
            case '+':
                 resultado = a + b;
                System.out.println(resultado);
                 break;
            case '-':
                resultado = a - b;
                System.out.println(resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println(resultado);
                break;
            case '/':
                resultado = a / b;
                System.out.println(resultado);
                break;
        }
    }
}