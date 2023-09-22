package br.com.leo.app.financeiro;

import br.com.leo.app.calculo.Calculadora;
import br.com.leo.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[ ] args) {

		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2,3,4));

		OperacoesAritmeticas op = new OperacoesAritmeticas();

		System.out.println(op.soma(2,3,4));

		System.out.println(calc.getId());
	}

}
