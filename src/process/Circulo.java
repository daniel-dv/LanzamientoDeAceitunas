package process;

public class Circulo {
	private double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getRadioCuadrado() {
		return Math.pow(radio, 2);
	}
	
	
}
