public class Lote01Ex42 {
    public static void main(String[] args){
        float a = 0;
        for(float num = 1; num <= 50; num++){
            a = (num / ((2 * num) - 1));
            System.out.println(num+ " / " + ((2 * num) - 1) + " = " +a);
        }
    }
}