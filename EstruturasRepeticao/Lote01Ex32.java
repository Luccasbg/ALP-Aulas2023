import java.util.Scanner;

public class Lote01Ex32 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int x = (n - 1); x > 0; x--){
            n = n * x;
        }
        System.out.print(n);
    }
}