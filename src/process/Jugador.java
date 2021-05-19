package process;

import java.util.LinkedList;
import java.util.List;

public class Jugador {
	List<Aceituna> lanzamientos;

	public Jugador() {
		lanzamientos = new LinkedList<Aceituna>();
	}

	public void agregarAceituna(Aceituna aceituna) {
		lanzamientos.add(aceituna);
	}

	public void aVer() {
		for (Aceituna aceituna : lanzamientos) {
			System.out.println(aceituna.distanciaACentro());
		}
	}

	public List<Aceituna> getLanzamientos() {
		return lanzamientos;
	}

	public int puntaje(Circulo c) {
		int puntuacion = 0;
		for (Aceituna aceituna : lanzamientos) {
			if (aceituna.distanciaACentro() <= c.getRadio())
				puntuacion++;
		}
		return puntuacion;
	}
}
