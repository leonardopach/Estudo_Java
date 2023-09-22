package br.com.leo.app.calculo;

import br.com.leo.app.calculo.interno.OperacoesAritmeticas;
import br.com.leo.app.logging.Logger;

public class Calculadora {

	private String id = "abcd";
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando!!!");
		return opAritmeticas.soma(nums);
	}
	
	public String getId() {
		return id;
	}
}
