open module app.calculo {

	exports br.com.leo.app.calculo;
	requires transitive app.logging;

	exports br.com.leo.app.calculo.interno to app.financeiro;

}