package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		//Pennies
		
		String pennies = JOptionPane.showInputDialog("how many pennies do you have");
		
		int p = Integer.parseInt(pennies);
		
		// Ask the user how many nickels they have

		String nickels = JOptionPane.showInputDialog("how many nickels do you have");
		
		// Convert their answer to an int using Integer.parseInt()

		int n = Integer.parseInt(nickels);
		
		// Ask the user how many dimes they have, and convert their answer

		String dimes = JOptionPane.showInputDialog("how many dimes do you have");
		
		// Ask the user how many quarters they have, and convert their answer

		int d = Integer.parseInt(dimes);
		
		// Calculate how much money the user has and save it in a double variable 

		double total = (d*0.1) + (n*0.05) + (p*0.01);
		
		// Tell the user how much money they have

		JOptionPane.showMessageDialog(null, "you have $" + total);
		
	}
}
