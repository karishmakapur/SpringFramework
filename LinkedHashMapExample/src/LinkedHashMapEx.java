import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//ordered

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();
		
		lhmap.put(22, "Abey");
		lhmap.put(33, "Dawn");
		lhmap.put(1, "Sherry");
		lhmap.put(2, "Karon");
		lhmap.put(100, "Jim");
		

		Set set = lhmap.entrySet();
		
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println("Key is "  + me.getKey() + " & Value is: " + me.getValue());
		}
	}

}
