import java.util.Scanner;

public class three_three_four {
	static public void main(String args[]) {
		divisible();
	}
	
	public static void divisible() {
		int x = 0, y = 0, z = 0, w = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an integer: ");
		x = scan.nextInt();
		System.out.println("Please enter the first divisor: ");
		y = scan.nextInt();
		System.out.println("Please enter the second divisor: ");
		z = scan.nextInt();
		System.out.println("Please enter the third divisor: ");
		w = scan.nextInt();
		
		if (x%y==0 && x%z==0) {
			System.out.println("x is divisible by " + y + z + " and " + w);
		}else {
			System.out.println("x is NOT divisible by " + y + z + " and " + w);
		}
	}
}
