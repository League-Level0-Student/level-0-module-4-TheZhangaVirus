package _10_happy_pet;

import javax.swing.JOptionPane;

public class otrocosas {

	int task = JOptionPane.showOptionDialog(null, "What task", pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "groom", "walk", "food/water", "clean poo" }, null);
	
	
	if(task == 0) {
		
		JOptionPane.showMessageDialog(null, "your pet feels good");
			int task1a = JOptionPane.showOptionDialog(null, "What task", pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "walk", "food/water", "clean poo" }, null);
				if(task1a == 0) {
						JOptionPane.showMessageDialog(null, "your pet likes to walk");
					} else if(task1a == 1) {
							JOptionPane.showMessageDialog(null, "your pet eats their food and drinks their water");
						} else if(task1a == 2) {
								JOptionPane.showMessageDialog(null, "your pet makes their respective pet noise");
							}
		
		
	} else if(task == 1) {
		
		JOptionPane.showMessageDialog(null, "your pet likes to walk");
			int task1b = JOptionPane.showOptionDialog(null, "What task", pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "groom", "food/water", "clean poo" }, null);
				if(task1b == 0) {
						JOptionPane.showMessageDialog(null, "your pet makes their respective pet noise");
					} else if(task1b == 1) {
							JOptionPane.showMessageDialog(null, "your pet eats their food and drinks their water");
						} else if(task1b == 2) {
								JOptionPane.showMessageDialog(null, "your pet feels good");
							}
		
		
	} else if(task == 2) {
		
		JOptionPane.showMessageDialog(null,  "your pet drinks their water and eats their food");
			int task1c = JOptionPane.showOptionDialog(null, "What task", pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "groom", "walk", "clean poo" }, null);
				if(task1c == 0) {
						JOptionPane.showMessageDialog(null, "your pet makes their respective pet noise");
					} else if(task1c == 1) {
							JOptionPane.showMessageDialog(null, "your pet likes to walk");
						} else if(task1c == 2) {
								JOptionPane.showMessageDialog(null, "your pet feels good");
							}
		
	
	
	} else if(task == 3) {
	
		JOptionPane.showMessageDialog(null,  "");
		int task1d = JOptionPane.showOptionDialog(null, "What task", pet, 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "groom", "walk", "food/water" }, null);
	
	
	
	}
	
}
