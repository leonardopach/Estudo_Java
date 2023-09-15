package fundamentos;
import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do Primeiro Numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Digite o valor do Primeiro Numero: ");
        int num2 = entrada.nextInt();
        System.out.println("Digite o operador: +, - , /, *");
        String operador = entrada.next();

        int soma = "+".equals(operador) ? (num1 + num2): 0;
        int sub = "-".equals(operador) ? (num1 - num2): 0;
        int mult = "*".equals(operador) ? (num1 * num2): 0;
        int div = "/".equals(operador) ? (num1 / num2): 0;
        System.out.printf("%d, %d %s",num1, num2, operador);
        System.out.println(soma);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println(div);
        entrada.close();
    }
}
