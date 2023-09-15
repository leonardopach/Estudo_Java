package excecao;

public class Basico {

    public static void main(String[] args) {

	Aluno a1 = null;

	try {
	    imprimirAluno(a1);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}

	try {
	    System.out.println(7 / 0);
	} catch (ArithmeticException e) {
	    System.out.println("Ocorreu o erro: " + e.getMessage());
	}

	System.out.println("Fim");
    }

    public static void imprimirAluno(Aluno aluno) {
	System.out.println(aluno.nome);
    }
}
