import java.util.Date;
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
	   
   }
   
   void dateTimeDifferentZone()
   {
	   
   }
   
   void timeZoneHashMap()
   {
	   
   }
}