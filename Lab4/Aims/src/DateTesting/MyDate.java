package DateTesting;
import java.util.Scanner;
import java.time.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MyDate {
	private String day;
	private String month;
	private String year;
	
	
	
	public MyDate(String date) {
		super();
		
		String[] arrSplitDate = date.split("-|\\s"); 
		System.out.println(Arrays.toString(arrSplitDate));
		int lengthOfFirstIndex = arrSplitDate[0].length();
		if(lengthOfFirstIndex == 4) {
			if(checkValidDate(arrSplitDate[2], arrSplitDate[1], arrSplitDate[0])) {
				this.day = arrSplitDate[2];
				this.month = arrSplitDate[1];
				this.year = arrSplitDate[0];
			}else System.out.println("Constructor invalid date");
		}else if(lengthOfFirstIndex == 3) {
			if(checkValidDate(arrSplitDate[1], Integer.toString(convertMonthToInteger(arrSplitDate[0])), arrSplitDate[2])) {
				this.day = arrSplitDate[1];
				this.month = arrSplitDate[0];
				this.year = arrSplitDate[2];
			}else System.out.println("Constructor invalid date");
		}else if(lengthOfFirstIndex == 2) {
			int lenghOfSecondIndex = arrSplitDate[1].length();
			if(lenghOfSecondIndex == 2) {
				if(checkValidDate(arrSplitDate[1], arrSplitDate[0], arrSplitDate[2])) {
					this.day = arrSplitDate[1];
					this.month = arrSplitDate[0];
					this.year = arrSplitDate[2];
				}else System.out.println("Constructor invalid date");
			}else {
				if(checkValidDate(arrSplitDate[0], Integer.toString(convertMonthToInteger(arrSplitDate[1])) , arrSplitDate[2])) {
					this.day = arrSplitDate[0];
					this.day = arrSplitDate[1];
					this.year = arrSplitDate[2];
				}else System.out.println("constructor invalid date");
			}
		}else System.out.println("Construct invalid format");
	}
	public MyDate() {
		super();
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year  = localDate.getYear();
		int month = localDate.getMonthValue();
		int day   = localDate.getDayOfMonth();
		
		this.day = convertDayString(day);
		this.month = convertMonthToString(month);
		this.year = Integer.toString(year); 
	}
	
	public void accept() {
		Scanner keyboardScanner = new Scanner(System.in);
		String day,month,year;
		System.out.println("Enter the day: ");
		day = keyboardScanner.nextLine();
		System.out.println("Enter the month: ");
		month = keyboardScanner.nextLine();
		System.out.println("Enter the year: ");
		year = keyboardScanner.nextLine();
		if(checkValidDate(day, month, year)) {
			this.day = convertDayString(Integer.parseInt(day));
			this.month = convertMonthToString(Integer.parseInt(month));
			this.year = year;
		}
		keyboardScanner.close();
	}
	
	public void print() {
		System.out.println( this.month + " " + this.day + " " + this.year);
	}
	
	public boolean checkValidDate(String day,String month,String year) {
		YearMonth yearMonthObject = YearMonth.of(Integer.parseInt(year), Integer.parseInt(month));
		int actualDays = yearMonthObject.lengthOfMonth();
		if(Integer.parseInt(day) > actualDays || Integer.parseInt(day) < 1) {
			return false;
		}else return true;
	}
	
	public String convertDayString(int day) {
		switch (day) {
		case 1:
			return "1st";
		case 2:
			return "2nd";
		case 3:
			return "3rd";
		default:
			return Integer.toString(day) + "th";
		}
	}
	public int convertDayInteger(String day) {
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(day);
		m.find();
		return Integer.parseInt(m.group());
	}
	public String convertMonthToString(int month) {
		switch (month) {
		case 1: 
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}
	}
	
	public int convertMonthToInteger(String month) {
		switch (month) {
		case "January":
		case "Jan":
			return 1;
		case "February":
		case "Feb":
			return 2;
		case "March":
		case "Mar":
			return 3;
		case "April":
		case "Apr":
			return 4;
		case "May":
			return 5;
		case "June":
		case "Jun":
			return 6;
		case "July":
		case "Jul":
			return 7;
		case "August":
		case "Aug":
			return 8;
		case "September":
		case "Sep":
			return 9;
		case "October":
		case "Oct":
			return 10;
		case "November":
		case "Nov":
			return 11;
		case "December":
		case "Dec":
			return 12;
		default:
			return Integer.parseInt(month);
		}
	}
	
	
	//Getter and setter
	public int getDay() {
		return convertDayInteger(this.day);
	}
	public void setDay(String day) {
		
		if(this.month != null) {
			// Check valid day by this.month and year
			YearMonth yearMonthObject = YearMonth.of(Integer.parseInt(this.year), convertMonthToInteger(this.month));
			int daysOfnewMonth = yearMonthObject.lengthOfMonth();
			
			if(Integer.parseInt(day) > daysOfnewMonth || Integer.parseInt(day) <= 0) {
				System.out.println("Wrong day");
			}else this.day = convertDayString(Integer.parseInt(day));
		}else {
			this.day = convertDayString(Integer.parseInt(day));
		}
	}
	
	public int getMonth() {
		return convertMonthToInteger(this.month);
	}
	
	public void setMonth(String month) {

		if(convertMonthToInteger(month) < 1 || convertMonthToInteger(month) > 12) {
			System.out.println("Wrong Month");
		}else{
			// Check valid month considered by this.day
			int newMonth;
			newMonth = convertMonthToInteger(month);
			YearMonth yearMonthObject = YearMonth.of(Integer.parseInt(this.year), newMonth);
			int daysOfnewMonth = yearMonthObject.lengthOfMonth();
			if(convertDayInteger(this.day) > daysOfnewMonth ) {
				System.out.println("Wrong month");
			}else this.month = month;
		}
	}
	
	public int getYear() {
		return Integer.parseInt(this.year);
	}
	public void setYear(String year) {
		int yearInteger = Integer.parseInt(year);
		System.out.println(this.day + " " + this.month + " " + this.year);
		if (!(((yearInteger % 4 == 0) && (yearInteger % 100!= 0)) || (yearInteger%400 == 0))) {
			
			if(convertMonthToInteger(this.month) == 2) {
				if(convertDayInteger(this.day) == 29) {
					System.out.println("Wrong year");
				}
			}
		}
	}
	
	
}