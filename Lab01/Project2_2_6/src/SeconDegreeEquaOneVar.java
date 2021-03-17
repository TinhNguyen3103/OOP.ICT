import javax.swing.JOptionPane;

public class SeconDegreeEquaOneVar {

	public static void main(String[] args) {
		String num1,num2,num3;
		String strNotification = "You're just enter : ";
		double a, b, c, delta;
		
		num1 = JOptionPane.showInputDialog(null,"Enter a :",
			   "Equation ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE);
		num2 = JOptionPane.showInputDialog(null,"Enter b :",
			   "Equation ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE);
		num3 = JOptionPane.showInputDialog(null,"Enter c :",
			   "Equation ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE);
		
		a = Double.parseDouble(num1);
		b = Double.parseDouble(num2);
		c = Double.parseDouble(num3);
		
		if (a == 0) {
			strNotification = "a must different from 0! ";
			JOptionPane.showMessageDialog(null, strNotification, "ERROR",
					   		JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		delta = (b*b) - 4 * a * c;
		if (delta==0) 
			strNotification = "The equation has double root = " + (-b/(2*a)) + "\n";
		else if (delta > 0) 
			strNotification = "The equation has two distinct roots : "
							  + ((-b+Math.sqrt(delta))/2*a) + " and " 
							  + ((-b-Math.sqrt(delta))/2*a);
		else 
			strNotification = "The equation has no solution!\n";
		JOptionPane.showMessageDialog(null, strNotification,
							   "Result of equation ax^2+bx+c=0 :", 
							   JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
