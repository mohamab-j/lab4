public class Hello {
	public static void main(String[] args) {

		for(int i=1;i<=10;i++) {

			System.out.println("Hello World..."+i);
		}
		
		// New feature: Print squared numbers
		printSquares();
	}
	
	// New method to print square numbers
	public static void printSquares() {
		System.out.println("\nSquare numbers:");
		for(int i=1; i<=5; i++) {
			System.out.println(i + " squared = " + (i * i));
		}
	}
}
