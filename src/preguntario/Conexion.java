package preguntario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class Conexion {

	private static Connection conn;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "";
	private static final String url = "jdbc:mysql://localhost:3306/preguntario";

	public Conexion() {
		conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			if (conn != null) {
				System.out.println("Conexion establecida...");

			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error al conectar..." + e);
		}
	}

	public Connection getConnection() {
		return conn;

	}

	public void desconectar() {
		conn = null;
		if (conn == null) {
			System.out.println("Conexion culminada...");
		}
	}
    //Carga los jugadores
	public void createStatement() {
		try {
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO historico (jugador, puntaje) VALUES(?, ?)");
			stmt.setString(1, Game.player);
			stmt.setLong(2, Game.premio);
			stmt.executeUpdate();
			stmt.close();
			System.out.println("Jugador agregada con éxito a la base de datos.");
		} catch (SQLException e) {
			System.out.println("Error!, la llamada no pudo ser agregada a la base de datos." + e);
		}
	}
    
	//Muestra los previos jugadores
	@SuppressWarnings("unused")
	public void consultaHistorial() {
		System.out.println("Los jugadores previos fueron:");
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement("SELECT * from historico");
			Statement st;
			DefaultTableModel model = new DefaultTableModel();
			model.addColumn(Game.player);
			model.addColumn(Game.premio);
			String[] dato = new String[2];

			st = conn.createStatement();
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				System.out.println("Jugador "+ result.getString(1));
				System.out.println("Su puntuacion fue: "+ result.getString(2));
			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();

		}

	}

}
