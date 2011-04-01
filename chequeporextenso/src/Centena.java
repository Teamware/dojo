
public class Centena {

	private final int centena;

	public Centena(int centena) {
		this.centena = centena;
	}

	public static Centena apartirDe(int numero) {
		return new Centena(numero % 1000 / 100);
	}

	public boolean existe() {
		return centena!=0;
	}

	public String porExtenso() {
		switch(centena) {
		case 0:
			return "";
		case 1:
			return "cento";
		case 2:
			return "duzentos";
		case 3:
			return "trezentos";
		case 4:
			return "quatrozentos";
		case 5:
			return "quinientos";
		case 6:
			return "seiscentos";
		case 7:
			return "setecentos";
		case 8:
			return "oitocentos";
		case 9:
			return "novecentos";
		}
		throw new IllegalStateException("N‹o sei como colocar por extenso " + centena); 
	}
	
}
