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
	    
	    
	    System.out.println("\nTime at other zones:");
	    /**
		 * We have got time for our server but we have some major time zone in the world.
		 * GMT is considered as zero degree (Greenwich Mean Time) which is GMT + 0 = GMT
		 * BST is 90 degree East (Bangladesh Standard Time) which is 6 hours ahead of GMT, and
		 * CST is 90 degree West (Central Standard Time) which is 5 hours behind of GMT during 
		 * daylight saving. Otherwise, it is 6 hours.
		 * We are not considering 0 or 180 degree.
		 * 
		 * Now, we will print the time for these four in a different way. Again, time should be
		 * the current time; in your case, time of the server. Determine the format from the output given.
		 * The output is here (pls look at the text sample, if needed).
			Time on Server: 15:14
			GMT: 20:14
			BST (90E): 2:14
			CST (90W): 15:14
		 */
	    dateTimeOne.dateTimeOfOtherCity();
	    System.out.println("\nDate/time at other zones:");
	    //dateTimeOne.dateTimeNow();
	    
	    /**
		 * Now, you are familiar with different time zone.		 * 
		 * Generate the following output. You should store the values in a Hashmap also. 
		 * GMT, BST etc. will as key and time/date as value.
		 * For this time, your Hashmap key and value should be String like HashMap<String, String> 
			GMT: 10/08/2019 20:26
			BST: 10/09/2019 02:26
			CST: 10/08/2019 15:26
		 */
	    dateTimeOne.dateTimeDifferentZone();
	    System.out.println("\n");	    

	    /**
		 * Now add two more time zone like this: (These two may not be real time zone)
		 * "ZST", "11/05/2018 19:59" and "AST", "10/01/2020 19:59".
		 * For the details for these section See PDF section: Section 1 Extension, and come back here.
		 * 
		 * Output of the following method will be like (for grading you have to print only the following three style)
		 * exactly as below:
		 * 
			Print Style 1:
			AST 10/01/2020 19:59
			BST 10/09/2019 02:48
			CST 10/08/2019 15:48
			GMT 10/08/2019 20:48
			ZST 11/05/2018 19:59
			Print Style 3:
			10/01/2020 19:59
			10/08/2019 15:48
			10/08/2019 20:48
			10/09/2019 02:48
			11/05/2018 19:59
			Print Style 5: Final sorted Array:
			2020-10-01T19:59
			2019-10-09T02:48
			2019-10-08T20:48
			2019-10-08T15:48
			2018-11-05T19:59 
		 * 
		 * Look at the three style (1, 3, 5). They are giving you different types of sorted list that are confusing.
		 * We need to solve it; however, this section is complete, now we will move to the next section.
		 */
	    dateTimeOne.timeZoneHashMap();
	    
	    System.out.println("\n");
	  //  DateTimeTwo dateTimeTwo = new DateTimeTwo();

	}
}