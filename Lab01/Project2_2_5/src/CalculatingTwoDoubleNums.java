import javax.swing.JOptionPane;
public class CalculatingTwoDoubleNums {

	public static void main(String[] args) {
		String strNum1, strNum2;
		double num1, num2, sum, sub, prod, div ;
		
		
		strNum1 = JOptionPane.showInputDialog(null,
				"Plese input first number : ", "Input first number",
				JOptionPane.INFORMATION_MESSAGE);
		num1 = Double.parseDouble(strNum1);
		
		
		strNum2 = JOptionPane.showInputDialog(null,
				"Plese input second number : ", "Input second number",
				JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		
		sum = num1 + num2;
		sub = num1 - num2;
		prod = num1 * num2;
		if(num2==0)
		{
			JOptionPane.showMessageDialog(null,"Sum" + " = " + sum + "\n"
					+ "Sub" + " = " + sub + "\n"
					+ "Prod"+ " = " + prod + "\n"
					+ "Div is null");
			System.exit(0);
		}
		else {
			div = num1/num2;
			JOptionPane.showMessageDialog(null,"Sum" + " = " + sum + "\n"
					+ "Sub" + " = " + sub + "\n"
					+ "Prod"+ " = " + prod + "\n"
					+ "Div" + " = " + div + "\n");
			System.exit(0);
		}
	}
}
