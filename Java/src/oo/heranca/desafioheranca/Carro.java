package oo.heranca.desafioheranca;

public class Carro {

	public final int VELOCIDADE_MAXIMA;
	protected int velocidadeAtual = 0;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {

		if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= delta;
		} else {
			velocidadeAtual = 0;
		}
	}

	@Override
	public String toString() {
		return "Velocidade: " + velocidadeAtual + " Km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
