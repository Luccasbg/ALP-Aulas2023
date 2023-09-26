import java.util.Scanner;

public class Lote01Ex21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();
        float n4 = sc.nextFloat();
        float media = ((n1 + n2 + n3 + n4) / 4);

        if(media >= 6){
            System.out.println("O aluno foi aprovado com média: " +media);
        }else if(media >= 3){
            System.out.println("O aluno está de recuperação, visto que sua média foi: " +media);
        }else{
            System.out.println("O aluno foi retido. Sua média foi: " +media);
        }
    }
}