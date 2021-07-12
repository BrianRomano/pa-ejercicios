package practica;

public class AnimalTest {

	public static void main(String[] args) {

		Leon l = new Leon("Tipo de Animal: Le�n \n",
				"Tipo de Alimentaci�n: Carnivoro \n", "Tama�o: Grande \n",
				"Localizaci�n: Africa ");
		System.out.println(l);
		l.comer();
		l.comer("Mi dieta se basa en la carne");
		l.hacerRuido();
		l.rugir();
		l.dormir();
		System.out.println("----------------------------------------");
		Tigre t = new Tigre("Tipo de Animal: Tigre \n",
				"Tipo de Alimentaci�n: Carnivoro \n", "Tama�o: Grande \n",
				"Localizaci�n: Continente Asiatico ");
		System.out.println(t);
		t.comer();
		t.comer("Mi dieta se basa en la carne");
		t.hacerRuido();
		t.rugir();
		t.dormir();
		System.out.println("----------------------------------------");
		Gato g = new Gato("Tipo de Animal: Gato \n",
				"Tipo de Alimentaci�n: Carnivoro \n",
				"Tama�o: Mediano/Peque�o \n", "Localizaci�n: En todo el mundo ");
		System.out.println(g);
		g.comer();
		g.comer("Mi dieta se basa en la carne");
		g.hacerRuido();
		g.vacunar();
		g.rugir();
		g.dormir();
		System.out.println("----------------------------------------");
		Lobo lo = new Lobo("Tipo de Animal: Lobo \n",
				"Tipo de Alimentaci�n: Carnivoro \n", "Tama�o: Mediano \n",
				"Localizaci�n: Norteam�rica, Oriente Medio ");
		System.out.println(lo);
		lo.comer();
		lo.comer("Mi dieta se basa en la carne");
		lo.hacerRuido();
		lo.rugir();
		lo.dormir();
		System.out.println("----------------------------------------");
		Perro p = new Perro("Tipo de Animal: Perro \n",
				"Tipo de Alimentaci�n: Carnivoro \n", "Tama�o: Mediano \n",
				"Localizaci�n: En todo el mundo ");
		System.out.println(p);
		p.comer();
		p.comer("Mi dieta se basa en la carne");
		p.hacerRuido();
		p.vacunar();
		p.rugir();
		p.dormir();

	}

}
