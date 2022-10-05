package exerc3;

public class Calc {
	private int n1;
	private int n2;
	private String operation;
	
	public Calc(int n1, int n2, String operation) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.operation = operation;
	}

	public float calcular() {
		int result = 0;
		
		if (operation.equals("+")) {
			result = n1+n2;
		}else if (operation.equals("-")) {
			result = n1-n2;
		}else if (operation.equals("/")) {
			if (n2 == 0) {
				result = 0;
			}else {
				result = n1/n2;
			}
		}else if (operation.equals("*")) {
			result = n1*n2;
		}
		
		
		return result;
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

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Calc [n1=");
		builder.append(n1);
		builder.append(", n2=");
		builder.append(n2);
		builder.append(", operation=");
		builder.append(operation);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
