import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//key and a value
//no guarantee for order
//not synchronized
//permits null values
public class HashMapEx {
	public static void main(String args[])
	{
		HashMap<Integer, String> hmap = new HashMap<>();
		
		hmap.put(12,"Chey");
		hmap.put(2, "Rahul");
		hmap.put(49, "Ajeet");
		hmap.put(100, "Kapur");
		hmap.put(30, "Little");
		
		
		System.out.println("------USING SET TO PRINT HASHMAP-------------------");

		Set set = hmap.entrySet();
		System.out.println("Printing out set: " + set);
		
		Iterator iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("Key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());
		}
		System.out.println();
		
		System.out.println("------value at index-------------------");
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);
		System.out.println();
		
		System.out.println("------after removal-------------------");

		hmap.remove(30);
		System.out.println("Map key and values after removal: ");
		
		set = hmap.entrySet();
		iterator = set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("Key is: " + mentry.getKey() + " & Value is: " + mentry.getValue());
		}
		System.out.println();
		System.out.println("------USING MAP TO PRINT HASHMAP-------------------");
		Map<String,String> map = new HashMap<>();
		
		map.put("12","Chey");
		map.put("2", "Rahul");
		map.put("49", "Ajeet");
		map.put("100", "Kapur");
		map.put("30", "Little");
		
		map.forEach((key,value) -> System.out.println("[Key]: " + key + " [Value]: " + value));
		
		
	}
}
