/*
 * Student: Akpoguma Oghenerukevwe
 * Lab Professor: Dave Houtman
 * Assessment: Assignment 03
 * Due Date: December 9th, 2022
 */

/*
 * Class to display total rolls of die
 */
public class Assignment03AkpogumaOghenerukevwe { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int roll = 0;
		int[] diceRolls = new int[10];
		int totalRolls = 0;

		
		for(int count = 0; count < 1000; count++) {
		    roll = (int)(Math.random() * 10) + 1;
		    diceRolls[roll - 1] = diceRolls[roll - 1] + 1; 
		}	
		
		for(int index = 0; index < diceRolls.length ; index++) {  
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Akpoguma Oghenerukevwe");

	}

}
