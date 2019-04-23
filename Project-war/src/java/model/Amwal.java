package model;

public class Amwal {
	
	private int idamwal,idpersone;
	private String montant,time,place;
	
	
	public Amwal(int idamwal, int idpersone, String montant, String time, String place) {
		super();
		this.idamwal = idamwal;
		this.idpersone = idpersone;
		this.montant = montant;
		this.time = time;
		this.place = place;
	}
	
	public Amwal(int idpersone, String montant, String time, String place) {
		super();
		this.idpersone = idpersone;
		this.montant = montant;
		this.time = time;
		this.place = place;
	}

	public int getIdamwal() {
		return idamwal;
	}

	public void setIdamwal(int idamwal) {
		this.idamwal = idamwal;
	}

	public int getIdpersone() {
		return idpersone;
	}

	public void setIdpersone(int idpersone) {
		this.idpersone = idpersone;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	
}
