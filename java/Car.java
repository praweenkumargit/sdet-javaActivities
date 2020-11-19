
public class Car {

	String color;
	String transmission;
	String make;
    int tyres;
    int doors;

//Car(){
	
	
	//this.doors = 4;
	//this.tyres = 4;
//}

public void DisplayCharacteristics() {
	System.out.println("Color of car is: " + color);
	System.out.println("Transmission of car is: " + transmission);
	System.out.println("Make of car is: " + make);
	System.out.println("Number of tyres is: " + tyres);
	System.out.println("Number of doors in car is: " + doors);

}

public void accelerate() {
	System.out.println("Car is moving fast!");

}
public void brake() {
	System.out.println("Car has stopped.");

}

}



