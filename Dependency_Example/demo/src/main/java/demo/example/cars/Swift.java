package demo.example.cars;

import org.springframework.stereotype.Component;

import demo.example.intf.Car;

@Component("mySwift")
public class Swift implements Car {

	@Override
	public String getCar() {
		// TODO Auto-generated method stub
		return "Swift";
	}

}
