import java.util.Enumeration;
import java.util.Hashtable;


public class HashTableEx {

	public static void main(String[] args) {
		
		Enumeration names;
		String key;
		//key, value
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		
		//putting key and value into hashtable
		hashtable.put("Key1", "Chey");
		hashtable.put("Key2", "Peter");
		hashtable.put("Key3", "Ricky");
		
		//putting the keys into enumeration type defined above
		names = hashtable.keys();
		
		//loop through the enumeration type and print out each key and value.
		while(names.hasMoreElements())
		{
			key = (String) names.nextElement();
			System.out.println("Key: " + key + " & Value: " + hashtable.get(key));
		}

	}

}
