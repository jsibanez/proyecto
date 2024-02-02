package claseabstracta;

public class Reina extends Pieza {

	public Reina(Color color, Posicion posicion) {
		this.color=color;
		this.posicion=posicion;
	}

	@Override
	protected boolean compruebaMovimiento(Posicion destino) {
	    // Movimiento horizontal
	    if (posicion.getFila() == destino.getFila() && posicion.getColumna() != destino.getColumna())
	    	return true;

	    // Movimiento vertical
	    if (posicion.getFila() != destino.getFila() && posicion.getColumna() == destino.getColumna())
	    	return true;

	    // Mvimiento diagonal
	    if (Math.abs(destino.getColumna()-posicion.getColumna())==Math.abs(destino.getFila()-posicion.getFila())) {
	        return true;
	    }

	    return false;
	}
}
