package fundamentos;
import javax.swing.JOptionPane;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
            "Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog(
            "Digite o primeiro numero: ");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("A soma é " +  soma);
        System.out.println("A Media é "+ soma / 2);
    }
}
