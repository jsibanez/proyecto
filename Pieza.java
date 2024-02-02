package claseabstracta;

public abstract class Pieza {

	enum Color {
		BLANCO, NEGRO
	}
	
	protected Posicion posicion;
	protected Color color;
	
	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public void mover(Posicion destino) {
		if (compruebaMovimiento(destino)) 
			posicion=destino;
		else 
			System.out.println("Movimiento inválido");
	}
	
	protected abstract boolean compruebaMovimiento(Posicion destino);
}
