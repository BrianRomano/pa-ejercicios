package test;
import data.Persona;

public class PersonaTest {

    public static void main(String[] args) {

        Persona persona = new Persona("Brian", 123456789, "18 de noviembre de 1998");
        Persona personaDos = new Persona("Leonel", 123456789, "18 de noviembre de 1998");
        Persona personaTres = new Persona("Romano", 123456789, "18 de noviembre de 1998");

        System.out.println(persona);
        System.out.println(personaDos);
        System.out.println(personaTres);
        System.out.println("----------");
        System.out.println(persona);
        System.out.println(personaDos);
        System.out.println(personaTres);
    }
}
