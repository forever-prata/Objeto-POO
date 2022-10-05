package exerc6;

public class Quadrado {
	private float lado;

	public Quadrado(float lado) {
		this.lado = lado;
	}
	
	public float calcArea() {
		float area = lado*lado;
		
		return area;
	}
	
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrado [lado=");
		builder.append(lado);
		builder.append("]");
		return builder.toString();
	}
	
	
}
