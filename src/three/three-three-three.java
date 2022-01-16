import java.util.Scanner;

public class three_three_three {
	static public void main(String args[]) {
		intsort();
		stringsort();
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
