package guimath;

import javax.swing.JOptionPane;

public class guimath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length a of triangle:"));
		double b=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter length b of triangle:"));
		
		double c=Math.sqrt((a*a)+(b*b));
		
		JOptionPane.showMessageDialog(null,"The hypotenuse is: "+c);
		
	}

}
