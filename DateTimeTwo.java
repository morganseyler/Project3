import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class DateTimeTwo {

	private String tenthDay;
	private String eighteenthDay;
	private String fifteenthDay;
	private String lastDay;
	
	public void daysOfCurrentMonth() {
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
		
	    Date d1 = new Date();
//	    Calendar calendar = new GregorianCalendar();
//	    calendar.get(Calendar.DAY_OF_MONTH);
	    
	    
		d1.setDate(10);
	    tenthDay = simpleDateFormat.format(d1).toUpperCase();
	    
		Date d2 = new Date();
		d2.setDate(18);
		eighteenthDay = simpleDateFormat.format(d2).toUpperCase();

		System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthDay);
	}

	public void daysOfAnyMonth(int month, int year) {
		DateFormat simpleDateFormat = new SimpleDateFormat("EEEE");

		System.out.println("For the year (" + year + ") and month (" + month + "), the fifteenth day is " + fifteenthDay + " and the last day is " + lastDay);

	}

	public void compareYear() {
		
		
	}

	public void dateHashMap() {
		
		
	}

	public void dateHashMapSorted() {
		
		
	}

}
