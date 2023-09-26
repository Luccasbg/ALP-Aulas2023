import javax.swing.*;
import java.util.Scanner;

public class Lote01Ex17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float extensao = Integer.parseInt(JOptionPane.showInputDialog("Insira a extensão do circuito em metros:"));
        float voltas = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de voltas dadas:"));
        float duracao = Integer.parseInt(JOptionPane.showInputDialog("Insira o tempo de duração em minutos"));
        float velocidade_media = (((extensao * voltas) / 1000) / (duracao / 60));

        JOptionPane.showMessageDialog(null, "A velocidade média, em km/h, é igual a: " +
                velocidade_media);
    }
}