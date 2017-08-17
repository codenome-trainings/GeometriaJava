package br.com.geometria.model.test;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.geometria.model.Ponto;
import br.com.geometria.model.Reta;

public class QuadradoTest {
	
	private static Reta lado;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto(new Double(0), new Double(4.2));
		lado = new Reta(p1, p2);
	}

	@Test
	public void testGetArea() {
		
	}

	@Test
	public void testGetPerimetro() {
		fail("Not yet implemented");
	}

}
