import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;


public class DateTimeTwo {

	private String tenthDay;
	private String eighteenthDay;
	private String fifteenthDay;
	private String lastDay;
	
	private HashMap<LocalDate, Integer> map = new HashMap<LocalDate, Integer>();
	
	public void daysOfCurrentMonth() {
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
	    
	    Calendar date = Calendar.getInstance();
	    date.set(Calendar.DAY_OF_MONTH, 10);
	    Calendar date1 = Calendar.getInstance();
	    date1.set(Calendar.DAY_OF_MONTH, 18);

	    tenthDay = simpleDateFormat.format(date.getTime()).toUpperCase();

		eighteenthDay = simpleDateFormat.format(date1.getTime()).toUpperCase();

		System.out.println("The tenth day of this month is " + tenthDay + " and eighteenth is " + eighteenthDay);
	}

	public void daysOfAnyMonth(int month, int year) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE, yyyy, MM, dd");
	    Calendar date = Calendar.getInstance();

	    date.set(Calendar.MONTH, month-1);
	    date.set(Calendar.YEAR, year);

	    date.set(Calendar.DAY_OF_MONTH, 15);

	    fifteenthDay = simpleDateFormat.format(date.getTime()).toUpperCase();
	    
	    int end = date.getActualMaximum(Calendar.DAY_OF_MONTH);
	    date.set(Calendar.DAY_OF_MONTH, end);

	    lastDay = simpleDateFormat.format(date.getTime()).toUpperCase();
		
		System.out.println("For the year (" + year + ") and month (" + month + "), the fifteenth day is " + fifteenthDay + " and the last day is " + lastDay);

	}

	public void compareYear() throws IOException {
		String filename = "Dates.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));


		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd:HH");
    	String lineOfData = br.readLine();
		//convert String to LocalDate
		LocalDate localDate = LocalDate.parse(lineOfData, formatter);
		
    	int value = 1;
		while (lineOfData!=null)
    	{

			map.put(localDate, value);
			value++;
			// Get the next line of the file
			lineOfData = br.readLine();
    	}
		
		br.close();
		
	}

	public void dateHashMap() {
		
		
	}

	public void dateHashMapSorted() {
		
		
	}

}
