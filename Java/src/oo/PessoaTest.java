package oo;

import oo.encapsulamento.Pessoa;

public class PessoaTest {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(20);
		p1.setIdade(100);
		
		System.out.println(p1.getIdade());
	}
}
