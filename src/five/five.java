import java.util.ArrayList;
import javax.swing.JOptionPane;
import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class five {
	public static void main(String args[])
	{
		arrayslist_5_3();
		casting_5_4();
		arraylist_5_5();
		finch();
	}
	
	static public void arrayslist_5_3 () {
		Data x = new Data("Fred", 21);
		
		ArrayList<Data> array_list = new ArrayList<Data>();
		
		array_list.add(x);
		array_list.add(new Data("Jo", 43));
		array_list.add(new Data("Zoe", 37));
		array_list.add(1, new Data("Harry", 78));
		
		for(int i=0;i<array_list.size();++i)
		{
			array_list.get(i).Print();
		}
	}
	
	static public void casting_5_4() {
		int x = 10;
		double y = x;
		
		long v1 = 10L;
		Float v2 = 10.3F;
		
		System.out.println();
		System.out.println(y);
		
		
		double z = 10.3;
		int w = (int)z;
		
		System.out.println(w);
	}
	
	static public void arraylist_5_5() {
		ArrayList<Data> ArrayA = new ArrayList<Data>();
		ArrayList<Data> ArrayB = new ArrayList<>();
		ArrayList<Data> ArrayC = new ArrayList<>();
		ArrayList<Data> ArrayD = new ArrayList<>();
		
		ArrayA.add(new Data("Fred", 21));
		ArrayA.add(new Data("Jo", 43));
		ArrayA.add(new Data("Zoe", 37));

		PrintDataArray(ArrayA);
		System.out.println();
		ArrayB = ArrayA; //this simply points the contents of arraya to arrayb meaning, if data from the first array is deleted it will also affect the other array
		PrintDataArray(ArrayB);
		System.out.println();
		ArrayA.remove(1);
		PrintDataArray(ArrayB);
		
		System.out.println();
		System.out.println();
		
		ArrayC.add(new Data("Fred", 21));
		ArrayC.add(new Data("Jo", 43));
		ArrayC.add(new Data("Zoe", 37));
		
		PrintDataArray(ArrayC);
		System.out.println();
		ArrayD = (ArrayList<Data>)ArrayC.clone(); //use this to duplicate data from arraylists
		ArrayC.remove(1);
		PrintDataArray(ArrayC);
		System.out.println();	
		PrintDataArray(ArrayD);
		System.out.println();
	}
	
	private static void PrintDataArray(ArrayList<Data> x) {
		for (int i = 0; i < x.size(); ++i) {
        	x.get(i).Print();
        }
    }
	
	static public void finch() {
		Finch finch = new Finch();
		
		int[][] arr = new int[10][3], x, y;
		int z = 25;
		
		for(int i=0;i<arr.length;++i){
		   for(int j=0;j<arr[i].length;++j) {                                                                        
			   arr[i][0] = z;
			   arr[i][1] = z;
			   arr[i][2] = 5000;
			  System.out.print(arr[i][j] + " ");
		   }
		   z += 25;
		   System.out.println();
		   finch.setWheelVelocities(arr[i][0],arr[i][1],arr[i][2]);
		   JOptionPane.showMessageDialog(null,"Click OK to continue...");
		}
	}
}
