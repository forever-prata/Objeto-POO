package exerc9;

public class Tv {
	private int canal;
	private int volume;
	
	
	
	public Tv(int canal, int volume) {
		this.canal = canal;
		this.volume = volume;
	}

	public Tv() {
		this.canal = 0;
		this.volume = 50;
	}
	
	public void aumentarVolume() {
		if (volume<100) {
			setVolume(volume+10);
		}
	}
	
	public void diminuirVolume() {
		if (volume>=10) {
			setVolume(volume-10);
		}else {
			setVolume(0);
		}
	}
	
	public void mudarCanal(int canal) {
		if (canal <= 10 && canal > 0) {
			setCanal(canal);
		}
	}
	
	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tv [canal=");
		builder.append(canal);
		builder.append(", volume=");
		builder.append(volume);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
