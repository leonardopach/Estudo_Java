package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjeto {

	public static void main(String[] args) {

		List<String> aprovado = Arrays.asList("Lu", "Gui", "Luca", "Ana");

		System.out.println("Usando for normal...");
		for (int i = 0; i < aprovado.size(); i++) {
			System.out.println(aprovado.get(i));
		}

		System.out.println("\nusando forEach...");
		for (String nome : aprovado) {
			System.out.println(nome);
		}
		System.out.println("\nusando Iterator...");
		Iterator<String> iterator = aprovado.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nusando stream...");
		Stream<String> stream = aprovado.stream();
		stream.forEach(System.out::println);
		
	}
}
