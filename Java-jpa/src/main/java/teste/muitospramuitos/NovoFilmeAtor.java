package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[ ] args) {
		Filme filmeA = new Filme("Star Wars episode 4", 8.7);
		Filme filmeB = new Filme("Startrek", 9.0);

		Ator ator = new Ator("Roberto carlos");
		Ator atrizB = new Ator("Silva MArques");
		
		filmeA.adicionarAtor(ator);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(ator);
		
		DAO<Filme> dao = new DAO<>();
		
		dao.incluirAtomico(filmeB);
	}

}
