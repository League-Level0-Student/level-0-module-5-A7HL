package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int hapinessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Water","Take a Walk","Groom","Clean up Poop" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if (task == 0) {
				method_cuddle(pet);
				
			}if (task == 1) {
				method_food();
			}
			if (task == 2) {
				method_water();
			}
			if (task == 3) {
				method_walk();
			}
			if (task == 4) {
				method_groom();
			}
			if (task == 5) {
				method_clean();
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void method_cuddle(String message) {
		JOptionPane.showMessageDialog("pet");
	}
	public static void method_food() {
		
	}
	public static void method_water() {
		
	}
	public static void method_walk() {
		
	}public static void method_groom() {
		
	}
	public static void method_clean() {
		
	}
}