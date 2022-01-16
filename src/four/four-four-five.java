
public class four_four_five {
	static public void main(String args[]) {
		patterns();
	}
	
	public static void patterns() {
		int i;
		
		System.out.println("example snippet)");
		for (i=0;i<10;++i) {
			System.out.println("*");
		}
		System.out.println();
		
		System.out.println("1)");
		for (i=0;i<10;++i) {
			System.out.println("+");
		}
		System.out.println();
		
		System.out.println("2)");
		for (i=0;i<8;++i) {
			System.out.println("-");
		}
		System.out.println();
		
		System.out.println("3)");
		for (i=0;i<5;i++) {
			System.out.println("+");
			System.out.println("-");
		}
		System.out.println();
		
		System.out.println("4)");
		for (i=0;i<3;i++) {
			System.out.println("*");
			System.out.println("+");
			System.out.println("-");
		}
		System.out.println();
		
		System.out.println("5)");
		for (i=0;i<3;i++) {
			System.out.println("*");
			System.out.println("+");
			System.out.println("-");
		}
		System.out.println();
		
		System.out.println("6)");
		for (i=0;i<3;i++) {
			for (int j=0;j<2;++j) {
				System.out.println("*");
			}
			for (int k=0;k<2;++k) {
				System.out.println("+");
			}
		}
		System.out.println();
		
		System.out.println("7)");
		for (i=0;i<3;i++) {
			for (int j=0;j<3;++j) {
				System.out.println("*");
			}
			for (int k=0;k<3;++k) {
				System.out.println("+");
			}
		}
		System.out.println();
		System.out.println("8)");
		for (i=0;i<1;i++) {
			for (int j=0;j<3;++j) {
				System.out.println("*");
			}
			for (int k=0;k<3;++k) {
				System.out.println("+");
			}
			for (int l=0;l<3;++l) {
				System.out.println("-");
			}
			for (int m=3;m>0;--m) {
				System.out.println("-");
			}
			for (int n=3;n>0;--n) {
				System.out.println("+");
			}
			for (int o=3;o>0;--o) {
				System.out.println("*");
			}
		}
	}
}
