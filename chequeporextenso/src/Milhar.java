
public class Milhar {

	private final int milhares;

	public Milhar(int milhares) {
		if(milhares<0 || milhares>999)
			throw new IllegalArgumentException("Milhares devem estar entre 0 e 999 milhares e n‹o em " + milhares);
		this.milhares = milhares;
	}

	public String porExtenso() {
		
		switch(milhares) {
		case 0:
			return "";
		case 1:
			return "mil";
		default: 
			return new NumeroSimples(milhares).porExtenso() + " mil";
		}
	}

	public boolean existe() {
		return milhares!=0;
	}

	public static Milhar apartirDe(int numero) {
		return new Milhar((numero % 1000000 / 1000));
	}

}
