package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {

	public static void main(String[] args) {

		File file = new File("D:\\arquivo.txt");

		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		System.out.println(file.canRead());
	}
}
