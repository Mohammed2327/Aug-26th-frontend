package Variables;

public class Demo2 {

	public static void main(String[] args) {
		String name = "Mohammed"; //immutable
		String name1 = "Mohammed";
		
		
	 name.concat("India");
		
		System.out.println(name1);
		
		System.out.println(name == name1);
		System.out.println(name.equals(name1));
		
		//by using new word
		
		String str = new String(" Mujeebuddin");
		String str1 = new String(" Mujeebuddin");
		
		System.out.println(str == str1);
		System.out.println(str.equals(str1));
	}
	
}
