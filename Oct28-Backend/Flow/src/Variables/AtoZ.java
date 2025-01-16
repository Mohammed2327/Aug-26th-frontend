package Variables;

public class AtoZ {
	public static void main(String[] args) {
		char ch='a';
		
		for(int i=1; i<=26; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println((char) (ch+ j-1));
			}
			System.out.println();
		}
	}
}
