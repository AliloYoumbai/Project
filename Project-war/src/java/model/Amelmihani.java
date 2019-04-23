package model;

public class Amelmihani {
	
	private int id,idpersone;
	private String lesjours,time,place;
	public Amelmihani(int id, int idpersone, String lesjours, String time, String place) {
		super();
		this.id = id;
		this.idpersone = idpersone;
		this.lesjours = lesjours;
		this.time = time;
		this.place = place;
	}
	public Amelmihani(int idpersone, String lesjours, String time, String place) {
		super();
		this.idpersone = idpersone;
		this.lesjours = lesjours;
		this.time = time;
		this.place = place;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdpersone() {
		return idpersone;
	}
	public void setIdpersone(int idpersone) {
		this.idpersone = idpersone;
	}
	public String getLesjours() {
		return lesjours;
	}
	public void setLesjours(String lesjours) {
		this.lesjours = lesjours;
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
