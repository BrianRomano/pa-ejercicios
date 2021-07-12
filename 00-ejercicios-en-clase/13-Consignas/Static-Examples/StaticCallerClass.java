package example.com;

public class StaticCallerClass {

    public static void main(String[] args) {
        double d = Math.random();
        StaticUtilityClass.printMessage();
        StaticUtilityClass sm = new StaticUtilityClass();
        sm.printMessage(); 
        sameClassMethod();

        double p = Math.PI;

     StaticCounterClass st1 = new StaticCounterClass();
     StaticCounterClass st2 new StaticCounterClass();
        System.out.println("count: " + st1.getCount());
    }

    public static void sameClassMethod() {
        System.out.println("running within StaticClaller");
    }
}