import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{

	HashMap<String, Integer> asciiVal = new HashMap<String, Integer>();
	
	public MesoLexicographical(HashMap<String, Integer> asciiVal) {
		this.asciiVal = asciiVal;
		
		Map<String, Integer> print = sortedMap(asciiVal);
		Set<Entry<String, Integer>> getEntries = print.entrySet();
        for(Entry<String, Integer> sort : getEntries){
            System.out.println(sort.getKey());
        }

	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		
        TreeMap<String, Integer> sortList = new TreeMap<>(unsorted);

		return sortList;

	}
}