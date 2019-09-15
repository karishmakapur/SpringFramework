import java.util.HashSet;

//hashSet is a set
//uses hash function
//unordered

public class HastSetEx {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		
		//add elements to hset
		hset.add("Apple");
		hset.add("Grapes");
		hset.add("Orange");
		
		//add a duplicate entry --> will not add it because this is a set
		hset.add("Apple");
		
		//can add null --> set cannot add null though
		hset.add(null);
		
		//print out set
		System.out.println(hset);

	}

}
