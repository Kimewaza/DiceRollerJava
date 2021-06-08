//  Integration Project for COP 2600 by John Nguyen
//Currently it won't make any sense, but I was thinking of translating the Dice roller to java if possible
//Primitive Data Types
/* 
byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive). The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters. They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.

short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.

int: By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -231 and a maximum value of 231-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1. Use the Integer class to use int data type as an unsigned integer. See the section The Number Classes for more information. Static methods like compareUnsigned, divideUnsigned etc have been added to the Integer class to support the arithmetic operations for unsigned integers.

long: The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1. Use this data type when you need a range of values wider than those provided by int. The Long class also contains methods like compareUnsigned, divideUnsigned etc to support arithmetic operations for unsigned long.

float: The float data type is a single-precision 32-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. As with the recommendations for byte and short, use a float (instead of double) if you need to save memory in large arrays of floating point numbers. This data type should never be used for precise values, such as currency. For that, you will need to use the java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and other useful classes provided by the Java platform.

double: The double data type is a double-precision 64-bit IEEE 754 floating point. Its range of values is beyond the scope of this discussion, but is specified in the Floating-Point Types, Formats, and Values section of the Java Language Specification. For decimal values, this data type is generally the default choice. As mentioned above, this data type should never be used for precise values, such as currency.

boolean: The boolean data type has only two possible values: true and false. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.

char: The char data type is a single 16-bit Unicode character. It has a minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).

Operator Precedence determines the order of when operators in the expression are evaluated. 





*/

// A variable in computer programming is like a placeholder for something like data. It could hold different data types like ints, doubles, Strings, etc
// A scope lets a certain variables access the data. It creates that the variables can and can't access.

package integrationpackage;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;



public class Main {
	
	
	public static int RandIntGenerator(int num) { //This is the header of the method. The "int num" inside of the RandIntGenerator is the parameter that the argument is passed to.
		Random RandIntGen = new Random();
		int RandNumGenerated = RandIntGen.nextInt(num) + 1;
		return RandNumGenerated;
	}


//-------------------------------------------------------------------------------------------------------------------------------------------	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name");
		String getName = scan.nextLine();
		System.out.println("Yo!" + getName  + "." + " Welcome to the beginning of my project.");
		System.out.println("This is a project for \"COP 2600\".");
		
		int menuChoice;
		do {
			System.out.println("Choose an option.");
			System.out.print("1.) First inspection stuff.\n");
			System.out.print("2.) Dice Roller Stuff.\n");
			System.out.print("3.) operators (+, -, * , etc). \n");
			System.out.print("4.) compareTo demonstration. \n");
			System.out.print("5.) Blank. \n");
			System.out.print("6.) Terminate program");
			menuChoice = scan.nextInt();
			
			switch(menuChoice) {
			
//-------------------------------------------------------------------------------------------------------------------------------------------
			
			case 1: //First Checkpoint
				System.out.println("Enter an integer");
				int getFirstInt = scan.nextInt();
				System.out.println("You inputted " + getFirstInt);
				System.out.println("Enter a number with a decimal place");
				double getDouble = scan.nextDouble();
				System.out.println("You inputted "+ getDouble);
				final boolean PRESET_BOOLEAN = true;
				//final makes it so whatever variable or data that is held in it becomes a constant.
				System.out.println("The Boolean feature allows for it to produce a true or false. In this case, its a " + PRESET_BOOLEAN);
				break; //Breaks stop the loop. Basically it terminates the loop and brings it back to, in this case, the menu stub. 
				
				
//-------------------------------------------------------------------------------------------------------------------------------------------
				
			case 2: //Random Class
				int c2MenuChoice;
				System.out.println("Choose an option.");
				System.out.println("1.) Singular d20(twenty sided) dice roll");
				System.out.println("2.) Singular d6(six sided) dice roll");
				System.out.println("3.) For Loop d20 rolls \n4.) While Loop d20 Roll");
				System.out.println("5.) Three d20 rolls");
				c2MenuChoice = scan.nextInt();
				if(c2MenuChoice == 1) {
					int randNum = RandIntGenerator(20); //RandIntGenerator() is the method call and the 20 inside it is the argument being passed to the method.
					System.out.println("Rolled: " + randNum);
					String CHMessage = (randNum == 20) || (randNum == 1) ? "Critical Hit" : "No Critical Hit";
					System.out.println(CHMessage);
					break;
					
				}
				
				else if(c2MenuChoice == 2){
					int randNum = RandIntGenerator(6);
					System.out.println("Rolled: " + randNum);
					break;
				}
				
				else if(c2MenuChoice == 3) {
					System.out.println("Input the amount of times you want to roll");
					int GetAmountRolling = scan.nextInt();
					
					for(int rolling = 0 ; rolling<GetAmountRolling ; rolling++) {
						int randNum = RandIntGenerator(20);
						System.out.println("Rolled:" + randNum);	
					
					}
					break;
				
				}
				
				else if(c2MenuChoice == 4) {
					boolean continueProgram = true;
					while(continueProgram) {
						Scanner c2dScan = new Scanner(System.in);
						int UserInput = c2dScan.nextInt();
						int rolledInt = RandIntGenerator(UserInput);
						if (UserInput ==  1) {
							continueProgram = false;
						}
						else {
							System.out.println("Rolled: " + rolledInt);
						}
						
	
					}
					break;
				}
				
				else if(c2MenuChoice ==5) {
					int continueProgram = 1;
					while(continueProgram <= 3) {
						int rolledInt = RandIntGenerator(20);
						System.out.println("Rolled: " + rolledInt);
						continueProgram += 1;
						
					}
					break;
				}
				else {
					break;
				}
				
//-------------------------------------------------------------------------------------------------------------------------------------------
				
			case 3: //Operators
				int c3MenuChoice;
				System.out.println("Please choose and input");
				System.out.println("1.) + ");
				System.out.println("2.) - ");
				System.out.println("3.) * ");
				System.out.println("4.) / ");
				System.out.println("5.) % ");
				System.out.println("6.) ++ and -- Showcase");
				System.out.println("7.) Square Root a number ");
				c3MenuChoice = scan.nextInt();
				if(c3MenuChoice == 1) {
					System.out.println("The addition operator");
					System.out.println("Please input an integer");
					int getc3Input1 = scan.nextInt();
					System.out.println("Please input another integer");
					int getc3Input2 = scan.nextInt();
					int c3InputTotal1 = (getc3Input1 + getc3Input2) ; 
					System.out.println("The total of the two is: " + c3InputTotal1);
					break;
				}
				else if(c3MenuChoice == 2) {
					System.out.println("The Subtraction operator");
					System.out.println("Please input an integer");
					int getc3SubInput1 = scan.nextInt();
					System.out.println("Please input another integer");
					int getc3SubInput2 = scan.nextInt();
					int c3InputTotal2 = (getc3SubInput1 - getc3SubInput2) ; 
					System.out.println("The total of the two is: " + c3InputTotal2);
					break;
					
				}
				else if(c3MenuChoice ==3) {
					System.out.println("The Multiplication operator");
					System.out.println("Please input an integer");
					int getc3MultiInput1 = scan.nextInt();
					System.out.println("Please input another integer");
					int getc3MultiInput2 = scan.nextInt();
					int c3InputTotal3 = (getc3MultiInput1 * getc3MultiInput2) ; 
					System.out.println("The total of the two is: " + c3InputTotal3);
					break;
				
				}
				else if(c3MenuChoice ==4) {
					System.out.println("The Multiplication operator");
					System.out.println("Please input an integer");
					int getc3DivisionInput1 = scan.nextInt();
					System.out.println("Please input another integer");
					int getc3DivisionInput2 = scan.nextInt();
					int c3InputTotal4 = (getc3DivisionInput1 / getc3DivisionInput2) ; 
					System.out.println("The total of the two is: " + c3InputTotal4);
					break;
				}
				else if(c3MenuChoice == 5) {
					System.out.println("The Modulus Operator \nPlease input and integer");
					int getc3ModulusInput1 = scan.nextInt();
					System.out.println("Please input another integer");
					int getc3ModulusInput2 = scan.nextInt();
					int c3InputTotal5 = (getc3ModulusInput1 % getc3ModulusInput2);
					System.out.println("The remainder between the two numbers is " + c3InputTotal5);
							
				}
				
				else if(c3MenuChoice == 6){
					System.out.println("The Increment and Decrement Operators");
					int incrVar1 = 1;
					System.out.println("The increment operator(++) increments the variable stored inside by one. Number: " + incrVar1++);
					System.out.println("The next number would be: " + incrVar1++);
					int incrVar2 = 200;
					System.out.println("The decrement operator(--) decrements the variable stored inside by one. Number: " + incrVar2--);
					System.out.println("The next number would be: " + incrVar2--);
					break;
					
				}
				
				else if(c3MenuChoice == 7) {
					System.out.println("Square Root\nEnter an integer.");
					int getSqRtInput = scan.nextInt();
					System.out.println("You inputted " + getSqRtInput + ".");
					System.out.println("The square root of that is " + (double)Math.sqrt(getSqRtInput));
					//Casting makes a variable act as another data type. For example, Regular ints can't have decimals, but if you cast a (double) next to it, it will be able to produce decimals. 
				}
				
				
				else {
					break;

				}
				
				
//-------------------------------------------------------------------------------------------------------------------------------------------
				
			case 4: //CompareTo
				
				String strVar1 = "";
				String strVar2 = "";
				
				Scanner c4Input1 = new Scanner(System.in);
				System.out.println("Input a word");
				strVar1 = c4Input1.nextLine();
				
				Scanner c4Input2 = new Scanner(System.in);
				System.out.println("Input another word");
				strVar2 = c4Input2.nextLine();
				
				int resultOfCompare = strVar1.compareTo(strVar2);
				if(resultOfCompare>1) {
					System.out.println("The second string is lexicographically first");
					
				}
				else if(resultOfCompare == 0) {
					System.out.println("The two strings are lexicographically equivalent");
					
				}
				else {
					System.out.println("The first string is lexicographically first");
					
				}
				//The == operator basically compares the two strings to see if they're equal or the same as. 
				
//-------------------------------------------------------------------------------------------------------------------------------------------				
	
			case 5:
				break;
				
//-------------------------------------------------------------------------------------------------------------------------------------------
				
				
				
			default:
				continue; //Continue basically brings the loop back around. So, in this case, it would bring the loop back to the menu.
			}
			
			
//-------------------------------------------------------------------------------------------------------------------------------------------
			
		}while (menuChoice != 6); 
		


	}

}

//Notes: Try to reduce of break. 
//NS: Better Variable names


