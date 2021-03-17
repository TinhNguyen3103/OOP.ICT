import java.util.Scanner;
public class DaysOfAMonth {
	
	public static int checkMonth(String month, String[][] strMonth) {
		boolean check = false;
		int m = 0;
 label: for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 4; j++) {
				if (month.equals(strMonth[i][j]) == true) {
					check = true;
					m = i;
					break label;
				}
			}
		}
		if (check == true)
			return m+1;
		return -1;
	}
	
	public static boolean checkLeapYear(int year) {
		if (year % 400 == 0)	return true;
		if (year%4 == 0 && year%100 != 0)	return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int year = 0;
		String month;
		String[][] strMonth = {{"1", "January", "Jan.", "Jan"},
							   {"2", "February", "Feb", "Feb."},
							   {"3", "March", "Mar", "Mar."},
							   {"4", "April", "Apr", "Apr."},
							   {"5", "May", "May", "May"},
							   {"6", "June", "Jun", "June"},
							   {"7", "July", "Jul", "July"},
							   {"8", "August", "Aug", "Aug."},
							   {"9", "September", "Sep", "Sept."},
							   {"10", "October", "Oct", "Oct."},
							   {"11", "November", "Nov", "Nov."},
							   {"12", "December", "Dec", "Dec."}};
		
		do {
			System.out.println("Enter the year: ");
			year = keyboard.nextInt();
		} while (year < 0);
		
		do {
			System.out.println("Enter the month: ");
			keyboard = new Scanner(System.in);
			month = keyboard.nextLine();
		} while (checkMonth(month, strMonth) == -1);
		
		switch (checkMonth(month, strMonth)) {
		case 1:
			System.out.print("The January in "+ year +" has 31 days.");
			break;
		case 2:
			if (checkLeapYear(year)) {
				System.out.print("The February in "+ year +" has 29 days.");
				break;
			}
			System.out.print("The February in "+ year +" has 28 days.");
			break;
		case 3:
			System.out.print("The March in "+ year +" has 31 days.");
			break;
		case 4:
			System.out.print("The April in "+ year +" has 30 days.");
			break;
		case 5:
			System.out.print("The May in "+ year +" has 31 days.");
			break;
		case 6:
			System.out.print("The June in "+ year +" has 30 days.");
			break;
		case 7:
			System.out.print("The July in "+ year +" has 31 days.");
			break;
		case 8:
			System.out.print("The August in "+ year +" has 31 days.");
			break;
		case 9:
			System.out.print("The September in "+ year +" has 30 days.");
			break;
		case 10:
			System.out.print("The October in "+ year +" has 31 days.");
			break;
		case 11:
			System.out.print("The November in "+ year +" has 30 days.");
			break;
		case 12:
			System.out.print("The December in "+ year +" has 31 days.");
			break;
		}
	}
}
