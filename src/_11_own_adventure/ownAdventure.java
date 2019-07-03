package _11_own_adventure;

import javax.swing.JOptionPane;
import java.util.Random;

public class ownAdventure {
	
	public static void main(String[] args) {
		
		int choice1 = JOptionPane.showOptionDialog(null, "you are walking along, and your phone drops down a hole, do you go look for it?", "story", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "yes", "no" }, null);
		
		//choice 1
		
		if(choice1 == 1) {
			JOptionPane.showMessageDialog(null, "you lose your phone and go home, you are sad, THE END");
			System.exit(0);
		} else if(choice1 == 0) {
		
		//choice 2
			
			int choice2 = JOptionPane.showOptionDialog(null, "you go down the hole but your phone is nowhere to be seen, and it splits 2 ways, which way do you go?", "story", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "left", "right" }, null);

			if(choice2 == 1) {
				
		//choice 3
				
				int choice3 = JOptionPane.showOptionDialog(null, "you arrive at another intersection, this time, it splits 3 ways, which way do you go?", "story", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "left", "forward", "right" }, null);
				
				if(choice3 == 0) {
					JOptionPane.showMessageDialog(null, "you stumble on a hidden tripwire, and get shot to death by arrows, THE END");
					System.exit(0);
				} else if(choice3 == 1) {
					JOptionPane.showMessageDialog(null, "you find your phone, propped up on an altar. You take it and return home safely, THE END");
					System.exit(0);
				} else if(choice3 == 2) {
					JOptionPane.showMessageDialog(null, "you enter a room, only to find that you've been tricked, and trapped. The room fills up with water, and you die, THE END");
					System.exit(0);
				}
				
				
			} else if(choice2 == 0) {
				JOptionPane.showMessageDialog(null, "you fall down a pit and die, THE END");
				System.exit(0);
			}
		
		
		}
		
	}

}
