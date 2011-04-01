import org.junit.Test;
import static org.junit.Assert.*;



public class DezenaTest {

	
	@Test(expected=IllegalArgumentException.class)
	public void dezenaInvalida() {
		porExtenso(11);
	}

	@Test
	public void dez() {
		assertEquals("dez", porExtenso(1));
	}

	@Test
	public void vinte() {
		assertEquals("vinte", porExtenso(2));
	}

	@Test
	public void trinta() {
		assertEquals("trinta", porExtenso(3));
	}

	@Test
	public void quarenta() {
		assertEquals("quarenta", porExtenso(4));
	}

	@Test
	public void cinquenta() {
		assertEquals("cinquenta", porExtenso(5));
	}

	@Test
	public void sessenta() {
		assertEquals("sessenta", porExtenso(6));
	}

	@Test
	public void setenta() {
		assertEquals("setenta", porExtenso(7));
	}

	@Test
	public void oitenta() {
		assertEquals("oitenta", porExtenso(8));
	}

	@Test
	public void noventa() {
		assertEquals("noventa", porExtenso(9));
	}

	@Test
	public void semDezena() {
		assertEquals("", porExtenso(0));
	}

	private String porExtenso(int dezena) {
		return new Dezena(dezena).porExtenso();
	}
}
