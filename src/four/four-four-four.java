
public class four_four_four {
	public static void main(String[] args) {	
		
		loops();
		testex();
	}
	
	public static void loops() {
		int i;
		
		System.out.println("example snippet)");
		for (i=0;i<10;++i) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("1)");
		for (i=4;i<12;++i) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("2)");
		for (i=10;i<20;i+=3) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("3)");
		for (i=1;i<17;i+=3) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("4)");
		for (i=2;i<13;i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("5)");
		for (i=1;i<10;++i) { //first 10 square numbers
			int sqrnum = i*i; //multiplies i by i to calculate the square number
			System.out.println(sqrnum);
		}
		
		System.out.println();
		System.out.println("6)");
		for (i=-10;i<11;i+=2) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("7)");
		for (i=-20;i<21;i+=5) {
			System.out.println(i);
		}
		System.out.println();
	}
	
	public static void testex() {
		int i; 
		for(i=0;i<7;++i) {
			if (i % 4 == 1) {
				System.out.println("X");
			}else {
				System.out.println(".");
			}
			//System.out.println(i-((i/4)*4));
		}
	}
}
