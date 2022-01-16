import java.util.Scanner;

public class three {
	static public void main(String args[])
	{
	   int a = 1000, b = -22;
	   
	   if (a<b) {
		   System.out.println("a is less than b");
	   }else {
		   System.out.println("a is NOT less than b");
	   }
	   
	   statements();
	}
	
	public static void statements() {
		int x = 100, y = 204, c = -204;
		double z = -23.1;
		boolean a = true, b = false;
		
		//1)
		if (x<y) {
			System.out.println("x is less than y");
		}else {
			System.out.println("x is NOT less than y");
		}
		
		//2)
		if (x>z&&a==b) {
			System.out.println("x is more than z AND a is EQUAL to b");
		}else {
			System.out.println("x is NOT more than z AND a is NOT EQUAL to b");
		}
		
		//3)
		if ((2*c)>y) {
			System.out.println("2 multiplied by c is more than y");
		}else {
			System.out.println("2 multiplied by c is NOT more than y");
		}
		
		//4)
		if (x==c) {
			System.out.println("x is equal to c");
		}else {
			System.out.println("x is not equal to c");
		}
		
		//5)
		if (c!=y||c==y) {
			System.out.println("c is NOT equal to y OR c is equal to y");
		}else {
			System.out.println("c is equal to y OR c is NOT equal to y");
		}
		
		//6) invalid, cannot compare int to a boolean value 
		//if (z!=y&&c==a) {
		//	System.out.println("z is NOT equal to y AND c is equal to a");
		//}else {
		//	System.out.println("z is equal to y AND c is NOT equal to a");
		//}
		
		//7) invalid, cannot perform addition between an int and boolean value
		//if (y>=y&&(a+3)!=2) {
		//	System.out.println("y is more than or equal to y AND a plus 3 is NOT equal to 2");
		//}else {
		//	System.out.println("y is less than or NOT equal to y AND a plus 3 is equal to 2");
		//}
	}
	
	public static void intsort() {
		
		Scanner intscan = new Scanner(System.in);
		
		System.out.println("Enter the first integer: ");
	    int a = intscan.nextInt();
	    System.out.println("Enter the second integer: ");
	    int b = intscan.nextInt();
	    System.out.println("Enter the third integer: ");
	    int c = intscan.nextInt();
	    
	    if (a > b) {
	    	int temp = a;
		     a = b;
		     b = temp;
	    }
	    if (b > c) {
		    int temp = b;
		    b = c;
		    c = temp;
		}
	    if (a > b) {
	    	int temp = a;
		    a = b;
		    b = temp;
	    }
		      
	    System.out.println("Sorted integer values: "
			      + a + ", " + b + ", " + c);
	}
	
	public static void stringsort() {
		
		Scanner stringscan = new Scanner(System.in);
		
		String d = "", e = "", f = "";
		
	    System.out.println();
	    
	    System.out.println("Enter the first string: ");
	    d = stringscan.nextLine();
	    System.out.println("Enter the second string: ");
	    e = stringscan.nextLine();
	    System.out.println("Enter the third string: ");
	    f = stringscan.nextLine();
			      
	    int top = (d.compareTo(e) + d.compareTo(f)), 
	    	mid = (e.compareTo(f) + e.compareTo(d)), 
	    	bot = (f.compareTo(e) + f.compareTo(d)), 
	    	dint = (d.compareTo(e) + d.compareTo(f)), 
	    	eint = (e.compareTo(f) + e.compareTo(d)), 
	    	fint = (f.compareTo(e) + f.compareTo(d));
	    
	    System.out.println("Unsorted strings: "+ top + ", " + mid + ", " + bot);
	    System.out.println(d);
	    System.out.println(e);
	    System.out.println(f);
	    System.out.println();
   
	    if (top > mid) {
		    int temp = top;
		    top = mid;
		    mid = temp;
		}
	    if (mid > bot) {
		    int temp = mid;
		    mid = bot;
		    bot = temp;
		}
	    if (top > mid) {
	    	int temp = top;
		    top = mid;
		    mid = temp;
	    }

		System.out.println("Sorted alphabetically: " + top + ", " + mid + ", " + bot);
		    
		if (top == dint) {
	    	System.out.println(d);
	    }else if (top == eint) {
	    	System.out.println(e);
	    }else {
	    	System.out.println(f);
	    }
	    
	    if (mid == eint) {
	    	System.out.println(e);
	    }else if (mid == fint) {
	    	System.out.println(f);
	    }else {
	    	System.out.println(d);
	    }
	    
	    if (bot == fint) {
	    	System.out.println(f);
	    }else if (bot == dint) {
	    	System.out.println(d);
	    }else {
	    	System.out.println(e);
	    }
	}
}
