package excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	try {
	    int valor = entrada.nextInt();

	    System.out.println(7 / valor);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	} finally {    
	    entrada.close();
	}
    }
}
