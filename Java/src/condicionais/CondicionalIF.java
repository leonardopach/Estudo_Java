package condicionais;

import java.util.Scanner;

public class CondicionalIF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Infor a media ");
        double media = entrada.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        entrada.close();
    }
}
