package tratement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Amelbadani;
import model.Amelmihani;
import model.Amwal;
import model.Chiayni;
import model.Jamia;
import model.Jamiai;
import model.Persone;
import model.Sang;

import java.sql.Connection;

public class Comand {

	
	public static Connection getConection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/memoire", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public void save(Persone sp) {
		try {
			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ps.executeUpdate("INSERT INTO `persone` VALUES (null,'" + sp.getName()
					+ "','" + sp.getLastname() + "','" + sp.getCity() + "','" + sp.getEmail() + "','" + sp.getPassword() + "','"+ sp.getTel() +"')");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void savei(Jamiai jami) {
		try {
			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ps.executeUpdate("INSERT INTO `jamiai` VALUES (null,'" + jami.getName()
					+ "', '" + jami.getNamej() + "','" + jami.getPlace() + "','" + jami.getTypet() + "','" + jami.getTime() + "','" + jami.getMessage()+"')");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void savej(String namej, String city, String email, String password,String tel) {
		try {
			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ps.executeUpdate("INSERT INTO `jamia` VALUES (null,'" + namej
					+ "','" + city + "','" + email + "','" + password + "','"+tel+"')");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	public void saveSang(Sang sg) {
		try {
			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ps.executeUpdate("INSERT INTO `sang` VALUES (null,'" + sg.getTime()
					+ "','" + sg.getPlace() + "','" + sg.getQuantite() + "','" + sg.getCategory() + "','" + sg.getIdpersone() + "')");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	public void saveAmwal(Amwal a) {
		try {
			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ps.executeUpdate("INSERT INTO `amwal` VALUES (null,'" + a.getMontant()
					+ "','" + a.getTime() + "','" + a.getPlace() + "','" + a.getIdpersone() +"')");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	public void saveAmelmihani(Amelmihani am) {
		try {
			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ps.executeUpdate("INSERT INTO `amelmihani` VALUES (null,'" + am.getLesjours()
					+ "','" + am.getTime() + "','" + am.getPlace() + "','" + am.getIdpersone() +"')");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	
	public void saveAmelbadani(Amelbadani ab) {
		try {
			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ps.executeUpdate("INSERT INTO `Amelbadani` VALUES (null,'" + ab.getTime()
					+ "','" +  ab.getLesjours() + "','" + ab.getPlace() + "','" + ab.getIdpersone() +"')");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	public void saveChiayni(Chiayni ca) {
		try {
			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ps.executeUpdate("INSERT INTO `chiayni` VALUES (null,'" + ca.getChose()
					+ "','" + ca.getQuantite() + "','" + ca.getTime() + "','" + ca.getPlace() + "','" + ca.getIdpersone() + "')");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public ArrayList<Persone> getallPersone() throws SQLException {
		ArrayList<Persone> persone = new ArrayList<>();

		try {
			Connection conn = getConection();

			Statement ps = conn.createStatement();

			ResultSet result = ps.executeQuery("SELECT * FROM `persone`");

			while (result.next()) {
				persone.add(new Persone(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
						result.getString(5), result.getString(6),result.getString(7)));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return persone;
	}
	
	
	public ArrayList<Jamiai> getalli() throws SQLException {
		ArrayList<Jamiai> jami = new ArrayList<>();

		try {
			Connection conn = getConection();

			Statement ps = conn.createStatement();

			ResultSet result = ps.executeQuery("SELECT * FROM `jamiai`");

			while (result.next()) {
				jami.add(new Jamiai(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
						result.getString(5), result.getString(6),result.getString(7)));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return jami;
	}


	public Persone getPersone(String email) {
		Persone persone = null;

		try {

			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ResultSet result = ps.executeQuery("SELECT * FROM `persone` WHERE email='" + email + "'");
			while (result.next()) {
				
				persone = new Persone(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
				result.getString(5), result.getString(6),result.getString(7));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return persone;

	}
	
	public Jamia getJamia(String email) {
		Jamia jamia = null;

		try {

			Connection conn = getConection();
			Statement ps = conn.createStatement();
			ResultSet result = ps.executeQuery("SELECT * FROM `jamia` WHERE email='" + email + "'");
			while (result.next()) {
				
				jamia = new Jamia(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),
				result.getString(5), result.getString(6));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return jamia;

	}

}
