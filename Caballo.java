package claseabstracta;

public class Caballo  extends Pieza {
	
	public Caballo(Color color, Posicion posicion) {
		this.color=color;
		this.posicion=posicion;
	}

	@Override
	protected boolean compruebaMovimiento(Posicion destino) {
        int diferenciaX = Math.abs(destino.getColumna() - getPosicion().getColumna());
        int diferenciaY = Math.abs(destino.getFila() - getPosicion().getFila());

        // Movimiento válido si hay 2 casillas de diferencia en una dirección y 1 en la otra
        return (diferenciaX == 2 && diferenciaY == 1) || (diferenciaX == 1 && diferenciaY == 2);
	}
}
