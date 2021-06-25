// JOhn Nguyen

package integrationpackage;

import java.util.Random;

/**
 * This class holds the building blocks for the random class stuff. 
 * The field rollingAmount is nothing and waits to be set. 
 * setRollingAmount rolls for a number and sets that number to the field.
 * getRollingAmount returns the number thats stored in rollingAmount. 
 * @author John Nguyen
 *
 */
public class RandomIntGenerator {
  Random randIntGen = new Random();
  private int rollingAmount;

  public void setRollingAmount(int var1) {
    int randomNumberGenerated = randIntGen.nextInt(var1) + 1;
    this.rollingAmount = randomNumberGenerated;
  }

  public int getRollingAmount() {
    return rollingAmount;

  }

  public RandomIntGenerator(int numberToSet) {
    rollingAmount = numberToSet;
  }

  /**
   * randGenerator is a method that takes an argument and sets that to the random generator.
   * Which then sets randNumGenerated to that number and returns it to wherever it was called. 
   * @param num the number that is passed in to create a range where the numbers are rolled.
   * @return returns the number generated by the random class. 
   */
  public static int randGenerator(int num) {
    // This is the header of the method. The "int num"
    // inside of the
    // RandIntGenerator is the parameter that the argument is passed to.
    Random randomIntegerGenerated = new Random();
    int randNumGenerated = randomIntegerGenerated.nextInt(num) + 1;
    return randNumGenerated;

  }
}
