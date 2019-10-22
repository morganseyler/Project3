import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
   int getValueOfSecond()
   {
	   //change value to intended getValueOfSecond
	   Date date1 = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("ss");
	   String strDate = formatter.format(date1);
	   int value = Integer.parseInt(strDate);
	   System.out.println("The value of Second now: " + value);
	   return value;
   }
   
   void dateTimeNow()
   {
	   Date date1 = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
	   String strDate = formatter.format(date1);
	   System.out.println("Current Date/Time: " + strDate);
	   
   }
   
   void sleepForFiveSec()
   {
	   try {
		TimeUnit.SECONDS.sleep(5);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
   }
   
   void dateTimeOfOtherCity()
   {
	   //Time on Server
	   Date date1 = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
	   String strTime = formatter.format(date1);
	   System.out.println("Time on Server: " + strTime);
	   
	   //Time at GMT
	   formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
	   System.out.println("GMT: " + formatter.format(new Date()));
	   
	   //Time at BST
	   formatter.setTimeZone(TimeZone.getTimeZone("GMT+6"));
	   System.out.println("BST (90E): " + formatter.format(new Date()));
	  
	   //Time at CST
	   formatter.setTimeZone(TimeZone.getTimeZone("GMT-5"));
	   System.out.println("CST (90W): " + formatter.format(new Date()));
   }
   
   void dateTimeDifferentZone()
   {
	   
   }
   
   void timeZoneHashMap()
   {
	   
   }
}