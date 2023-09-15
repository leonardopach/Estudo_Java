package fundamentos;
public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(0));

        String s = "Boa tarde";
        s = s.toUpperCase();
        s = "Bom dia";
        System.out.println(s.concat("!!!!"));
        System.out.println(s.startsWith("Bom"));

        var nome = "pedro";
        var idade = 25;
        var salario = 12345.23;
        System.out.println(nome);
        System.out.printf("Nome %s, Idade: %d, Salario: %.2f ", nome, idade, salario);
        System.out.println("Contem o o valor ".contains("tarde"));
        System.out.println("Frase qualquer".substring(6, 8));
    }
}

