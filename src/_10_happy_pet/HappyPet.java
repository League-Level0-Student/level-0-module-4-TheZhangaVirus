package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable

		String pet = JOptionPane.showInputDialog("what pet do you wanna buy (cat/dog/fish)");
		
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			
			for(int i = 0; i < 4; i++) {
				
				int task = JOptionPane.showOptionDialog(null, "What task", "pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "groom", "walk", "food/water", "clean poo" }, null);
				
				if(task == 0) {
					groom();
				} else if(task == 1) {
					walk();
				} else if(task == 2) {
					food();
				} else if(task == 3) {
					clean();
				}
				
				JOptionPane.showMessageDialog(null, "pet happiness meter: " + (i + 1) + "/4");
				
			}

			JOptionPane.showMessageDialog(null, "you love your " + pet);
			
	  		
			
	//		if(task1a == 0) {
	//			JOptionPane.showMessageDialog(null, "your pet makes their respective pet noise");
	//		} else if(task1a == 1) {
	//			JOptionPane.showMessageDialog(null, "your pet eats their food and drinks their water");
	//		} else if(task1a == 2) {
	//			JOptionPane.showMessageDialog(null, "your pet likes to walk");
	//		}
			
			
			
			
			
			/* clean is 3
			 * food/water is 2
			 * walk is 1
			 * groom is 0
			 */
			
			
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void groom() {
		
		String pet = JOptionPane.showInputDialog("what pet did you buy (cat/dog/fish)");
		if(pet.equalsIgnoreCase("dog")) {
			JOptionPane.showMessageDialog(null, "your dog barks");
		} else if(pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "your cat purrs");
		} else if(pet.equalsIgnoreCase("fish")) {
			JOptionPane.showMessageDialog(null, "you can't groom a fish");
		}
	
	}

	static void clean() {
	
		JOptionPane.showMessageDialog(null, "your pet is happy");
	
	}

	static void food() {
	
		JOptionPane.showMessageDialog(null, "your pet eats the food and drinks the water");
	
	}
	
	static void walk() {
		
		String pet = JOptionPane.showInputDialog("what pet do you have (cat/dog/fish)");
		if(pet.equalsIgnoreCase("fish")) {
			JOptionPane.showMessageDialog(null, "fish can't walk");
		} else if(pet.equalsIgnoreCase("dog") && pet.equalsIgnoreCase("cat")) {
			JOptionPane.showMessageDialog(null, "your pet likes to walk");
		}
	
	}



}