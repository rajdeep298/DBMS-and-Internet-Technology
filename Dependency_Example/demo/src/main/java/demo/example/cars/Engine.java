package demo.example.cars;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	String engineType;
	Engine(){
		engineType = "V8";
	}
	
	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	
	
}
