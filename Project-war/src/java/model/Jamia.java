package model;

public class Jamia {
	
	private int id;
	private String namej,city,email,password,tel;
	public Jamia(String namej, String city, String email, String password, String tel) {
		super();
		this.namej = namej;
		this.city = city;
		this.email = email;
		this.password = password;
		this.tel = tel;
	}
	public Jamia(int id, String namej, String city, String email, String password, String tel) {
		super();
		this.id = id;
		this.namej = namej;
		this.city = city;
		this.email = email;
		this.password = password;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamej() {
		return namej;
	}
	public void setNamej(String namej) {
		this.namej = namej;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
