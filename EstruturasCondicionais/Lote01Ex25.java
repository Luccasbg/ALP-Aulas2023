import java.util.Scanner;

public class Lote01Ex25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a hora de início do jogo:");
        int hora_inicial = sc.nextInt();
        System.out.println("Insira o minuto de início do jogo:");
        int minuto_inicial = sc.nextInt();

        System.out.println("Insira a hora de término do jogo:");
        int hora_final = sc.nextInt();
        System.out.println("Insira o minuto de término do jogo:");
        int minuto_final = sc.nextInt();

        int hora, minuto;

        if(hora_final >= hora_inicial && minuto_final >= minuto_inicial){
            hora = hora_final - hora_inicial;
            minuto = minuto_final - minuto_inicial;
            System.out.println("Horas: " +hora+ "; minuto: " +minuto);
        }else if(hora_final >= hora_inicial){
            hora = ((hora_final - hora_inicial) - 1);
            minuto = ((minuto_final + 60) - minuto_inicial);
            System.out.println("Horas: " +hora+ "; minuto: " +minuto);
        }else if(hora_final < hora_inicial && minuto_final >= minuto_inicial){
            hora = ((hora_final + 24) - hora_inicial);
            minuto = minuto_final - minuto_inicial;
            System.out.println("Horas: " +hora+ "; minuto: " +minuto);
        }else{
            hora = ((hora_final + 23) - hora_inicial);
            minuto = ((minuto_final + 60)- minuto_inicial);
            System.out.println("Horas: " +hora+ "; minuto: " +minuto);
        }
    }
}