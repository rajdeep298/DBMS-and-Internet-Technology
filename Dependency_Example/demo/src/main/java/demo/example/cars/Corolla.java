package demo.example.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.example.intf.Car;

@Component("myCorolla")
public class Corolla implements Car {

	Engine engine;
	@Autowired	//Autowired is used to inject the dependency of Engine class in Corolla class automatically
	public void setEngine(Engine engine) {
		engine.engineType = "W16";
		this.engine = engine;
	}

	public String getCar() {
		// TODO Auto-generated method stub
		return "Corolla has engine type: " + engine.engineType;
	}
}
