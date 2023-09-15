package array;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de notas: ");
        int qtdNotas = entrada.nextInt();
        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = entrada.nextDouble();
        }

        double resultado = 0;
        for(double soma: notas) {
            resultado += soma;
        }

        System.out.println(resultado / notas.length);
        entrada.close();
    }
}
