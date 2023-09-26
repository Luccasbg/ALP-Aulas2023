public class Lote01Ex39 {
    public static void main(String[] args){
        long soma = 1;
        long contador = 1;
        for(int i = 1; i <= 64; i++){
            soma = soma * 2;
            contador = contador + soma;
        }
        System.out.println(soma);
        System.out.println(contador);
    }
}
