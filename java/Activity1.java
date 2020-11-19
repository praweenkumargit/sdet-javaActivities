
public class Activity1 {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Car alto = new Car();
		alto.make = "hatchback";
		alto.tyres = 6;
		alto.doors = 5;
		alto.color = "violet";
		alto.transmission = "automatic";
		
		alto.DisplayCharacteristics();
		alto.accelerate();
		alto.brake();

	}

}
