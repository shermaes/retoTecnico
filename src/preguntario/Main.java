package preguntario;

public class Main {

	public static void main(String[] args) {

		Game game = new Game();
		game.startGame();
		Conexion conexion = new Conexion();
		conexion.getConnection();
		conexion.createStatement();
		conexion.consultaHistorial();
	}
}
