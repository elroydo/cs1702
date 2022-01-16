import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class four_finch {
	static public void main(String args[]) throws Exception {
		Finch finch = new Finch();
		
		long before = System.currentTimeMillis();
		
		while(System.currentTimeMillis() - before < 5000) {
			Thread.sleep(900);
			if (finch.isTapped()) {
				finch.stopWheels();
				System.out.println("tap");
			}else if (finch.isObstacle()) {
				for(int r=0;r<=255;r+=5){
					finch.setLED(r,0,0,10);
				}
				finch.stopWheels();
				System.out.println("obstacle detected");
			}else if (!finch.isObstacle()) {
				System.out.println("no obstacles ahead");
				for(int g=0;g<=255;g+=5)
				{
					finch.setLED(0,g,0,10);
				}
				finch.setWheelVelocities(100,100);
			}
		}
		finch.stopWheels();
		finch.quit();
		System.out.println("end");
	}
}
