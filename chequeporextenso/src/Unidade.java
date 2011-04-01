
public class Unidade {

	private final int unidade;

	public Unidade(int numero) {
		this.unidade = numero;
	}

	public String porExtenso() {
		
		switch(unidade) {
		case 0:
			return "";
		case 1:
			return "um";
		case 2:
			return "dois";
		case 3:
			return "tres";
		case 4:
			return "quatro";
		case 5:
			return "cinco";
		case 6:
			return "seis";
		case 7:
			return "sete";
		case 8:
			return "oito";
		case 9:
			return "nove";
		}
		
		throw new IllegalStateException("N‹o sei como colocar por extenso " + unidade);
	}

	public boolean existe() {
		return unidade!=0;
	}

	public static Unidade apartirDe(int numero) {
		return new Unidade(numero % 10);
	}
	
	

}
