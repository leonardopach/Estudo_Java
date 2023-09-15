package br.com.leo.cm.modelo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.leo.cm.excecao.ExplosaoException;

public class CampoTeste {

    private Campo campo;

    @BeforeEach
    void iniciarCampo() {
	campo = new Campo(3, 3);
    }

    @Test
    void testeVizinhoDistancia1Esquerda() {
	Campo vizinho = new Campo(3, 2);
	boolean resultado = campo.adicionarVizinho(vizinho);
	assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Direita() {
	Campo vizinho = new Campo(3, 4);
	boolean resultado = campo.adicionarVizinho(vizinho);
	assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Top() {
	Campo vizinho = new Campo(2, 3);
	boolean resultado = campo.adicionarVizinho(vizinho);
	assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia1Baixo() {
	Campo vizinho = new Campo(4, 3);
	boolean resultado = campo.adicionarVizinho(vizinho);
	assertTrue(resultado);
    }

    @Test
    void testeVizinhoDistancia2() {
	Campo vizinho = new Campo(2, 2);
	boolean resultado = campo.adicionarVizinho(vizinho);
	assertTrue(resultado);
    }

    @Test
    void testeNaoVizinho() {
	Campo vizinho = new Campo(1, 1);
	boolean resultado = campo.adicionarVizinho(vizinho);
	assertFalse(resultado);
    }

    @Test
    void testeValorPadraoAtributoMarcado() {
	assertFalse(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacao() {
	campo.alternarMarcacao();
	assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacaoDuasChamadas() {
	campo.alternarMarcacao();
	campo.alternarMarcacao();
	assertFalse(campo.isMarcado());
    }

    @Test
    void testeAbrirNaoMinadoNaoMarcado() {
	assertTrue(campo.abrir());
    }

    @Test
    void testeAbrirNaoMinadoMarcado() {
	campo.alternarMarcacao();
	assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoMarcado() {
	campo.alternarMarcacao();
	campo.minar();
	assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirMinadoNaoMarcado() {
	campo.minar();

	assertThrows(ExplosaoException.class, () -> {
	    campo.abrir();
	});
    }

    @Test
    void testeAbrirComVizinho1() {
	Campo campo11 = new Campo(1, 1);
	Campo campo22 = new Campo(2, 2);

	campo22.adicionarVizinho(campo11);

	campo.adicionarVizinho(campo22);
	campo.abrir();

	assertTrue(campo22.isAberto() && campo11.isAberto());
    }

    @Test
    void testeAbrirComVizinho2() {
	Campo campo11 = new Campo(1, 1);
	Campo campo12 = new Campo(1, 2);

	campo12.minar();
	Campo campo22 = new Campo(2, 2);

	campo22.adicionarVizinho(campo11);
	campo22.adicionarVizinho(campo12);

	campo.adicionarVizinho(campo22);
	campo.abrir();

	assertTrue(campo22.isAberto() && campo11.isFechado());
    }

    @Test
    public void testGetLinha() {
	assertEquals(3, campo.getLinha());
    }

    @Test
    public void testGetColuna() {
	assertEquals(3, campo.getColuna());
    }

    @Test
    public void testObjetivoAlcancadoDesvendado() {
	campo.abrir();
	assertTrue(campo.objetivoAlcancado());
    }

    @Test
    public void testObjetivoAlcancadoProtegido() {
	campo.minar();
	campo.alternarMarcacao();
	assertTrue(campo.objetivoAlcancado());
    }

    @Test
    public void testObjetivoAlcancadoNaoAlcancado() {
	assertFalse(campo.objetivoAlcancado());
    }

    @Test
    public void testMinasNaVizinhanca() {
	Campo vizinho1 = new Campo(0, 1);
	Campo vizinho2 = new Campo(1, 0);
	campo.adicionarVizinho(vizinho1);
	campo.adicionarVizinho(vizinho2);
	vizinho1.minar();
	assertEquals(0, campo.minasNaVizinhanca());
    }

    @Test
    public void testToStringMarcado() {
	campo.alternarMarcacao();
	assertEquals("x", campo.toString());
    }

    @Test
    public void testToStringAbertoMinado() {
	campo.minar();
	assertThrows(ExplosaoException.class, () -> {
	    campo.abrir();
	});
	assertEquals("*", campo.toString());
    }

    @Test
    public void testToStringAbertoComMinasNaVizinhanca() {
	Campo vizinho1 = new Campo(0, 1);
	Campo vizinho2 = new Campo(1, 0);
	campo.adicionarVizinho(vizinho1);
	campo.adicionarVizinho(vizinho2);
	vizinho1.minar();
	campo.abrir();
	assertEquals(" ", campo.toString());
    }

    @Test
    public void testToStringAbertoVazio() {
	campo.abrir();
	assertEquals(" ", campo.toString());
    }

    @Test
    public void testToStringFechado() {
	assertEquals("?", campo.toString());
    }
}
