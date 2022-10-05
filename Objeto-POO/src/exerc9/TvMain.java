package exerc9;

public class TvMain {

	public static void main(String[] args) {
		Tv tv = new Tv(0,0);
		
		System.out.println(tv);
		
		tv.mudarCanal(10);
		tv.diminuirVolume();
		
		System.out.println(tv);
	}

}
