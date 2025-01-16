package java8;

@FunctionalInterface
interface A{
	public void m1();
}

public class Demo {
	public static void main(String[] args) {
	A i= () -> {
			System.out.println("Welcome to Java 8 Functions");
		};
		
		i.m1();
	}
}
