package condicionais;

public class For {
    public static void main(String[] args) {
        for(int contador = 0; contador < 10; contador++) { 
            System.out.println(contador);
        }

        for(int i =0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]",i, j);
            }
        }
    }
}
