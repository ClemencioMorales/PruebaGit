package es.miw.upm.git.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.miw.upm.git.Suma;

public class SumaTest {

	private Suma suma;
	
	@Before
	public void setUp(){
		this.suma = new Suma(8, 2);
	}
	
	@Test
	public void test() {
		assertEquals(10, suma.sumar());
	}

}
