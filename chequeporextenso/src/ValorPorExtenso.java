
public class ValorPorExtenso {

	private final int numero;

	public ValorPorExtenso(int numero) {
		this.numero = numero;
	}

	public static ValorPorExtenso apartirDe(int numero) {
		return new ValorPorExtenso(numero);
	}

	public String porExtenso() {
		StringBuffer valorPorExtenso = new StringBuffer();

		Milhao milhoes = Milhao.apartirDe(numero);
		Milhar milhares = Milhar.apartirDe(numero);
		NumeroSimples simples = NumeroSimples.apartirDe(numero);
		
		valorPorExtenso.append(milhoes.porExtenso());
		
		if(milhoes.existe() && (milhares.existe() || simples.existe()))
			valorPorExtenso.append(" e ");
		
		valorPorExtenso.append(milhares.porExtenso());
		
		if(milhares.existe() && simples.existe())
			valorPorExtenso.append(" ");
		
		valorPorExtenso.append(simples.porExtenso());
		
		return valorPorExtenso.toString(); 
	}

	public static String porExtenso(int numero) {
		return apartirDe(numero).porExtenso();
	}

}
