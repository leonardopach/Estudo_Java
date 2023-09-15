package array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 10;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        double total = 0;
        for(int i = 0; i< notasAlunoA.length; i++) {
            total += notasAlunoA[i];
        }

        System.out.println(total / notasAlunoA.length);

        double[] notasAlunoB = {10,4,6.7,6.2};

        System.out.println(Arrays.toString(notasAlunoB));
    }
}
