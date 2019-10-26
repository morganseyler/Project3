import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map.Entry;

public class DateSortingUsingAlgorithm {
	
	private HashMap<Calendar, Integer> map = new HashMap<Calendar, Integer>();

	public void dateHashMapSortedDescending() throws IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String filename = "SortingDates.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int count = 0;
    	String lineOfData = br.readLine();

		while (lineOfData!=null)
    	{
			String lineWithoutSpaces = lineOfData.replaceAll("\\s+","");

			
			Calendar cal = new GregorianCalendar();
			try {
				cal.setTime(formatter.parse(lineWithoutSpaces));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			map.put(cal, count);
			count++;
			// Get the next line of the file
			lineOfData = br.readLine();
    	}
		
		Calendar temp;
		Calendar[] names = new GregorianCalendar[map.size()];
		
		int i;
		int j = 0;

		for (Entry<Calendar, Integer> entry : map.entrySet()) {
		    Calendar key = entry.getKey();
		    names[j] = key;
		    j++;
		}
		for(i = 0; i < map.size(); i++)
        {
            for(j = 1; j < map.size(); j++)
            {
                if(names[j-1].compareTo(names[j]) > 0)
                {
                    temp=names[j-1];
                    names[j-1]=names[j];
                    names[j]=temp;       
                }
            }
        }
		//Prints the sorted array in descending order based on date
        for(i = map.size()-1; i >= 0; i--)
        {
            System.out.println(formatter.format(names[i].getTime()));
        }
			
		br.close();
		
	}

	public void dateHashMapSorted() throws IOException {

		String filename = "SortingDates.txt";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int count = 0;
    	String lineOfData = br.readLine();

		while (lineOfData!=null)
    	{
			String lineWithoutSpaces = lineOfData.replaceAll("\\s+","");


			Calendar cal = new GregorianCalendar();
			try {
				cal.setTime(formatter.parse(lineWithoutSpaces));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put(cal, count);
			count++;
			// Get the next line of the file
			lineOfData = br.readLine();
    	}
		
		Calendar temp;
		Calendar[] names = new Calendar[map.size()];
		
		int i;
		int j = 0;

		for (Entry<Calendar, Integer> entry : map.entrySet()) {
		    Calendar key = entry.getKey();
		    names[j] = key;
		    j++;
		}
		
        for (i = 0; i < map.size(); i++) 
        {
            for (j = 1; j < map.size() - i; j++) 
            {
                if (names[j-1].getTimeInMillis() > names[j].getTimeInMillis()) 
                {
                    temp = names[j-1];
                    names[j-1] = names[j];
                    names[j] = temp;
                }
            }
        }

        for (i = 0; i < map.size(); i++) 
        {
            System.out.println(formatter.format(names[i].getTime()));
        }
        
		br.close();
		
	}

}
