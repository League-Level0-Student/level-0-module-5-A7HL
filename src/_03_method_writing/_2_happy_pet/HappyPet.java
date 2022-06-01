package _03_method_writing._2_happy_pet;
import java.awt.Component;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int hapinessLevel = 0;
		static String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
	
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
	while(true) {
			int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Water","Take a Walk","Groom","Clean up Poop" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task == 0) {
				method_cuddle(pet);
				
			}if (task == 1) {
				method_food(pet);
			}
			if (task == 2) {
				method_water(pet);
			}
			if (task == 3) {
				method_walk(pet);
			}
			if (task == 4) {
				method_groom(pet);
			}
			if (task == 5) {
				method_clean(pet);
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			String hap1 = String.format("Your pet has %s out of 100 happiness.",hapinessLevel);
			JOptionPane.showMessageDialog(null,hap1);
			if (hapinessLevel>=100) {
				JOptionPane.showMessageDialog(null, "You love your pet!");
				System.exit(0);
			}
			}
		}
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void method_cuddle(String pet) {
		String cuddle = String.format("You use CUDDLE on %s, it's super effective!\r\n"
				+ "+30 hapiness", pet);
		JOptionPane.showMessageDialog(null,cuddle);
		hapinessLevel +=30;
	}
	public static void method_food(String pet) {
		String food = String.format("You use FOOD on %s.\r\n"
				+"+15 hapiness", pet);
		JOptionPane.showMessageDialog(null,food);
		hapinessLevel +=15;
	}
	public static void method_water(String pet) {
		String water = String.format("You use WATER on %s.\r\n"
				+"+15 happiness", pet);
		JOptionPane.showMessageDialog(null,water);
		hapinessLevel +=15;
	}
	public static void method_walk(String pet) {
		String walk = String.format("You use TAKE A WALK on %s. \r\n"
				+ "+15 happiness", pet);
		JOptionPane.showMessageDialog(null,walk);
		hapinessLevel +=15;
	}public static void method_groom(String pet) {
		String groom = String.format("You use GROOM on %s, it's not very effective...\r\n"
				+ "+5 happiness", pet);
		JOptionPane.showMessageDialog(null,groom);
		hapinessLevel +=5;
	}
	public static void method_clean(String pet) {
		String clean = String.format("You use CLEAN UP POOP on %s, its not very effective...\r\n"
				+ "+5 happiness", pet);
		JOptionPane.showMessageDialog(null,clean);
		hapinessLevel +=5;
	}
}