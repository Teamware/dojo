import org.junit.Test;
import static org.junit.Assert.*;



public class UnidadeTest {

	private String porExtenso(int numero) {
		return new Unidade(numero).porExtenso();
	}

	@Test
	public void um() {
		assertEquals("um", porExtenso(1));
	}

	@Test
	public void dois() {
		assertEquals("dois", porExtenso(2));
	}

	@Test
	public void tres() {
		assertEquals("tres", porExtenso(3));
	}

	@Test
	public void quatro() {
		assertEquals("quatro", porExtenso(4));
	}

	@Test
	public void cinco() {
		assertEquals("cinco", porExtenso(5));
	}

	@Test
	public void seis() {
		assertEquals("seis", porExtenso(6));
	}

	@Test
	public void sete() {
		assertEquals("sete", porExtenso(7));
	}

	@Test
	public void oito() {
		assertEquals("oito", porExtenso(8));
	}

	@Test
	public void nove() {
		assertEquals("nove", porExtenso(9));
	}

	@Test
	public void zero() {
		assertEquals("", porExtenso(0));
	}
}
