package process;

import java.util.List;

public class Partida {
	private Jugador bueno = new Jugador();
	private Jugador malo = new Jugador();
	private Circulo circuloMayorPuntaje;
	
	public void cargarTiros(List <Aceituna> lista) {
		for (Aceituna aceituna : lista) {
			if (aceituna.getX() > 0)
				bueno.agregarAceituna(aceituna);
			else
				malo.agregarAceituna(aceituna);
		}
	}
	
	public void cambiarReglas() {
		this.circuloMayorPuntaje = new Circulo (0);
		int diferenciaPuntaje = 0;
		for (Aceituna aceituna : bueno.getLanzamientos()) {
			Circulo a = new Circulo(aceituna.distanciaACentro());
			if (diferenciaPuntaje < (bueno.puntaje(a) - malo.puntaje(a))) {
				diferenciaPuntaje = bueno.puntaje(a) - malo.puntaje(a);
				this.circuloMayorPuntaje = a;
			}

		}
		
	}
	
	public int getRadioCuadrado () {
		if (this.circuloMayorPuntaje==null)
			return 0;
		return (int)this.circuloMayorPuntaje.getRadioCuadrado();
	}
	
	
}
