package exerc4;

public class Salario {
	private int horas;
	private float valor;
	private float salarioBruto;
	private float salarioLiquido;
	private float inss;
	private float ir;
	private float sindicato;

	//Constructor
	public Salario(int horas, float valor) {
		this.horas = horas;
		this.valor = valor;
		salarioBruto = horas * valor;
		calcInss();
		calcIr();
		calcSindi();
		calcLiquido();
	}
	
	//Functions
	public void calcInss() {
		inss = (float) (salarioBruto * 0.05);
	}
	
	public void calcIr() {
		ir = (float) (salarioBruto * 0.11);
	}
	
	public void calcSindi() {
		sindicato = (float) (salarioBruto * 0.08);
	}
	
	public void calcLiquido() {
		salarioLiquido = salarioBruto - inss - ir - sindicato;
	}
	
	public String mostrar() {
		StringBuilder str = new StringBuilder();
		
		str.append("--------------------- \n");
		str.append("Salario Bruto : ");
		str.append(salarioBruto);
		str.append("\n");
		str.append("Imposto de Renda : ");
		str.append(ir);
		str.append("\n");
		str.append("INSS : ");
		str.append(inss);
		str.append("\n");
		str.append("Sindicato : ");
		str.append(sindicato);
		str.append("\n");
		str.append("Salario Liquido : ");
		str.append(salarioLiquido);
		
		return str.toString();
	}
	
	//Getters / Setters
	public float getIr() {
		return ir;
	}

	public void setIr(float ir) {
		this.ir = ir;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(float salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public float getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(float salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public float getInss() {
		return inss;
	}

	public void setInss(float inss) {
		this.inss = inss;
	}

	public float getSindicato() {
		return sindicato;
	}

	public void setSindicato(float sindicato) {
		this.sindicato = sindicato;
	}

	
	//To String
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Salario [horas=");
		builder.append(horas);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", salarioBruto=");
		builder.append(salarioBruto);
		builder.append(", salarioLiquido=");
		builder.append(salarioLiquido);
		builder.append(", inss=");
		builder.append(inss);
		builder.append(", ir=");
		builder.append(ir);
		builder.append(", sindicato=");
		builder.append(sindicato);
		builder.append("]");
		return builder.toString();
	}

	
}
