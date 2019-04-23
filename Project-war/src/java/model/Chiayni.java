package model;

public class Chiayni {
	
	private int idchi,idpersone;
	private String chose,quantite,time,place;
	public Chiayni(int idchi, int idpersone, String chose, String quantite, String time, String place) {
		super();
		this.idchi = idchi;
		this.idpersone = idpersone;
		this.chose = chose;
		this.quantite = quantite;
		this.time = time;
		this.place = place;
	}
	public Chiayni(int idpersone, String chose, String quantite, String time, String place) {
		super();
		this.idpersone = idpersone;
		this.chose = chose;
		this.quantite = quantite;
		this.time = time;
		this.place = place;
	}
	public int getIdchi() {
		return idchi;
	}
	public void setIdchi(int idchi) {
		this.idchi = idchi;
	}
	public int getIdpersone() {
		return idpersone;
	}
	public void setIdpersone(int idpersone) {
		this.idpersone = idpersone;
	}
	public String getChose() {
		return chose;
	}
	public void setChose(String chose) {
		this.chose = chose;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
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
