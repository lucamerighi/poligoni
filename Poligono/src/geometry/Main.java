package geometry;

import ed.utils.Finestra;

public class Main {
	public static void main(String[] args) {
		
		Finestra window = Finestra.getNewFinestra("Poligoni");
		
		//Test punto
		Punto punto = new Punto(3, 4);		
		assert (punto.getX() == 3 && punto.getY() == 4);
		assert (punto.toString().equals("(3,4)"));
		
		//Test triangolo
		Punto[] punti = new Punto[] {new Punto(0, 0), new Punto(0, 4), new Punto(4, 0)};
		Poligono triangolo = new Poligono("triangolo", punti);		
		
		window.print(triangolo.toString());
		window.print("\nPerimetro: " + triangolo.getPerimetro());
		
		//Test rettangolo
		Punto[] punti2 = new Punto[] {new Punto(1, 1), new Punto(5, 1), new Punto(1, -2), new Punto(5, -2)};
		Poligono rettangolo = new Poligono("rettangolo", punti2);
		
		window.print("\n" + rettangolo.toString());
		window.print("\nPerimetro: " + rettangolo.getPerimetro());		
		
		window.print(" ");
		
	}
	
}
