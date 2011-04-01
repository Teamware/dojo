
public class Dezena {

	private final int dezena;

	public Dezena(int dezena) {
		if(dezena<0 || dezena>9)
			throw new IllegalArgumentException("Dezena pode ser entre 0 e 9. Dezena invalida:" + dezena);

		this.dezena = dezena;
	}

	public String porExtenso() {
		
		switch(dezena) {
		case 0:
			return "";
		case 1:
			return "dez";
		case 2:
			return "vinte";
		case 3:
			return "trinta";
		case 4:
			return "quarenta";
		case 5:
			return "cinquenta";
		case 6:
			return "sessenta";
		case 7:
			return "setenta";
		case 8:
			return "oitenta";
		case 9:
			return "noventa";
		}
		

		throw new IllegalStateException("N‹o sei como colocar por extenso:" + dezena);
	}

	public boolean existe() {
		return dezena!=0;
	}

	public static Dezena apartirDe(int numero) {
		return new Dezena(numero % 100 / 10);
	}

}
