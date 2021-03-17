import javax.swing.JOptionPane;
public class FirstDegreeEquaTwoVars {

	public static void main(String[] args) {
		String num11, num12, numb1, num21, num22, numb2;
		String strNotification = "You're just enter : ";
		double a11, a12, b1, a21, a22, b2;
		double d, d1, d2 , x1, x2;
		
		num11 = JOptionPane.showInputDialog(null,"Enter a1 :",
				"First equation : a1x + b1y = c1 :", JOptionPane.INFORMATION_MESSAGE);

		num12 = JOptionPane.showInputDialog(null, "Enter b1 :",
				"First equation : a1x + b1y = c1 :", JOptionPane.INFORMATION_MESSAGE);
		
		numb1 = JOptionPane.showInputDialog(null, "Enter c1 :",
				"First equation : a1x + b1y = c1 :", JOptionPane.INFORMATION_MESSAGE);
		
		num21 = JOptionPane.showInputDialog(null, "Enter a2 :",
				"Second equation : a2x + b2y = c2 :", JOptionPane.INFORMATION_MESSAGE);
		
		num22 = JOptionPane.showInputDialog(null, "Enter b2 :",
				"Second equation : a2x + b2y = c2 :", JOptionPane.INFORMATION_MESSAGE);
		
		numb2 = JOptionPane.showInputDialog(null, "Enter c2 :",
				"Second equation : a2x + b2y = c2 :", JOptionPane.INFORMATION_MESSAGE);
		
		a11 = Double.parseDouble(num11);
		a12 = Double.parseDouble(num12);
		b1 = Double.parseDouble(numb1);
		a21 = Double.parseDouble(num21);
		a22 = Double.parseDouble(num22);
		b2 = Double.parseDouble(numb2);
		
		d = (a11 * a22) - (a21 * a12);
		d1 = (b1 * a22) - (b2 * a12);
		d2 = (a11 * b2) - (a21 * b1);
		
		if(d!=0)
		{
			x1 = d1/d; x2 = d2/d;
			strNotification = "The system has a unique solution (x1,x2) = "
							+ "(" +x1 + "," + x2 + ")\n";
		}
		else
		{
			if (d==0 && d==d1 && d1==d2) 
				strNotification = "The system has infinitely many solutions\n";
			else strNotification = "The system has no solution!\n"; 
		}
		JOptionPane.showMessageDialog(null, strNotification,
										" Result of the system : ", 
										JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
