
public class Milhao {

	private final int milhoes;

	public Milhao(int numero) {
		this.milhoes = numero;
	}

	public static Milhao apartirDe(int numero) {
		return new Milhao(numero % 1000000000 / 1000000);
	}

	public String porExtenso() {
		switch(milhoes) {
		case 0:
			return "";
		case 1:
			return "um milh‹o";
		default:
			return new NumeroSimples(milhoes).porExtenso() + " milh›es";
		}
	}

	public boolean existe() {
		return milhoes!=0;
	}

}
