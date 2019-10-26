import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

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
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
		Calendar date = Calendar.getInstance();

		date.set(Calendar.MONTH, month - 1);
		date.set(Calendar.YEAR, year);

		date.set(Calendar.DAY_OF_MONTH, 15);

		fifteenthDay = simpleDateFormat.format(date.getTime()).toUpperCase();

		int end = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		date.set(Calendar.DAY_OF_MONTH, end);

		lastDay = simpleDateFormat.format(date.getTime()).toUpperCase();

		System.out.println("For the year (" + year + ") and month (" + month + "), the fifteenth day is " + fifteenthDay
				+ " and the last day is " + lastDay);
	}

	public void compareYear() throws IOException {

		String filename = "Dates.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
		String lineOfData = br.readLine();
		
		Calendar date = Calendar.getInstance();
		
		LocalDate now = LocalDate.now();
		
		int value = 1;
		while (lineOfData != null) {
			LocalDate localDate = LocalDate.parse(lineOfData, formatter);
			
			date.set(Calendar.MONTH, 1);
			String sub2 = lineOfData.substring(6, 10);
			int year = Integer.parseInt(sub2);
			date.set(Calendar.YEAR, year);
			int end = date.getActualMaximum(Calendar.DAY_OF_MONTH);
			date.set(Calendar.DAY_OF_MONTH, end);
			date.getTime();
			
			Period p = Period.between(localDate, now); 
			
			int years = p.getYears();	
			int months = p.getMonths();
			int days = p.getDays();
			
			  if (end == 29) {
			  
			  System.out.println(year + " is a leap year, and Difference: " + years +" years, " + months + " months, and " + days + " days."); 
			  } 
			  else 
			  {
			  System.out.println(year + " is not a leap year, and Difference: " + years + " years, " + months + " months, and " + days + " days.");
			  }
			  

			map.put(localDate, value);
			value++;
			// Get the next line of the file
			lineOfData = br.readLine();
		}

		br.close();

	}

	public void dateHashMap() {
		for (LocalDate name : map.keySet()) {
			String key = name.toString();
			String value = map.get(name).toString();
			System.out.println(key + ":" + value);
		}

	}

	public void dateHashMapSorted() {

		Map<LocalDate, Integer> sortedMap = new TreeMap<LocalDate, Integer>(map);
		
		for (LocalDate name : sortedMap.keySet()) {
			String key = name.toString();
			String value = map.get(name).toString();
			System.out.println(key + ":" + value);
		}
	}

}
