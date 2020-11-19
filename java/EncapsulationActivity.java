package javaActivity2_2;

public class EncapsulationActivity {

	public static void main(String[] args) throws InterruptedException {
	
		Plane plane = new Plane(10);
      
	plane.onboard("amit");
	plane.onboard("praween");
	
		plane.takeOff();
		System.out.println("Current time is: " + plane.takeOff());
		
		System.out.println("List of passengers: " + plane.getPassengers());
		
		Thread.sleep(5000);
		
		plane.land();
		
		System.out.println("Time of plane landing is :" + plane.getLastTimeLanded());
    	   
       
	}

}
