
public class NumeroSimples {

	private final int numero;

	public NumeroSimples(int numero) {
		if(numero<0 || numero>999)
			throw new IllegalArgumentException("Numero simples deve estar entre 0 e 999");
		this.numero = numero;
	}

	public String porExtenso() {
		StringBuffer numeroPorExtenso = new StringBuffer();
		
		String irregulares = trataIrregulares();
		if(!irregulares.isEmpty())
			return irregulares.toString();
			
		
		Centena centena = Centena.apartirDe(numero);
		Dezena dezena = Dezena.apartirDe(numero);
		Unidade unidade = Unidade.apartirDe(numero);
		
		if(centena.existe())
			numeroPorExtenso.append(centena.porExtenso());
		
		if(centena.existe() && (dezena.existe() || unidade.existe()))
			numeroPorExtenso.append(" ");
		
		if(dezena.existe())
			numeroPorExtenso.append(dezena.porExtenso());
		
		if(dezena.existe() && unidade.existe())
			numeroPorExtenso.append(" e ");
		
		if(numeroPorExtenso.length()==0 || unidade.existe())
			numeroPorExtenso.append(unidade.porExtenso());
		
		return numeroPorExtenso.toString();
	}

	private String trataIrregulares() {
		switch(numero) {
		case 11:
			return "onze";
		case 15:
			return "quince";
		case 29:
			return "vintenove";
		case 100:
			return "cem";
		}
		return "";
	}

	public boolean existe() {
		return numero!=0;
	}

	public static NumeroSimples apartirDe(int numero) {
		return new NumeroSimples(numero % 1000);
	}

	
}
