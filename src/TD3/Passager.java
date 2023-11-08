package TD3;

public class Passager {
	
	private String nom;
	private String prenom;
	
	//une méthode pour retourner le nom
	public String getNom() {
		return nom;
	}
	//une méthode pour modifier le nom
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	//un constructeur pour instancier un passager dans le programme principale 
	public Passager(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Passager() {
		super();
	}
	
	
	
	
	
}
