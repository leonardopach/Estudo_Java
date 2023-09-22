package br.com.leo.app.financeiro;

import java.lang.reflect.Field;

import br.com.leo.app.calculo.Calculadora;
import br.com.leo.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[ ] args) {

		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2,3,4));

		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(2,3,4));

		System.out.println(Calculadora.class.getName());
		System.out.println(calc.getId());

		try {
			Field fieldId = Calculadora.class.getDeclaredFields()[0];
			fieldId.setAccessible(true);
			fieldId.set(calc,"def");
			System.out.println(calc.getId());
			fieldId.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
