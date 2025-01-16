package Variables;

public class Demo {

	// user defined method
	
	public void engine() {
		//local variables 
		int bolts = 55;
		String oilType = "Cooling Oil";
		String typeOfMaterial = "Micro Materials";
		int holes = 890;
		int gears = 5;
		
		System.out.println("engine bolts are: " +bolts);
		System.out.println("engine oil type is: " +oilType);
		System.out.println("engine type of material is: "+typeOfMaterial);
		System.out.println("engine holes are: " +holes);
		System.out.println("engine gears are: " +gears);
	}
	
	// main method
	
	public static void main(String[] args) {
		
		//Objection creation
		Demo d = new Demo();
		d.engine();
	}
}
