import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTwo {

	private String tenthDay;
	private String eighteenthDay;
	private String fifteenthDay;
	
	public void daysOfCurrentMonth() {
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
		
	    Date d1 = new Date();
		d1.setDate(10);
	    tenthDay = simpleDateFormat.format(d1).toUpperCase();
	    
		Date d2 = new Date();
		d2.setDate(18);
		eighteenthDay = simpleDateFormat.format(d2).toUpperCase();

		System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthDay);
	}

	public void daysOfAnyMonth(int month, int year) {
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
	    
		Date date = new Date();
		date.setMonth(month);
		date.setYear(year);
		date.setDate(15);
	    fifteenthDay = simpleDateFormat.format(date).toUpperCase();
		
		System.out.println("For the year (" + year + ") and month (" + month + "), the fifteenth day is " + fifteenthDay + " and the last day is");
		//For the year (2019) and month (10), the fifteenth day is TUESDAY and the last day is THURSDAY
	}

	public void compareYear() {
		
		
	}

	public void dateHashMap() {
		
		
	}

	public void dateHashMapSorted() {
		
		
	}

}
