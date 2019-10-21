import java.util.Date;
import java.text.SimpleDateFormat;

public class DateTimeOne extends MesoDateTimeOneAbstract
{
   int getValueOfSecond()
   {
	   //change value to intended getValueOfSecond
	   long value = System.currentTimeMillis();

	   return (int) value;
   }
   
   void dateTimeNow()
   {
	   Date date1 = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm a");
	   String strDate= formatter.format(date1);
	   System.out.println("Current Date/Time: " + strDate);
	   

   }
   
   void sleepForFiveSec()
   {
	   
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