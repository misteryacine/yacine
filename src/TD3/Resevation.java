package TD3;

public class Resevation {
	private String numero;
	private String etat;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Resevation(String numero, String etat) {
		super();
		this.numero = numero;
		this.etat = etat;
	}
	public Resevation() {
		super();
	}
	
	

}
