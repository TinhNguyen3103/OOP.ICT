import javax.swing.JOptionPane;
public class FirstDegreeEquaOneVar {

	public static void main(String[] args) {
		String num1,num2;
		String strNotification = "You're just enter : ";
		double a, b, result;
		
		num1 = JOptionPane.showInputDialog(null,"Enter a :",
			   "Equation ax+b=0", JOptionPane.INFORMATION_MESSAGE);

		num2 = JOptionPane.showInputDialog(null, "Enter b",
			   "Equation ax+b=0", JOptionPane.INFORMATION_MESSAGE);

		
		a = Double.parseDouble(num1);
		b = Double.parseDouble(num2);
		
		if(a!=0)
		{
			result = -b/a;
			strNotification = "x" + " = " + result + "\n";
		}
		else
		{
			if(b==0) strNotification = "Countless x" + "\n";
			else strNotification = "No solution" + "\n";
		}
		JOptionPane.showMessageDialog(null, strNotification, 
				"The result of equation ax+b=0" + " : ", 
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}

