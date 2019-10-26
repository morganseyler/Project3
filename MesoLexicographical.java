import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MesoLexicographical extends MesoSortedAbstract
{

	public MesoLexicographical(HashMap<String, Integer> asciiVal) {

        TreeMap<String, Integer> sortList = new TreeMap<>(asciiVal);
        Set<Entry<String, Integer>> getList = sortList.entrySet();
        
        for(Entry<String, Integer> sort : getList){
            System.out.println(sort.getKey());
        }
		
	}

	@Override
	Map<String, Integer> sortedMap(HashMap<String, Integer> unsorted) {
		// TODO Auto-generated method stub
		return null;
	}


}