package geometry;

public class Poligono {
	private String nome;
	private Punto[] vertici;

	public Poligono(String nome, Punto[] vertici) {
		this.nome = nome;
		this.vertici = vertici;
	}

	public String getNome() {
		return nome;
	}

	public Punto[] getVertici() {
		return vertici;
	}
	
	public int getNumVertici() {
		return vertici.length;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();		
		s.append(getNome());
		s.append(" di vertici ");
		
		for (Punto p : vertici) {
			s.append(p);
			s.append(" ");
		}
		
		return s.toString();		
	}
	
	public double getPerimetro() {
		double perimetro = 0;
		int i;
		for (i = 0; i < getNumVertici() - 1; i++) {
			perimetro += getLength(vertici[i], vertici[i + 1]);
		}
		perimetro += getLength(vertici[i], vertici[0]);
		return perimetro;
	}
	
	private double getLength(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow(Math.abs(p1.getX() - p2.getX()), 2) + (Math.pow(Math.abs(p1.getY() - p2.getY()), 2)));
	}
	

}
