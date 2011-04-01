import org.junit.Test;
import static org.junit.Assert.*;


public class MilharTest {
	
	@Test
	public void unidades() {
		assertEquals("mil", porExtenso(1));
		assertEquals("cinco mil", porExtenso(5));
	}

	@Test
	public void dezenas() {
		assertEquals("dez mil", porExtenso(10));
		assertEquals("noventa e nove mil", porExtenso(99));
	}

	@Test
	public void centenas() {
		assertEquals("cento quarenta e cinco mil", porExtenso(145));
	}

	private String porExtenso(int milhares) {
		return new Milhar(milhares).porExtenso();
	}

}
