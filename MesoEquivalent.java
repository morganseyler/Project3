import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MesoEquivalent {

	private String stId;
	ArrayList<String> nameArray;
	private HashMap<String, Integer> asciiVal = new HashMap<String, Integer>();
	
	public MesoEquivalent(String stId) {
		this.stId = stId;
	}

	public HashMap<String, Integer> calAsciiEqual() throws IOException {
		
		nameArray = new ArrayList<>();

		//??????
		MesoAsciiCal asciiAverage = new MesoAsciiCal(new MesoStation(stId));
		int asciiAvg = asciiAverage.calAverage();
		//??????
		
		String filename = "Mesonet.txt";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		int count = 0;
    	String lineOfData = br.readLine();

		while (lineOfData!=null)
    	{
    		count++;
    		if(count > 3)
    		{
    			String name = lineOfData.substring(2, 6);
    			MesoAsciiCal asciiAverage2 = new MesoAsciiCal(new MesoStation(name));
    			int asciiAvg2 = asciiAverage2.calAverage();
    			
				nameArray.add(name);
				
				if(asciiAvg == asciiAvg2)
				{
					asciiVal.put(name, asciiAvg);
				}
    		}

			// Get the next line of the file
			lineOfData = br.readLine();
    	}
		
		br.close();

		return asciiVal;
	}

}
