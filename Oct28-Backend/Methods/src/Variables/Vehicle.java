package Variables;

public class Vehicle {
	
	//User define methods
	
	//Start method	
	public void start() {
		System.out.println("The vehicle engine has been started");
	}
	
	//accelerate  method
	
	public void accelerate() {
		int speed = 60;
		System.out.println("The engine has been accelerating.....");
		System.out.println("The speed of the vehicle is :" +speed + " Kms/hr");
	}
	
	//break method
	
	public void stop() {
		int speed = 0;
		System.out.println("The break has been applying for the vehicle.....");
		System.out.println("The vehicle has been stopped and now the speed of the vehicle is :" +speed + " Kms/hr");
	}
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.start();
		vehicle.accelerate();
		vehicle.stop();
		
	}
}
