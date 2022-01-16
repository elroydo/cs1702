import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class three_three_five {
	static public void main(String args[]) {
		switchcases();
		animalcases();
		finch();
	}
	
	public static void switchcases() {
		String month = "September";
		int daysinmonth = 0;
						
		switch(month)
		{
			case "January": 
				daysinmonth = 31;
				break;
			case "February":
				daysinmonth = 28;
				break;
			case "March":
				daysinmonth = 31;
				break;
			case "April":
				daysinmonth = 30;
				break;
			case "May":
				daysinmonth = 31;
				break;
			case "June":
				daysinmonth = 30;
				break;
			case "July":
				daysinmonth = 31;
				break;
			case "August":
				daysinmonth = 31;
				break;
			case "September":
				daysinmonth = 30;
				break;
			case "October":
				daysinmonth = 31;
				break;
			case "November":
				daysinmonth = 30;
				break;
			case "December":
				daysinmonth = 31;
				break;
			default: 
				daysinmonth = -1;
				break;
		}
		System.out.println("Days in month " + month + " = " + daysinmonth);
		
		switch (month)
		{
		case "January": case "March": case "May": case "July": case "August": case "October": case "December":
		daysinmonth = 31;
		break;
		case "February":
		daysinmonth = 28;
				break;     	
		case "April": case "June": case "September": case "November":
		daysinmonth = 30;
				break;    
		default: 
		daysinmonth = -1;
		break;
		}
		System.out.println("Days in month " + month + " = " + daysinmonth);
	}
	
	public static void animalcases() {
		String animal = "Baboon";
		int legs = 0;
		
		switch(animal) {
			case "Cobra": case "Cod": case "Minke Whale":
			legs = 0;
			break;
			case "Baboon": case "Human": case "Klingon": case "Potto":
			legs = 2;
			break;
			case "Alsatian Dog": case "Sphynx Cat": case "Ocelot":
			legs = 4;
			break;
			case "Centipede": case "Tarantula": case "Black Scorpion": case "Paul Allen the German Octupus":
			legs = 6;
			break;
			default:
			legs = -1;
			break;
		}
		System.out.println("A " + animal + " has " + legs + " legs");
	}
	
	public static void finch() {
		Finch myfinch = new Finch();
		if (myfinch.isFinchUpsideDown() == true)
		{
			System.out.println("I am on my back!");
		}
		else
		{
		System.out.println("I am NOT on my back!");
		}
		
		myfinch.isBeakDown();
		myfinch.isBeakUp();
		myfinch.isFinchLevel();
		myfinch.isLeftWingDown();
		myfinch.isRightWingDown();
		myfinch.isObstacleLeftSide();
		myfinch.isObstacleRightSide();
		myfinch.isShaken();
		myfinch.isTapped();

		myfinch.quit();
	}
}
