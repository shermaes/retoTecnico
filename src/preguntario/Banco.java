package preguntario;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;

public class Banco {

	String pregunta;
	int respuestaC;
	int respuesta;
	int ronda;
	int resultado;

	// constructores
	public Banco() {
		super();
		this.pregunta = pregunta;
		this.respuestaC = respuestaC;
	}

	public Banco(String pregunta, int respuestaC) {
		super();
		this.pregunta = pregunta;
		this.respuestaC = respuestaC;
	}

	// metodos
	public void questions1() {

		List<Banco> ejemploLista = new ArrayList<Banco>();
		ejemploLista.add(new Banco(
				"Quien fue el fundador de chocolates Wonka?\n1:Willy Martinez\n2:Mikel Jackson\n3:Willy Wonka\n4:Jose Maestre",
				3));
		ejemploLista.add(
				new Banco("Cuantos dias le toma a la tierra dar una vuelta al sol?\n1:31 \n2:250\n3:360\n4:365", 4));
		ejemploLista.add(new Banco(
				"Cual es el rio mas caudaloso del mundo?\n1:Nilo\n2:Amazonas\n3:Mission Mississippi\n4:Yang Tse Kiang",
				2));
		ejemploLista.add(
				new Banco("Donde se encuentra la casa rosada?\n1:Argentina\n2:Colombia\n3:Venezuela\n4:Filipinas", 1));
		ejemploLista.add(new Banco(
				"Una arepa catira en Venezuela lleva: \n1:Mozzarella\n2:Queso amarillo\n3:Frijoles negros\n4:Huevo",
				2));
		randomPick(ejemploLista);
	}

	public void questions2() {

		List<Banco> ejemploLista = new ArrayList<Banco>();
		ejemploLista.add(new Banco(
				"Como se llamaba el caballo de Don Quijote de la mancha?\n1:Rucio Moro\n2:Rocinante\n3:Copo de nieve\n4:Nevado",
				2));
		ejemploLista.add(new Banco("Cuantos elementos tiene la tabla periodica\n1:118\n2:117\n3:120\n4:122", 1));
		ejemploLista.add(new Banco(
				"Que ciencia estudia la sangre?\n1:Ciencia Hematologica\n2:Hematologia\n3:Hematolociencia\n4:Ciencia de la sangre y el plasma",
				2));
		ejemploLista.add(new Banco(
				"Como se llama el protagonista de la serie CSI:MIAMI?\n1:Argent\n2:Alan\n3:Horacio\n4:Philip", 3));
		ejemploLista.add(new Banco(
				"En Venezuela se dice que es una reina pepiada: \n1:Una mujer muy hermosa\n2:Una arepa\n3:Una gran cantidad de dinero\n4:Una coincidencia",
				2));
		randomPick(ejemploLista);
	}

	public void questions3() {

		List<Banco> ejemploLista = new ArrayList<Banco>();
		ejemploLista.add(new Banco("Cuanto duro la guerra de los 100 años?\n1:100\n2:161\n3:110\n4:116", 4));
		ejemploLista.add(new Banco(
				"Que carabela no volvio del viaje donde Colon arribo a America la primera vez?\n1:La Pinta\n2:La Nina\n3:La Alejandrina\n4:La Santa Maria",
				4));
		ejemploLista.add(new Banco(
				"Que isla sirvio de prision para Napoleon tras ser derrotado en Waterloo?\n1:Santa Elena\n2:Santa Eulalia\n3:Santa Ana\n4:Santa Maria",
				1));
		ejemploLista.add(new Banco(
				"En que pais se habla mayoritariamente el idioma Tagalog?\n1:Filipinas\n2:Corea del sur \n3:Japon\n4:Corea del norte",
				1));
		ejemploLista.add(
				new Banco("Cual es la ciudad mas poblada de Africa\n1:El cairo\n2:Nairobi\n3:Luanda\n4:Pretoria", 1));
		randomPick(ejemploLista);
	}

	public void questions4() {
		List<Banco> ejemploLista = new ArrayList<Banco>();
		ejemploLista.add(new Banco(
				"Como se llama el plato de puchero tipico de Hungria hecho a partir de carne, cebolla y pimientos?\n1:Strogonoff\n2:Gulash\n3:Palacsinta\n4:Somloi Galuska",
				2));
		ejemploLista.add(new Banco(
				"Como se llama el manga de Kentaro Miura protagonizado por Guts?\n1:Berserk \n2:Jungle Taitei\n3:Sazae-San\n4:Guts-San",
				1));
		ejemploLista.add(new Banco(
				"De que estilo arquitectonico es la catedral de Notre Dame?\n1:Gotico\n2:Eclesiastico\n3:Oscurantista\n4:Contemporaneo",
				1));
		ejemploLista.add(new Banco(
				"De que pais es originario el tipo de poema breve de diecisiete sílabas, escrito en tres versos de cinco, siete y cinco sílabas respectivamente?\n1:Filipinas\n2:Corea del sur \n3:Japon\n4:Corea del norte",
				3));
		ejemploLista.add(new Banco(
				"Que animal mitologico da nombre a uno de los libros mas conocidos de Thomas Hobbes?\n1:El monstruo del lago Ness\n2:Dracula\n3:Leviatan\n4:La Quimera",
				3));
		randomPick(ejemploLista);
	}

	public void questions5() {
		List<Banco> ejemploLista = new ArrayList<Banco>();
		ejemploLista.add(new Banco(
				"Como se llama el pintor noruego autor de la obra 'El Grito'?\n1:Picasso\n2:Eda Munch\n3:Edvard Munch\n4:Edward Durin",
				3));
		ejemploLista.add(new Banco(
				"El reino protoctista en la naturaleza se dice que esta constituido por:\n1:Protozoos y amebas \n2:Amebas\n3:Bacterias y algas\n4:Protozoos",
				1));
		ejemploLista.add(new Banco(
				"Alrededor de que planeta orbitan los satelites Ganimedes, Calisto, Io y Europa?\n1:Venus\n2:Marte\n3:Jupiter\n4:Urano",
				3));
		ejemploLista.add(new Banco(
				"Con que denominacion se conoce la linea dibujada por las estrellas Alnitak, Alnilam y Mintaka vistas desde nuetro planeta?\n1:Osa mayor\n2:Osa menor\n3:Cancer\n4:Cinturon de Orion",
				4));
		ejemploLista.add(new Banco(
				"Como se llama el tipo de celula nerviosa mas abundante en el cerebro humano?\n1:Neuronas\n2:Celulas gliales\n3:Globulos rojos\n4:Materia gris",
				2));
		randomPick(ejemploLista);
	}

	public int randomPick(List<Banco> ejemploLista) {
		Random rand = new Random();
		Scanner read = new Scanner(System.in);
		Game game1 = new Game();
		int index = rand.nextInt(ejemploLista.size());
		System.out.println("Su pregunta a responder es...\n" + ejemploLista.get(index).pregunta);
		System.out.println(" ");
		System.out.println("Indique su respuesta a continuacion:");
		respuesta = read.nextInt();

		if (respuesta == ejemploLista.get(index).respuestaC) {
			System.out.println("Su respuesta es correcta");
			resultado = 1;
		} else {
			System.out.println("Oops esa no era la respuesta");
			resultado = 0;
			game1.loser(game1.player);
		}
		return resultado;

	}

}
