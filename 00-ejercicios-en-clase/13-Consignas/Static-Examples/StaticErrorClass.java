package example.com;


public class StaticErrorClass {
    
    private int x;
    
    public static void staticMethod() {
        x = 1; 
        instanceMethod(); 
    }
    
    public static void instanceMethod() {
        x = 2;
    }
}