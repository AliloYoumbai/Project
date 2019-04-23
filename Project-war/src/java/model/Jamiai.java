package model;

public class Jamiai {
	private int id;
	private String name,namej,place,typet,message,time;
	public Jamiai(int id, String name,String namej, String place, String typet, String message, String time) {
		super();
		this.id = id;
		this.name = name;
		this.namej = namej;

		this.place = place;
		this.typet = typet;
		this.message = message;
		this.time = time;
	}
	public Jamiai(String name,String namej, String place, String typet, String message, String time) {
		super();
		this.name = name;
		this.namej = namej;

		this.place = place;
		this.typet = typet;
		this.message = message;
		this.time = time;
	}
	
	public String getNamej() {
		return namej;
	}
	public void setNamej(String namej) {
		this.namej = namej;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTypet() {
		return typet;
	}
	public void setTypet(String typet) {
		this.typet = typet;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
