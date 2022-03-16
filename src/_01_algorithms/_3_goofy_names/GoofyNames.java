package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String YourName = JOptionPane.showInputDialog("Enter your name.");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
		System.out.println(YourName.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.
		for(int a =0;a<YourName.length(); a+=1){
				// 4. Create a char variable to store the next character of the name
				//    use .charAt()
				char car = YourName.charAt(a);
				
				// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.
				if (a%2== 0) {
					
					car = Character.toUpperCase(car);
					
				}
				else if (a%2==1){
					car = Character.toLowerCase(car);
					
				}
			
				// 6. Even characters should be made uppercase and odd characters made lowercase
				//    HINT: use Character.toUpperCase() or Character.toLowerCase()
	
				goofyName += car;
				System.out.println(goofyName);
				// 7. ADD the char to the end of the goofyName String

		
		// 8. Use pop-up to show user their Goofy name

	}
	}
}

