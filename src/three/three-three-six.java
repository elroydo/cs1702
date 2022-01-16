import java.util.Scanner;

public class three_three_six {
	static public void main(String args[]) {
		operator();
	}
	
	public static void operator() {
		int a, b, x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first integer value: ");
		a = scan.nextInt();
		System.out.println("Please enter the second integer value: ");
		b = scan.nextInt();
		
		x = (a<b)?a:b;
		System.out.println(x);
	}
}
