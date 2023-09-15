package condicionais;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(
            "Informe o numero: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("Numero par!");
        } else {
            System.out.println("Numero Impar");
        }

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        double nota = entrada.nextDouble();

        if(nota > 10 || nota < 0) {
            System.out.println("Nota Invalida");
        } else if (nota >= 8.1) {
            System.out.println("Conceito A");
        }

        entrada.close();
    }
}
