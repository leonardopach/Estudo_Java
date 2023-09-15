package condicionais;

public class Switchh {
    public static void main(String[] args) {
        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bssai-Dai...");
                break;
            case "marrom":
                System.out.println("Sei o Tekki Shodan...");
                break;
            case "rosa":
                System.out.println("Sei o Heian Godan...");
                break;
            case "verde":
                System.out.println("Sei o Heian Yodan...");
                break;
            case "laranja":
                System.out.println("Sei o Heian Sandan...");
                break;
            default:
                System.out.println("Não sei de nada");
        }
    }
}