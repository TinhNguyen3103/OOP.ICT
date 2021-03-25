package DateTesting;

public class DateTest {
	public static void main(String[] args) {
		System.out.println("Check date");
		MyDate myDate = new MyDate("02-29-2000");
		myDate.setYear("2021"); // Wrong Year
		myDate.print();
		
		MyDate myDate1 = new MyDate("01-31-2021");
		myDate1.setMonth("Mar"); // Wrong Month
		myDate1.print();
		
		MyDate myDate2 = new MyDate("Feb 4 2000");
		myDate2.setDay("31"); // Wrong Day
		
		
		myDate2.print();
		System.out.println("\nSorting Date:");
		DateUtils testDateUtils = new DateUtils();
		testDateUtils.sortDate(myDate,myDate1,myDate2);
	}
}
