package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
	public static void main(String[] args) {

		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.apply(2.2, 4.4));

		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.1, 4.2));
	}
}
