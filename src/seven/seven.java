import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class seven {
	static public void main(String args[]) {
		EvenOdd_7_4_1();
		System.out.println();
		ReverseString_7_4_2();
		System.out.println();
		LeapYear_7_4_3();
		System.out.println();
		DaysAlive_7_4_5();
	}
	
	public static void EvenOdd_7_4_1() {
		int i;
		boolean eo;
		String s = "";
		
		for(i=1;i<=25;++i)
		{
			eo = EvenOdd(i);
			s = (eo)?"Even":"Odd";
			System.out.println(i + " is " + s);
		}
	}
	
	public static void ReverseString_7_4_2() {
		Scanner in = new Scanner(System.in); //user input
		System.out.print("Please enter a string you would like reversed: ");
		String Input = in.nextLine();
		System.out.println(ReverseString(Input));
	}
	
	public static void LeapYear_7_4_3() {
		Scanner in = new Scanner(System.in); //user input
		System.out.print("Please enter a year: ");
		int Year = in.nextInt();
		
		while(Year<1000||Year>3000) {
			System.out.print("Please enter a valid year: ");
			Year = in.nextInt();
		}
		
		boolean Leap = LeapYear(Year);
		System.out.println((Leap)?"Leap year":"Not a leap year");
		
		DaysInMonth_7_4_4(Year);
	}
	
	public static void DaysInMonth_7_4_4(int Year) {
		Scanner in = new Scanner(System.in); //user input
		System.out.print("Please enter a month as an integer value: ");
		int Month = in.nextInt();
		
		while(Month<1||Month>12) {
			System.out.print("Please enter a valid month as an integer value: ");
			Month = in.nextInt();
		}
		System.out.println(DaysMonth(Year, Month));
	}
	
	public static void DaysAlive_7_4_5() {
		Scanner in = new Scanner(System.in); //user input
		System.out.print("Please enter your date of birth in the following format (dd/mm/yyyy): ");
		String DoB = in.nextLine();
		
		DateValidation(DoB);
	}
	
	private static boolean EvenOdd(int x) {
		if((x%2)==0){
			return true;
		}else {
			return false;
		}
	}
	
	private static String ReverseString(String x) {
		String Reversed = "";
		
		for(int i=x.length()-1;i>=0;--i) {
            Reversed = Reversed + x.charAt(i);
        }
		return Reversed;
	}
	
	private static boolean LeapYear(int x) {
		if((x%4==0)&&(x%100!=0||(x%400==0))) {
			return true;
		}else {
			return false;
		}
	}
	
	private static int DaysMonth(int x, int y) {
		Calendar calendar = Calendar.getInstance();
		int Days = 0;
	  	calendar.set(x, y, 1);
	  	return Days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	private static int DaysAlive(int x) {
		Calendar cal = Calendar.getInstance();
	    Date today = cal.getTime();
	    cal.set(1985, Calendar.JANUARY, 30);
	    Date birthday = cal.getTime();
	
	    int dateSubtract = (int) (today.getTime() - birthday.getTime());
	    int time = 1000 * 60 * 60 * 24;
		return x = dateSubtract / time;
	}
	
	private static boolean DateValidation(String input) {
		String regex = "^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
		DateTimeFormatter dobf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		
		if (input.matches(regex)) {
			System.out.println("Date matches regex");
		}else {
			System.out.println("Date does NOT matches regex");
		}
		
		try {
			dobf.parse(input);
			System.out.println(input + " is a valid Date");
			return true;
		}
		catch (Exception e) {
			System.out.println(input + " is not a valid Date");
			return false;
		}
	}
}
