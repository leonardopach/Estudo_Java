package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		Consumer<Integer> print2 = System.out::println;

		Stream<String> langStream = Stream.of("Java ", "Lua ", "Js\n");
		langStream.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);

		List<String> outrasLang = Arrays.asList("C ", "Php ", "Kotlin\n");
		outrasLang.stream().forEach(print);
		outrasLang.parallelStream().forEach(print);

//		 Gerador de numeros aleatorios
	 Stream.generate(() -> "a").forEach(print);
	 Stream.iterate(0, n -> n + 1).forEach(print2);
	}
}
