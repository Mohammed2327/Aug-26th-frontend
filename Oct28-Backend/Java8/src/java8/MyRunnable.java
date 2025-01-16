package java8;


public class MyRunnable {
	
	public static void main(String[] args) {
		
		Runnable r =() -> 
		{
			for(int i=0; i<=10; i++) {
			System.out.println("Child is a Thread");
		}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0; i<=10; i++)
		{
			System.out.println("Parent is a Thread");
		}
		
	}
}
