import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class NumeroSimplesTest {
	
	@Test
	public void umaUnidade() {
		assertEquals("um", porExtenso(1));
		assertEquals("cinco", porExtenso(5));
		assertEquals("nove", porExtenso(9));
	}

	@Test
	public void dezenaEUnidade() {
		assertEquals("cinquenta e dois", porExtenso(52));		
		assertEquals("quarenta e tres", porExtenso(43));		
	}

	@Test
	public void dezenaSemUnidade() {
		assertEquals("dez", porExtenso(10));		
		assertEquals("vinte", porExtenso(20));		
		assertEquals("sessenta", porExtenso(60));		
		assertEquals("noventa", porExtenso(90));		
	}
	
	@Test
	public void centena() {
		assertEquals("duzentos", porExtenso(200));
		assertEquals("setecentos", porExtenso(700));
	}
	
	@Test
	public void centenaEDezena() {
		assertEquals("quinientos dez", porExtenso(510));
		assertEquals("duzentos setenta", porExtenso(270));
	}
	
	@Test
	public void centenaEUnidade() {
		assertEquals("novecentos um", porExtenso(901));
		assertEquals("oitocentos sete", porExtenso(807));
	}
	
	@Test
	public void centenaEDezenaEUnidade() {
		assertEquals("cento cinquenta e sete", porExtenso(157));
		assertEquals("duzentos trinta e quatro", porExtenso(234));
		assertEquals("novecentos noventa e nove", porExtenso(999));
	}
	
	@Test
	public void numerosIrregulares() {
		assertEquals("onze", porExtenso(11));
		assertEquals("quince", porExtenso(15));
		assertEquals("vintenove", porExtenso(29));
		assertEquals("cem", porExtenso(100));
	}

	private String porExtenso(int numero) {
		return new NumeroSimples(numero).porExtenso();
	}
	
}
