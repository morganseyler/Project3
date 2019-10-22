import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class DateTimeOne extends MesoDateTimeOneAbstract {
	
	//First HashMap with initial TimeZones
	HashMap<String, String> timeZoneMap1 = new HashMap<String, String>();
	
	public int getValueOfSecond() {
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ss");
		String strDate = formatter.format(date1);
		int value = Integer.parseInt(strDate);
		System.out.println("The value of Second now: " + value);
		return value;
	}

	public void dateTimeNow() {
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
		String strDate = formatter.format(date1);
		System.out.println("Current Date/Time: " + strDate);

	}

	public void sleepForFiveSec() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void dateTimeOfOtherCity() {
		// Time on Server
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
		String strTime = formatter.format(date1);
		System.out.println("Time on Server: " + strTime);

		// Time at GMT
		formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("GMT: " + formatter.format(new Date()));

		// Time at BST
		formatter.setTimeZone(TimeZone.getTimeZone("GMT+6"));
		System.out.println("BST (90E): " + formatter.format(new Date()));

		// Time at CST
		formatter.setTimeZone(TimeZone.getTimeZone("GMT-5"));
		System.out.println("CST (90W): " + formatter.format(new Date()));
	}

	public void dateTimeDifferentZone() {

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm ");

		// Time and date at GMT
		formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
		timeZoneMap1.put("GMT", formatter.format(new Date()));
		System.out.println("GMT: " + formatter.format(new Date()));

		// Time and date at BST
		formatter.setTimeZone(TimeZone.getTimeZone("GMT+6"));
		timeZoneMap1.put("BST", formatter.format(new Date()));
		System.out.println("BST: " + formatter.format(new Date()));

		// Time and date at CST
		formatter.setTimeZone(TimeZone.getTimeZone("GMT-5"));
		timeZoneMap1.put("CST", formatter.format(new Date()));
		System.out.println("CST: " + formatter.format(new Date()));
		
		//Add 2 additional timeZones to timeZoneMap
		
		// Time and date at ZST
		formatter.setTimeZone(TimeZone.getTimeZone("GMT-10"));
		timeZoneMap1.put("ZST", formatter.format(new Date()));
		
		// Time and date at AST
		formatter.setTimeZone(TimeZone.getTimeZone("GMT+8"));
		timeZoneMap1.put("AST", formatter.format(new Date()));
	}

	public void timeZoneHashMap() {
		System.out.println(timeZoneMap1);
		//Sorted Style 1
		System.out.println("Print Style 1:");
		
		//Sorted Style 2
		System.out.println("Print Style 2:");
		
		//Sorted Style 3
		System.out.println("Print Style 3:");
		
	}
}