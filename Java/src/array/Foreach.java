package array;

public class Foreach {
    public static void main(String[] args) {
        double[] valores = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
        for (double d : valores) {
            System.out.print(d + " ");
        }
    }
}
