package br.com.geometria.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.geometria.model.Ponto;
import br.com.geometria.model.Reta;

public class RetaTest {

	@Test
	public void testGetComprimento() {
		Reta r = new Reta(
				new Ponto(new Double(1), new Double(1)),
				new Ponto(new Double(2), new Double(1))
				);
		assertEquals(new Double(1), r.getComprimento());
	}

}
