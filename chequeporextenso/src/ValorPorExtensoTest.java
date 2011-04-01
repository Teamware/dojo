import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;


public class ValorPorExtensoTest {
		
	
	@Test
	public void simples() {
		assertEquals("um", porExtenso(1));
		assertEquals("cinquenta e dois", porExtenso(52));
		assertEquals("novecentos trinta e quatro", porExtenso(934));
	}
	
	@Test
	public void milhares() {
		assertEquals("mil", porExtenso(1000));
		assertEquals("duzentos mil", porExtenso(200 * 1000));
		assertEquals("trezentos cinquenta e dois mil duzentos cinquenta e sete", porExtenso(352257));
	}
	
	@Test
	public void milhoes() {
		assertEquals("cem milh›es", porExtenso(100000000));
		assertEquals("cento cinquenta e tres milh›es e um", porExtenso(153000001));
	}
	
	@Test
	public void teste() {
		for(int x=0; x<100; x++) {
			int numero = new Random().nextInt();
			if(numero<0)
				numero = -numero;
			System.out.println( numero + ": " + porExtenso(numero));
		}
	}

	private String porExtenso(int numero) {		
		return ValorPorExtenso.porExtenso(numero);
	}
	

}
