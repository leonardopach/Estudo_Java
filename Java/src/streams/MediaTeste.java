package streams;

public class MediaTeste {

    public static void main(String[] args) {
	
	Media m1 = new Media().adicionar(8.3).adicionar(4.1);
	
	System.out.println(m1.getValor());
    }
}
