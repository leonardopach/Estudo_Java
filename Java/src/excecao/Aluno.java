package excecao;

public class Aluno {

    public final String nome;
    public final double nota;

    public Aluno(String nome, double nota) {
	this.nome = nome;
	this.nota = nota;
    }

    @Override
    public String toString() {
	// TODO Auto-generated method stub
	return nome + " nota " + nota;
    }
}
