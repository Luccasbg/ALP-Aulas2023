import javax.swing.*;

public class Lote01Ex16 {
    public static void main(String[] args){
        int horas = Integer.parseInt(JOptionPane.showInputDialog("Insira a qtd de horas trabalhadas:"));
        float valor_hora = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da hora trabalhada:"));
        float desconto = Float.parseFloat(JOptionPane.showInputDialog("Insira o percentual de desconto:"));
        int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de dependentes:"));

        float salario_bruto = (horas * valor_hora);
        float salario_liquido = ((salario_bruto - (salario_bruto * (desconto / 100))) + (100 * dependentes));

        System.out.println(salario_liquido);
    }
} 