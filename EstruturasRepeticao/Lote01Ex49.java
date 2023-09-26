import java.util.Scanner;

public class Lote01Ex49 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        float fatorial = 1;
        int denominador_fatorial = 1;
        float serie = 0;

        for(int ctd = num; ctd >= 1; ctd--){
            for(int i = denominador_fatorial; i >= 1; i--){
                fatorial = fatorial * i;
            }
            serie = (serie + (ctd/fatorial));
            fatorial = 1;
            denominador_fatorial = denominador_fatorial + 2;
        }
        System.out.print(serie);
    }
}