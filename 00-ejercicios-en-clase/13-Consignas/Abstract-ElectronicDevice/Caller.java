package example;

public class Caller {
    
    public static void main(String[] args) {
    
        ElectronicDevice dev1 = new ElectronicDevice();
        ElectronicDevice dev2 = new Television();
        dev1.turnOn(); 
		dev2.turnOff(); 

    }
}