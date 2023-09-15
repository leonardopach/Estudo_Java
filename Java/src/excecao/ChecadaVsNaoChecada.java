package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

	try {
	    geraErro1();
	} catch (RuntimeException e) {
	    // TODO: handle exception
	    System.out.println(e.getMessage());
	}
	try {
	    geraErro2();
	} catch (Exception e) {
	    // TODO Auto-generated catch block
	    System.out.println(e.getMessage());
	}

    }

    // Exceção não checada
    static void geraErro1() {
	throw new RuntimeException("Ocorreu um erro #01!");
    }

    // Exceção checada
    static void geraErro2() throws Exception {
	throw new Exception("Ocorreu um erro #02");
    }
}
