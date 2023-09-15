package oo.heranca.desafioheranca;

public interface Luxo {

	public void ligarAr();
	abstract void desligarAr();
	
	default int velocidadeAr() {
		return 1;
	};
}
