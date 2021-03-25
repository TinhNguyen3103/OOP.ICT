package DateTesting;



public class DateUtils {
	/**
	 * The method return 1 if date1 > date2 else if date1 == date 2 return 0 else return -1 date1 < date2
	  */
	public int compareDate(MyDate date1,MyDate date2) {
		if(date1.getYear() == date2.getYear()) {
			if(date1.getMonth() == date2.getMonth()) {
				if(date1.getDay() == date2.getDay()) {
					return 0;
				}else {
					if(date1.getDay() > date2.getDay()) return 1;
					else return -1;
				}
			}else {
				if(date1.getMonth() > date2.getMonth()) return 1;
				else return -1;
				
			}
		}else {
			if(date1.getYear() > date2.getYear()) return 1;
			else return -1;
				
			
		}
	}
	
	public void sortDate(MyDate... dateList) {
		for(int i = 0 ; i < dateList.length ; i++) {
			for(int j = i ; j < dateList.length; j++) {
				if(compareDate(dateList[j], dateList[i]) == -1) {
					MyDate tempDate = new MyDate();
					tempDate = dateList[i];
					dateList[i] = dateList[j];
					dateList[j] = tempDate;
				}
			}
		}
		for(MyDate date : dateList) {
			date.print();
		}
	}
	
}
