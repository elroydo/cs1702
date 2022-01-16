import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class two {
	public static void main(String[] args)
	{
		assignment2_2();
		one();
		finch();
	}
	
	public static void assignment2_2(){
		long x;
		
		x = 100;
		System.out.println(x);
		x += 10;
		System.out.println(x);
		x += 20;
		System.out.println(x);
	}
	
	public static void one() {
		int a = 100, g = 0;
		double b = 2.3, c = -52.2;
		boolean d = true;
		String e = "I am ", f = "a student";
		char h = '!';
		
		final double pi = 3.14;
		final String name = "Rin";
		
		long x;
		double y;
		String z;
		
		y = a + b; //1) adds the two variable together and assigns the value to y
		System.out.println("1) " + y);
		
		//y = a + d; //2) invalid, cannot add the two variables together
		
		z = e + f; //adds the two strings together and assigns the value to z
		System.out.println("3) " + z);
		
		y = b*c; //4) multiplies the two variables together and assigns the value to y
		System.out.println("4) " + y);
		
		//pi = 22/7; //5) invalid, cannot assign the calculated value to a constant variable
		
		//z = name/g; //6) invalid, cannot divide a string with an int variable
		
		//z = c/g; //7) invalid, cannot convert double to string
		
		x = 10; //8) assigns the value of 10 to x
		x = (long) Math.pow(x, 3); //calculates the cube root of x and assigns the value to x
		System.out.println("8) " + x);
		
		z = name + " is " + f + h; //adds several variables together and assigns the value to z
		System.out.println("9) " + z);
		
		//y = (name + 10)/(name +h); //10) invalid, cannot perform addition or division amongst strings and ints
		
		//x = (a+b)/(d+c); //11) invalid, cannot perform addition between a boolean and double variable
		
		y = 100.3; //12) assigns the value to y
		y = (y/(a+b)) - c; //performs calculations and assigns the value to y
		System.out.println("12) " + y);
		
		//x(Math.pow(x, 2)) = Math.pow(y, 2) + Math.pow(z, 2);  //13) invalid, cannot perform calculation on a string variable
		
		//name = "Is " + f - h; //14) invalid, cannot peform calculation between a char and string
		
		y = (((pi+3)/(pi+3))/(pi+3)); //15) performs calculations and assigns the value to y
		System.out.println("15) " + y);
		
		y = -2; //16) assigns the value to y
		y = Math.cbrt((Math.pow(y, 2)/b)); //performs several calculations
		System.out.println("16) " + y);
		
		y = b/g; //17) divides the two variables and assigns the value to y
		z = y + name; //adds the two variables and assigns the value to z
		System.out.println("17) " + z);
		
		z = name; //18) assigns the value to z
		z = b/g +z; //performs several calculations and assigns the value to z
		System.out.println("18) " + z);
		
		y = -2.3; //19) assigns the value to y
		y = Math.pow((a*y), 2) + (b*y) + c; //performs several calculations and assigns the value to y
		System.out.println("19) " + y);
		
		//y = y - Math.pow((a-b), Math.pow((b-c), (c-d))); //20) invalid, cannot perform subtraction between a double and boolean
	}
	
	public static void finch() {
		Finch myfinch = new Finch();
		myfinch.setLED(255, 255, 255, 10000); //<red>, <green>, <blue>, <duration(ms)>
		myfinch.quit();
	}
}
