package integrationpackage;

// John Nguyen


/**
 * Class that sets and and gets the arguments that are passed into the parameters.
 * @author John Nguyen
 *
 */
public class NameGetterAndSetter {
  
  private String name;
  private String month;
  private String day;
  private String year;


  /**
   * This constructor takes all the arguments and sets it equal to its respective variables.
   * It outputs the print statement with the arguments assigned. 
   * @param n Takes the argument n and is assigned to name.
   * @param m Takes the argument m and is assigned to month.
   * @param d Takes the argument d and is assigned to day.
   * @param y Takes the argument y and is assigned to year.
   */
  public NameGetterAndSetter(String n, String m, String d, String y) {
    this.name = n;
    this.month = m;
    this.day = d;
    this.year = y;
    System.out.println("Hello " + name + "\nThis program is finished at " + month + " - " + day + " - " + year + ".");
  }

}
