import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MesoAsciiCal extends MesoAsciiAbstract 
{
	private MesoStation mesoStation;
	private int[] stationArray = new int[3];
	public MesoAsciiCal(MesoStation mesoStation) {
		// TODO Auto-generated constructor stub
		this.mesoStation = mesoStation;
	}
	@Override
	int calAverage() {
		Double sum = 0.0;
		for (int i = 0; i < mesoStation.getStID().length(); i++)
		{
			char character = mesoStation.getStID().charAt(i);
			int ascii = (int) character; 
			sum += ascii;
			
		}
		Double average = sum/4;
		stationArray[0] = (int) (Math.ceil(average));
		stationArray[1] = (int) (Math.floor(average));
		stationArray[2] = (int) (Math.round(average));
		if(Math.round(average) >= average)
		{
			stationArray[2] = (int) (Math.ceil(average));
		}
		else
		{
			stationArray[2] = (int) (Math.floor(average));
		}
		
		return stationArray[2];
	}
	
	
	
}