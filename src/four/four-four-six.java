import java.util.Scanner;

public class four_four_six {
	static public void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		whileloops();
		
		System.out.println("Euclid's Algorithm implemented");
		System.out.println("Enter the first integer value: ");
		int a = scan.nextInt();
		System.out.println("Enter the second integer value");
		int b = scan.nextInt();
		
		euclids(a, b);
		
		if ((euclids(a, b)) == (euclids(b, a))) {
			System.out.println("Verified HCF");
		}else {
			System.out.println("Unverified HCF");
		}
		
		System.out.println(a);
	}
	
	public static void whileloops() {
		int i;
		
		System.out.println("4.4_1)");
		i = 4;
		while (i<12) {
			System.out.println(i);
			++i;
		}
		System.out.println();
		
		System.out.println("4.4_2)");
		i = 10;
		while (i<20) {
			System.out.println(i);
			i+=3;
		}
		System.out.println();
	}
	
	public static int euclids(int a, int b) {	

		while(b>0) {
			int c = a%b;	
			a=b;
			b=c;
		}	
		return a;
	}
}
