package process;

import util.*;

import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<String> datosEntrada = new Archivo("entrada.in").leerArchivo();
		List<Aceituna> lanzamientos = new LinkedList<Aceituna>();
		for (int i = 1; i <= Integer.parseInt(datosEntrada.get(0)); i++) {
			String[] linea = datosEntrada.get(i).split(" ");
			lanzamientos.add(new Aceituna(Integer.parseInt(linea[0]), Integer.parseInt(linea[1])));
		}

		Partida part1 = new Partida();
		part1.cargarTiros(lanzamientos);
		part1.cambiarReglas();

		new Archivo("salida.out").escribirArchivo("" + part1.getRadioCuadrado());
	}
}
