package demo.example;
import demo.example.intf.*;
import demo.example.cars.*;
public class App {
	
	public static void main(String[] args) {
        
		Car swift = new Swift();
		Car Corolla = new Corolla();
		
		System.out.println(swift.getCar());
		System.out.println(Corolla.getCar());
		
		Car mycar = new Swift();
		System.out.println(mycar.getCar());
		
		mycar = new Corolla();
		System.out.println(mycar.getCar());
    }
	
}
