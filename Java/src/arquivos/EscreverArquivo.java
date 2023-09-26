package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverArquivo {

	public static void main(String[] args) {
		String path = "D:\\arquivoo.txt";
		
		String[] lines = new String[] {"Opa eai mano", "tudo bom?"};
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
