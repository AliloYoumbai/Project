package model;

public class Amelbadani {
	
	private int idamel,idpersone;
	private String time,lesjours,place;
	public Amelbadani(int idamel, int idpersone, String time, String lesjours, String place) {
		super();
		this.idamel = idamel;
		this.idpersone = idpersone;
		this.time = time;
		this.lesjours = lesjours;
		this.place = place;
	}
	public Amelbadani(int idpersone, String time, String lesjours, String place) {
		super();
		this.idpersone = idpersone;
		this.time = time;
		this.lesjours = lesjours;
		this.place = place;
	}
	public int getIdamel() {
		return idamel;
	}
	public void setIdamel(int idamel) {
		this.idamel = idamel;
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
	public String getLesjours() {
		return lesjours;
	}
	public void setLesjours(String lesjours) {
		this.lesjours = lesjours;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	

}
