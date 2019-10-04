import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


//red black tree implementation
//sorted according to the natural ordering of its key

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(1,  "Data1");
		treeMap.put(2,  "Data2");
		treeMap.put(3,  "Data3");
		treeMap.put(4,  "Data4");
		treeMap.put(5,  "Data5");
		
		Set set = treeMap.entrySet();
		Iterator iterator  = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("Key is " + mentry.getKey() + " & Value is " + mentry.getValue());
		}

	}

}
