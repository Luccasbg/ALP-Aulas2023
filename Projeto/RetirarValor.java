package Projeto;

public class RetirarValor {
    int c = 0;
    int cinq = 0;
    int v = 0;
    int dez = 0;
    int cinc = 0;
    int d = 0;
    int u = 0;
    int[][] estatistica = new int[4][3];
    CarregarNotas carregarNotas = new CarregarNotas();
    public void retirarValor(int valor, int cod) {
        if(valor <= carregarNotas.valorTotal()){
            estatistica[cod][2] += valor;
            if(valor > estatistica[cod][0]){
                estatistica[cod][0] = valor;
            }else if(valor < estatistica[cod][1]){
                estatistica[cod][1] = valor;
            }
            while(valor > 0){
                if(valor >= 100 && carregarNotas.getQtdNotas(0) >= 1){
                    if((int) valor / 100 >= carregarNotas.getQtdNotas(0)){
                        c = carregarNotas.getQtdNotas(0);
                        System.out.println(c + " notas de 100");
                        valor = valor % 100;
                    }else{
                        c = (int) valor / 100;
                        System.out.println(c + " notas de 100");
                        valor = valor % 100;
                    }
                }else if(valor >= 50){
                    cinq = (int) valor / 50;
                    System.out.println(cinq + " notas de 50");
                    valor = valor % 50;
                }else if(valor >= 20){
                    v = (int) valor / 20;
                    System.out.println(v + " notas de 20");
                    valor = valor % 20;
                }else if(valor >= 10){
                    dez = (int) valor / 10;
                    System.out.println(dez + " notas de 10");
                    valor = valor % 10;
                }else if(valor >= 5){
                    cinc = (int) valor / 5;
                    System.out.println(cinc + " notas de 5");
                    valor = valor % 5;
                }else if(valor >= 2){
                    d = (int) valor / 2;
                    System.out.println(d + " notas de 2");
                    valor = valor % 2;
                }else if(valor >= 1){
                    System.out.println((int) valor + " notas de 1");
                    valor = 0;
                }
            }
        }else{
            System.out.println("EXCEDEU O LIMITE DO CAIXA");
        }
    }
}
