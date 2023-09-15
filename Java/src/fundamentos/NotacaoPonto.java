package fundamentos;
public class NotacaoPonto {
    public static void main(String[] args) {
        double a = 2.3;
        String s = "Bom dia X";

        System.out.println(a);
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.replace("X", "Senhora"));

        String y = "Bom dia X"
            .replace("X", "Leonardo")
            .toUpperCase()
            .concat("!!!!");
        System.out.println(y);
        System.out.println(y.length());
    }
}
