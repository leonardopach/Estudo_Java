package fundamentos;
public class OperadorTernario {
    public static void main(String[] args) {
        double media = 6;
        String resultado = media >= 7 || media == 6? "Passou": "Reprovado";
        System.out.println(resultado);
    }
}
