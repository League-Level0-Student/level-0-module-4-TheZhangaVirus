package _10_happy_pet;

import javax.swing.JOptionPane;
import java.util.Random;

public class ownAdventure {
	
	String name = JOptionPane.showInputDialog("what is your name");
	JOptionPane.showMessageDialog(null, "*set the scene*");
	

	static void die() {
		JOptionPane.showMessageDialog(null, "you died");
	}

}
