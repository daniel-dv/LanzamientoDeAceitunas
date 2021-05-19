package process;

public class Aceituna {
	private int x;
	private int y;

	public Aceituna(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double distanciaACentro() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public int getX() {
		return this.x;
	}

}
