package oo.heranca.desafioheranca;

public class Civic extends Carro implements Esportivo {

	public Civic() {
		super(213);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		setDelta(35);
		
	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		setDelta(15);
	}
	
	
}
