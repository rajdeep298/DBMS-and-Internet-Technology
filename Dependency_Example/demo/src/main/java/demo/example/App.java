package demo.example;
import demo.example.intf.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.example.cars.*;
public class App {
	
	public static void main(String[] args) {
        
//		Car swift = new Swift();
//		Car Corolla = new Corolla();
//		
//		System.out.println(swift.getCar());
//		System.out.println(Corolla.getCar());
//		
//		Car mycar = new Swift();
//		System.out.println(mycar.getCar());
//		
//		mycar = new Corolla();
//		System.out.println(mycar.getCar()); //This is known as tight coupling
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car mycar = context.getBean("mySwift", Car.class);
		System.out.println(mycar.getCar());
		
		mycar = context.getBean("myCorolla", Car.class);
		System.out.println(mycar.getCar());
	}
	
}
