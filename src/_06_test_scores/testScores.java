package _06_test_scores;

import javax.swing.JOptionPane;

public class testScores {

	public static void main(String[] args) {
		
		String testscore = JOptionPane.showInputDialog("what'd you get on the test");
		double testScore = Integer.parseInt(testscore);
		
		if(testScore <= 60) {
			JOptionPane.showMessageDialog(null, "you suck, go study");
		} else if(testScore <= 70 && testScore > 60) {
			JOptionPane.showMessageDialog(null, "you almost failed, go study");
		} else if(testScore <= 80 && testScore > 70) {
			JOptionPane.showMessageDialog(null, "barely acceptable, go study");
		} else if(testScore < 90 && testScore > 80) {
			JOptionPane.showMessageDialog(null, "acceptable");
		} else if (testScore >= 90) {
			JOptionPane.showMessageDialog(null,  "good");
		}
		
		
	}
}
