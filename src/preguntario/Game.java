package preguntario;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

	static int premio;
	int respuesta;
	int ronda = 1;
	boolean next;
	int salida;
	int valida = 1;
	static String player;
	int k;

	// constructores

	public int getPremio() {
		return premio;
	}

	public int setPremio(int premio) {
		return this.premio = premio;
	}

	public String getPlayer() {
		return player;
	}

	public String setPlayer(String player) {
		return this.player = player;
	}

	public Game() {
		
	}
	
	
    Banco banco = new Banco();
	Scanner read = new Scanner(System.in);

	// metodos

	public void createPlayer() {
		Scanner read = new Scanner(System.in);
		System.out.println("Bienvenido a ^Preguntario^ indique su nombre a continuacion");		
		player = read.nextLine();	
		System.out.println("Bienvenido " +player+ " empecemos a jugar!");
		read.close();
	}

	public void startGame() {
        createPlayer();
		System.out.println("Los puntos a conseguir por cada ronda son: 100");
		System.out.println("--------------------------------");
		banco.questions1();
		
		if (banco.resultado == valida) {
			ronda = ronda + 1;
			premio = premio + 100;
			System.out.println("Sigamos a la siguiente ronda "+player);
		} else {
			historico();
		}

		if (banco.resultado == valida) {
			System.out.println("--------------------------------");
			confirmExit();
			System.out.println("--------------------------------");
			banco.questions2();
			if (banco.resultado == 1) {
				ronda = ronda + 1;
				premio = premio + 100;
				System.out.println("Sigamos a la siguiente ronda "+player);
			} else {
				historico();
			}
		}

		if (banco.resultado == valida) {
			System.out.println("--------------------------------");
			confirmExit();
			System.out.println("--------------------------------");
			banco.questions3();
			if (banco.resultado == 1) {
				ronda = ronda + 1;
				premio = premio + 100;
				System.out.println("Sigamos a la siguiente ronda "+player);
			} else {
				historico();
			}
		}

		if (banco.resultado == valida) {
			System.out.println("--------------------------------");
			confirmExit();
			System.out.println("--------------------------------");
			banco.questions4();
			if (banco.resultado == 1) {
				ronda = ronda + 1;
				premio = premio + 100;
				
				System.out.println("Sigamos a la siguiente ronda "+player);
			} else {
				historico();
			}
		}

		if (banco.resultado == valida) {
			System.out.println("--------------------------------");
			confirmExit();
			banco.questions5();
			if (banco.resultado == 1) {
				ronda = ronda + 1;
				premio = premio + 100;
				winner();
				historico();
			}
		}

	
	}
	public void confirmExit() {
		System.out.println("Desea retirarse con lo que lleva acumulado?\n Indique 1 para si o 0 para no");
		salida = read.nextInt();
		if (salida == valida) {
			System.out.println("Usted ha salido del juego con una puntuacion de: " + premio);
			continuar();
		} else {

			System.out.println("Usted ha pasado a la " + ronda + " ronda con " + premio + " puntos");

		}
	}

	public void winner() {
		System.out.println("________$$$$\r\n" + "_______$$__$\r\n" + "_______$___$$\r\n" + "_______$___$$\r\n"
				+ "_______$$___$$\r\n" + "________$____$$\r\n" + "________$$____$$$\r\n" + "_________$$_____$$\r\n"
				+ "_________$$______$$\r\n" + "__________$_______$$\r\n" + "____$$$$$$$________$$\r\n"
				+ "__$$$_______________$$$$$$\r\n" + "_$$____$$$$____________$$$\r\n"
				+ "_$___$$$__$$$____________$$\r\n" + "_$$________$$$____________$\r\n"
				+ "__$$____$$$$$$____________$\r\n" + "__$$$$$$$____$$___________$\r\n"
				+ "__$$_______$$$$___________$\r\n" + "___$$$$$$$$$__$$_________$$\r\n"
				+ "____$________$$$$_____$$$$\r\n" + "____$$____$$$$$$____$$$$$$\r\n" + "_____$$$$$$____$$__$$\r\n"
				+ "_______$_____$$$_$$$\r\n" + "________$$$$$$$$$$\r\n" + "");
		System.out.println("Usted ha ganado ^Preguntario^ con un total de " + premio + " puntos");
	}

	public void loser(String player) {

		premio = 0;
		System.out.println("Usted ha perdido esta ronda y sus premios");
		banco.resultado=3;
	}

	public void historico() {
		ArrayList<String> listPlayers = new ArrayList<String>();
		listPlayers.add(player);
		System.out.println("-----------------------------------");
		System.out.println("Historial de jugadores");
		for (int i = 0; i < listPlayers.size(); i++) {
			System.out.println("Jugador:" + listPlayers.get(i));
		}
	}

    public void continuar() {
    	System.out.println("Que pase el siguiente jugador!\n Si desea continuar presione 1\n Si dejara de jugar presione 0");
    	k = read.nextInt();
    	if(k==1) {
    		startGame();
    	}else {
    	System.out.println("Gracias por jugar a ^Preguntario^");
    	}
		}
    	
    }

