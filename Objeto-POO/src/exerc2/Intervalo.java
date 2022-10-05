package exerc2;

public class Intervalo {
	
	private int n1;
	private int n2;
	
	public Intervalo(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public int calcIntervalo() {
		int intervalo = n1-n2;
		return intervalo;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Intervalo [n1=");
		builder.append(n1);
		builder.append(", n2=");
		builder.append(n2);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
