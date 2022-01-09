package preguntario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {

	private static Connection conn;
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "" ;
	private static final String url = "jdbc:mysql://localhost:3306/preguntario";
	
	public Conexion() {
      conn=null;
      try {
    	  Class.forName(driver);
    	  conn=DriverManager.getConnection(url,user, password);
    	  if (conn!=null){
    		  System.out.println("Conexion establecida...");
    		 
    	  }
      } catch(ClassNotFoundException | SQLException e ) {
    	  System.out.println("Error al conectar..."+ e);
      }
	}
	 public Connection getConnection() {
		 return conn;
		 
	 }
	 
	 public void desconectar() {
		  conn=null;
		  if(conn==null) {
			  System.out.println("Conexion culminada...");
		  }
	 }
	public void createStatement() {
		try {
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO historico (jugador, puntaje) VALUES(?, ?)") ;
		stmt.setString(1, Game.player);
		stmt.setLong(2,Game.premio);
        stmt.executeUpdate();
        stmt.close();
            System.out.println("Llamada agregada con éxito a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error!, la llamada no pudo ser agregada a la base de datos."+ e);
        }
	}
	
	
}
