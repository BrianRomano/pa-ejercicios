package practica;

public class Canino extends Animal {
	public Canino(){}
	
	public Canino(String ta, String tc, String tam, String loc) {
		super(ta,tc,tam,loc);
	}
	public void rugir(){
		System.out.println("Emito un rugido como un Canino");
	}

}
