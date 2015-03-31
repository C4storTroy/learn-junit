package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPessoa {

	@Test
	public void testPessoa(){
		Pessoa p1 = new Pessoa();
		assertEquals("Lucio", p1.getFirstName());
		assertEquals(3, p1.getMaxBooks());
	}

	@Test
	public void testSetFirstName() {
		Pessoa p2 = new Pessoa();
		p2.setFirstName("Raf");
		assertEquals("Raf", p2.getFirstName());
	}

	@Test
	public void testSetMaxBooks() {
		Pessoa p3 = new Pessoa();
		p3.setMaxBooks(6);
		assertEquals(6, p3.getMaxBooks());		
	}

}
