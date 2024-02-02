package claseabstracta;

public class PruebaPiezas {

	public static void main(String[] args) {
		
		Posicion posicionInicial = new Posicion(1, 1);
		Reina reinaBlanca = new Reina(Pieza.Color.BLANCO, posicionInicial);
		System.out.println("Posición inicial de la reina: " + reinaBlanca.getPosicion());

		Posicion nuevaPosicion = new Posicion(3, 3);
		reinaBlanca.mover(nuevaPosicion);
		System.out.println("Nueva posición de la reina: " + reinaBlanca.getPosicion());

		nuevaPosicion = new Posicion(5, 2);
		reinaBlanca.mover(nuevaPosicion);
		System.out.println("Posición final de la reina: " + reinaBlanca.getPosicion());
	}
}
