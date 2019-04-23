package model;

public class Persone {
	private int id;
	private String name, lastname, city, email, password, tel;

	public Persone(String name, String lastname, String city, String email, String password, String tel) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.city = city;
		this.email = email;
		this.password = password;
		this.tel = tel;
	}
	public Persone(int id, String name, String lastname, String city, String email, String password, String tel) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.city = city;
		this.email = email;
		this.password = password;
		this.tel = tel;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

}
