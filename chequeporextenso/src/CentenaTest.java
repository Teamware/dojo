import org.junit.Test;
import static org.junit.Assert.*;



public class CentenaTest {
	
	@Test
	public void cento() {
		assertEquals("cento", porExtenso(1));
	}

	@Test
	public void duzentos() {
		assertEquals("duzentos", porExtenso(2));
	}

	@Test
	public void trezentos() {
		assertEquals("trezentos", porExtenso(3));
	}

	@Test
	public void quatrozentos() {
		assertEquals("quatrozentos", porExtenso(4));
	}

	@Test
	public void quinientos() {
		assertEquals("quinientos", porExtenso(5));
	}

	@Test
	public void seicentos() {
		assertEquals("seiscentos", porExtenso(6));
	}
	
	@Test
	public void setecentos() {
		assertEquals("setecentos", porExtenso(7));
	}

	@Test
	public void oitocentos() {
		assertEquals("oitocentos", porExtenso(8));
	}

	@Test
	public void novecentos() {
		assertEquals("novecentos", porExtenso(9));
	}

	@Test
	public void semCentena() {
		assertEquals("", porExtenso(0));
	}

	private String porExtenso(int centena) {
		return new Centena(centena).porExtenso();
	}

}
