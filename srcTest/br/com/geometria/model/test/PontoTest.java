package br.com.geometria.model.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.geometria.model.Ponto;

public class PontoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void localizarNoPlanoOrigem() {
		Ponto p= new Ponto(new Double(0), new Double(0));
		assertEquals("Origem", p.localizarNoPlano());
	}
	
	@Test
	public void localizarNoPlano1Quadrante() {
		Ponto p = new Ponto(new Double(2), new Double(3));
		assertEquals("1º Quadrante", p.localizarNoPlano());
	}
	
	@Test
	public void localizarNoPlano2Quadrante() {
		Ponto p = new Ponto(new Double(-2), new Double(3));
		assertEquals("2º Quadrante", p.localizarNoPlano());
	}
	
	@Test
	public void localizarNoPlano3Quadrante() {
		Ponto p = new Ponto(new Double(-2), new Double(-3));
		assertEquals("3º Quadrante", p.localizarNoPlano());
	}
	
	@Test
	public void localizarNoPlano4Quadrante() {
		Ponto p = new Ponto(new Double(2), new Double(-3));
		assertEquals("4º Quadrante", p.localizarNoPlano());
	}
	
	@Test
	public void localizarNoPlanoEixoX() {
		Ponto p = new Ponto(new Double(2), new Double(0));
		assertEquals("Ponto no eixo de X", p.localizarNoPlano());
	}
	
	@Test
	public void localizarNoPlanoEixoY() {
		Ponto p = new Ponto(new Double(0), new Double(2));
		assertEquals("Ponto no eixo de Y", p.localizarNoPlano());
	}
	
	@Test
	public void getDistanciaTest() {
		Ponto p1 = new Ponto(new Double(0), new Double(2.3));
		Ponto p2 = new Ponto(new Double(3), new Double(2.3));
		assertEquals(new Double(3), p1.getDistancia(p2));
	}
	
	

}
