/*
 * Student Name:Akpoguma Oghenerukevwe 
 * Lab Professor: Dave Houtman
 * Due Date: December 4th, 2022
 * Description: A program to show the unfair advantage or disadvantage of dice roll
 */

import java.util.Scanner;

/*
 * Class that accepts input from user, and then calls methods from DiceChecker
 */
public class Program { 

	/*
	 * Entry point for the program to get new user input
	 */
	public static void main(String[] args) {
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		int option = 0;
		DiceChecker diceChecker = new DiceChecker(); //DiceChecker instantiation
		Scanner keyboard = new Scanner (System.in);  // Scanner instantiation 
		
		do { 
			System.out.printf("Select from the following menu:%n");
			System.out.printf("%d Enter Dice Roll Values%n", ENTER_VALUES);
			System.out.printf ("%d Display Report%n", DISPLAY_REPORT);
			System.out.printf("%d Reset Values %n", RESET_VALUES);
			System.out.printf ("%d Exit Program %n", EXIT_PROGRAM);
		
			option= keyboard.nextInt();
			keyboard.nextLine();
			
			switch (option) {
			case ENTER_VALUES:
				diceChecker.enterData();
				break;
			case DISPLAY_REPORT:
				diceChecker.printReport();
				break;
			case RESET_VALUES:
				diceChecker.resetData();
				break;
			case EXIT_PROGRAM:
				System.out.println ("Program by Akpoguma Oghenerukevwe");
				System.out.println ("Program exits");
				break;
			default:
				System.out.println ("Invalid menu option selected");
			
			}

	}while (option!= EXIT_PROGRAM);

}
}

