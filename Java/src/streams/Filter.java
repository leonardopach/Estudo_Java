package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {

	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	
	nums.stream().filter(n -> n % 2 == 0).map(n -> n + " ").forEach(System.out::print);
	System.out.println();

	Aluno a1 = new Aluno("Ana", 7.8);
	Aluno a2 = new Aluno("Bia", 5.8);
	Aluno a3 = new Aluno("Daniel", 9.8);
	Aluno a4 = new Aluno("Gui", 6.8);
	Aluno a5 = new Aluno("Rebeca", 7.1);
	Aluno a6 = new Aluno("Pedro", 8.8);

	List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
	
	alunos.stream().filter(n -> n.nota > 6).map(a -> "Parabens " + a.nome + "! Voce foi aprovado!!! " + a.nota ).forEach(System.out::println);
    }
}
