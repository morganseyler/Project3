/**
 * @author Mohammad Mukhtaruzzaman
 * @version 2019-10-08
*/
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		/**
		 * This project has been divided in sections. 
		 * Keep in mind, the code given here all are related. Section has been created to give you 
		 * a break from a continuous long discussion.
		 * When we want any output from a method, we have given the intended output 
		 * immediately above the line of code.
		 * Looking at the sample text output will give you a better idea about output. 
		 */
		int sectionCount = 0;		
		int allowedValueForSecond = 55;
		DateTimeOne dateTimeOne = new DateTimeOne();
		/**
		 * Since in this project we will work with date and time, therefore, at first we want to ensure
		 * that you will not get caught by Zylab with a wrong result, if you submit at the end of any 
		 * minute. To ensure this, you have to measure the "Second" value of the current time.
		 * If 'Second' is greater than 55, you have to sleep your program for 5 seconds. 
		 */				
		
		/**
		 * Section 1
		 * Current value of “Second” will be stored in vlaueOfSecondNow 
		 * and will print as, "The value of Second now: 58"
		 * Remember, this is the format only, value should be the current time.
		 */
		int vlaueOfSecondNow = dateTimeOne.getValueOfSecond();
		/**
		 * If vlaueOfSecondNow>55, program will sleep for 5 seconds.
		 */		
		
		if(vlaueOfSecondNow > allowedValueForSecond)
		{
			dateTimeOne.sleepForFiveSec();
		}
		
		/**
		 * Print the present date/time as:"Current Date/Time: 10/08/2019 03:03 PM"
		 * You have to identify the format from this given output and will code accordingly.
		 * Here is a clue, month/day/year hour:minute am/pm 
		 */
		
	    dateTimeOne.dateTimeNow();	    
	    //System.out.println("Time in the major Time Zone: ");	    
	    

	}
}