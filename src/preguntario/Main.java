package preguntario;

public class Main {

	public static void main(String[] args) {

		Game game = new Game();
		game.startGame();
		game.continuar();
        Conexion conexion = new Conexion();
        conexion.getConnection();
        conexion.createStatement();
	}
}
