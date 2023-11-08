package TD3;

import java.util.Date;

public class train {
	private Integer numero;
	private Date DateDepart;
	private Integer HeureDepart;
	private Integer HeurDarrive;
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Date getDateDepart() {
		return DateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		DateDepart = dateDepart;
	}
	public Integer getHeureDepart() {
		return HeureDepart;
	}
	public void setHeureDepart(Integer heureDepart) {
		HeureDepart = heureDepart;
	}
	public Integer getHeurDarrive() {
		return HeurDarrive;
	}
	public void setHeurDarrive(Integer heurDarrive) {
		HeurDarrive = heurDarrive;
	}
	//un constructeur avec paramétre
	public train(Integer numero, Date dateDepart, Integer heureDepart, Integer heurDarrive) {
		super();
		this.numero = numero;
		DateDepart = dateDepart;
		HeureDepart = heureDepart;
		HeurDarrive = heurDarrive;
	}
	//un constructeur sans paramétre
	public train() {
		super();
	}
	
	
}
