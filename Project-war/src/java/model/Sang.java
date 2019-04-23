package model;

public class Sang {

	private int idsang,idpersone;
	private String time,place,quantite,category;
	
	
	public Sang(int idsang, int idpersone, String time, String place, String quantite, String category) {
		super();
		this.idsang = idsang;
		this.idpersone = idpersone;
		this.time = time;
		this.place = place;
		this.quantite = quantite;
		this.category = category;
	}

	public Sang( int idpersone, String time, String place, String quantite, String category) {
		super();
		this.idpersone = idpersone;
		this.time = time;
		this.place = place;
		this.quantite = quantite;
		this.category = category;
	}
	public int getIdsang() {
		return idsang;
	}
	public void setIdsang(int idsang) {
		this.idsang = idsang;
	}
	public int getIdpersone() {
		return idpersone;
	}
	public void setIdpersone(int idpersone) {
		this.idpersone = idpersone;
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
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	
}
