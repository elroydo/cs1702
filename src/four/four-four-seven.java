
public class four_four_seven {
	static public void main(String args[]) {
		nested();
	}
	
	public static void nested() {
		System.out.println();
		System.out.println("1.1)");
		for(int i=0;i<6;++i){
			for(int j=1;j<i+1;++j){
				System.out.print(i);
			}
		}
		
		System.out.println();
		System.out.println("1.2)");
		for(int i=2;i<7;++i){
			for(int j=1;j<i+1;++j){
				System.out.print(i);
			}
		}
		
		System.out.println();
		System.out.println("1.3)");
		for(int i=1;i<6;i+=2) {
			for(int j=0;j<i;++j) {
				System.out.print(i);
			}
		}
		
		System.out.println();
		System.out.println("1.4)");
		for(int i=1;i<8;i+=2) {
			for(int j=0;j<i;j+=2) {
				System.out.print(i);
			}
		}
		
		System.out.println();
		System.out.println("1.5)");
		for(int i=5;i>0;--i) {
			for(int j=0;j<i;++j) {
				System.out.print(i);
			}
		}       
		
		System.out.println();
		System.out.println("1.6)");
		for(int i=5;i>0;--i) {
			for(int j=6;j>i;--j) {
				System.out.print(i);
			}
		}
		
		System.out.println();
		System.out.println("2.1)");
		for(int x=0;x<=10;++x) {
			for(int y=0;y<=10;++y) {
				System.out.println(x + "" + y);
			}	
		}
		
		System.out.println();
		System.out.println("2.2)");
		for(int x=1;x<11;x++){
		    for(int y=x+1;y<11;y++){
		        System.out.println(x + " " + y);
		    }
		}
		
		System.out.println();
		System.out.println("2.3)");
		for(int x=1;x<=4;++x) {
			for(int y=4;y<=8;++y) {
				System.out.println(x + "" + y);
			}	
		}
	}
}
