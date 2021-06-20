//JOhn Nguyen
package integrationpackage;


import java.util.Random;

class RandomIntGenerator {
	Random RandIntGen = new Random();
	private int rollingAmount;
	
	public void setRollingAmount(int var1) {
		int RandNumGenerated = RandIntGen.nextInt(var1) + 1;
		this.rollingAmount = RandNumGenerated;
	}
	
	public int getRollingAmount() {
		return rollingAmount;
		
	}
	
	
	public RandomIntGenerator(int numberToSet) {
		rollingAmount = numberToSet;
	}
	
	
	
	
	public static int randGenerator(int num) { //This is the header of the method. The "int num" inside of the RandIntGenerator is the parameter that the argument is passed to.
		Random RandIntGen = new Random();
		int RandNumGenerated = RandIntGen.nextInt(num) + 1;
		return RandNumGenerated;
		
		
	}
}
