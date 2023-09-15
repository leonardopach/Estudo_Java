package oo.heranca.teste;

import oo.heranca.desafioheranca.Civic;
import oo.heranca.desafioheranca.Ferrari;

public class TesteCarro {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(315);
		
		ferrari.acelerar();
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.acelerar();

		System.out.println(ferrari.velocidadeAr());
		System.out.println("Ferrari " + ferrari);

		Civic car = new Civic();
		car.ligarTurbo();
		car.acelerar();
		car.acelerar();
		car.desligarTurbo();
		car.acelerar();
		System.out.println("Civic " + car);
	}
}
