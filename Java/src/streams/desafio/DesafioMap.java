package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();

	nums.stream().map(Integer::toBinaryString).map(inverter).map(n -> Integer.parseInt(n, 2))
		.forEach(System.out::println);
    }
}
