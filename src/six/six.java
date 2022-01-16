import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class six {
	public static void main(String args[]) throws IOException {
		
		//JARFile_6_8 je = new JARFile_6_8(); //exporting to external JAR file 6.8, 6.8.1, and 6.8.2
		//JARFile_6_8.main(args); //running external JAR file; java -jar ExportingToJAR.jar
		System.out.println();
		Strings_6_3();
		System.out.println();
		MathematicalFunctions_6_4(10.2);
		System.out.println();
		SystemCommands_6_5();
		System.out.println();
		RandomNumberGeneration_6_6();
		System.out.println();
		FileHandling_6_7();
		System.out.println();
		ReadingData6_7_1();
		System.out.println();
		WritingData_6_7_2();
	}
	
	public static void Strings_6_3() {
		double number = 1.0/3.0, x = 123.4564, y = 17.0/3.0, z = java.lang.Math.sqrt(2.0);
		String a = "Hello", b = "World";
			
		DecimalFormat number_format = new DecimalFormat("0.000");
		System.out.println(number);
		String formatted_string = number_format.format(number);
		System.out.println(formatted_string);
		
		System.out.println(y);
		String formatted_y = number_format.format(y);
		System.out.println(formatted_y);
		
		String x_String = String.valueOf(x);
		String x_beforePoint = x_String.substring(0, x_String.indexOf("."));
		System.out.println("Digits before point for x = " + x_beforePoint.length());
		String x_afterPoint = x_String.substring(x_String.indexOf("."), x_String.length()-1);
		System.out.println("Digits after point for x = " + x_afterPoint.length());
		
		String c = "";
		
		for(int i=a.length()-1;i>=0;--i) {
			c = c + a.charAt(i);
		}
		System.out.println("Reversed string: " + c + " " + b);
		
		String c_replaced = c.replace("ll", "ppp");
		
		System.out.println(c_replaced);
	}
	
	public static void MathematicalFunctions_6_4(double x) {
		String ceil = String.valueOf(Math.ceil(x));
		String floor = String.valueOf(Math.floor(x));
		String round = String.valueOf(Math.round(x));
		
		System.out.println("For" + " " + x + "ceil=" + ceil + " " + "floor=" + floor + " " + "round=" + round);
		
		int a = 10;
		double b = 15.789;
				
		String s = String.format("b = %2$.2f a = %1$d", a, b);
		System.out.println(s);
	}
	
	public static void SystemCommands_6_5() {
		String dir_name = "E:\\e_downloads";
		File dir = new File(dir_name);
			
		File[] dir_list = dir.listFiles();
		for(int i=0;i<dir_list.length;++i)
		{
			System.out.print(dir_list[i].getName());
			if(dir_list[i].isDirectory()) {
				System.out.println(" is a directory.");
			}else {
				System.out.println(" is not a directory.");
			}
		}
	}
	
	public static void RandomNumberGeneration_6_6() throws InputMismatchException {
		boolean InputValidation = false;
		Random Rand = new Random();
		int RandNumLim;
		int a = 0, b = 0;
		
		for(int i=0;i<10;++i)
		{
			System.out.println(RandNumLim = Rand.nextInt((100-(-100))+1)+(-100)); //range from -100 to 100
		}
		
		while(!InputValidation) {
			try {
				Scanner InputScan = new Scanner(System.in);
				System.out.print("Enter the minimum value: ");
				a = InputScan.nextInt();
				System.out.print("Enter the maximum value: ");
				b = InputScan.nextInt();
				
				if(b>a) {
					break;
				}else {
					System.out.println("The maximum value should be more than the minumum value.");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Invalid input");
			}
		}
		
		for(int i=0;i<10;++i) {
			System.out.println(RandNumLim = Rand.nextInt((b-a)+1)+a); //prints out random range of numbers based on min and max input from a and b
		}
		
		for(int i=0;i<10;++i) {
			System.out.println(Rand.nextDouble()); //prints random double ranging from 0 to 1
		}
		
		for(int i=0;i<10;++i) {
			System.out.println(10.0 + (15.789 - 10.0) * Rand.nextDouble()); //prints random double from min and max ranges specified
		}
	}
	
	public static void FileHandling_6_7() throws IOException {
		FileWriter writehandle = new FileWriter("E:\\e_downloads\\Eclipse\\eclipse_workspace\\CS1702_Lab6\\src\\files\\file.txt");
		BufferedWriter bw = new BufferedWriter(writehandle);
		for(int i=0;i<10;++i)
		{
			String line = "Hello " + i;
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		writehandle.close();
	   
		FileReader readhandle = new FileReader("E:\\e_downloads\\Eclipse\\eclipse_workspace\\CS1702_Lab6\\src\\files\\file.txt");
		BufferedReader br = new BufferedReader(readhandle);
		String line = null;
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		br.close();
		readhandle.close();
	}
	
	public static void ReadingData6_7_1() throws IOException {
		String input = null, dir_name = "E:\\e_downloads\\Eclipse\\eclipse_workspace\\CS1702_Lab6\\src\\files\\"; //input and directory declared as strings, where dir_name stores the main directory
		File fileName = null, dir = new File(dir_name); //fileName is declared as empty and dir is initialised as all the files within our string directory
		File[] dir_list = dir.listFiles(); //all the files within said directory is assigned to the directory list array list
		Scanner in = new Scanner(System.in); //user input
		
		for(int i=0;i<dir_list.length;++i) {
			System.out.println(dir_list[i].getName()); //outputs all the files within our directory
		}
		
		//https://coderanch.com/t/663817/java/Checking-files-existence-based-user (reference for user input and filename validation)
		System.out.print("Please enter a file name: ");
		input = in.nextLine();
		fileName = new File(dir_name + input);
		
		while((!fileName.exists() || fileName.isDirectory()) || (!fileName.exists() && fileName.isDirectory())) {
			System.out.print("Please enter a valid file name: ");
			input = in.nextLine();
			fileName = new File(dir_name + input); //filename is assigned the value of our directory string as well as the input from the user
		}
		    
	    FileReader readhandle = new FileReader("E:\\e_downloads\\Eclipse\\eclipse_workspace\\CS1702_Lab6\\src\\files\\" + input); //readhandle is assigned the directory and user input file
	    BufferedReader br = new BufferedReader(readhandle); //buffered reader
	    String[] Words = null; //initialise the word array
	    String Split; //spaces between words
	    int WordCount = 0; //number of words initialised to 0 and declared as int

	    while((Split = br.readLine()) != null) {//reading content from the text file
	    	Words = Split.split(" "); //the words are split using a space
	        WordCount = WordCount + Words.length; //word count is increased for each word in the file
	    }
	    br.close();
	    readhandle.close();
	    System.out.println("Word count: " + WordCount); 
	}
	
	public static void WritingData_6_7_2() throws IOException {
		Scanner in = new Scanner(System.in); //user input
		System.out.print("Please enter your file name: ");
		String InputFN = in.nextLine();
		System.out.print("Please enter how many instances of n you would like to perfrom: ");
		int n = in.nextInt();
		
		FileWriter writehandle = new FileWriter("E:\\e_downloads\\Eclipse\\eclipse_workspace\\CS1702_Lab6\\src\\files\\" + InputFN + ".txt");
		BufferedWriter bw = new BufferedWriter(writehandle);
		for(int i=0;i<=n;++i) {
			double sqrt = Math.sqrt(i); 
			DecimalFormat oneDec = new DecimalFormat("0.0");
			DecimalFormat twoDec = new DecimalFormat("0.00");
			DecimalFormat threeDec = new DecimalFormat("0.000");
			
			String formatted_oneDec = oneDec.format(sqrt);
			String formatted_twoDec = twoDec.format(sqrt);
			String formatted_threeDec = threeDec.format(sqrt);
			
			String line = i+": " + formatted_oneDec + " ; " + formatted_twoDec + " ; " + formatted_threeDec;
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		writehandle.close();
	}
}
