package Connect;

import java.sql.*;

public class jdbc{
	
	public static void main(String[] args) {
		try {
			
			System.out.println("Intento conectarme a DB");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo?useSSL=false", "diego", "cepillo166");
			System.out.println("Conexion exitosa");
			
			Statement estado = con.createStatement();
			ResultSet resultado = estado.executeQuery("SELECT * from ciudades");
			System.out.println("ID \t Nombre");
			while (resultado.next()) {
				System.out.println(resultado.getString("idciudades")+"\t"+resultado.getString("nombre"));
				
			}
			
			
		} catch (SQLException ex) {
			System.out.println("Error de SQL");
			
			// TODO: handle exception
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
		System.out.println("Se encontro error" + e.getMessage());
	}
}
	}