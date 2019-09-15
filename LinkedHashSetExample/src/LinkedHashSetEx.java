import java.util.LinkedHashSet;

//used to maintain order
public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();

		lhset.add("Z");
		lhset.add("PQ");
		lhset.add("IO");
		
		lhset.add("Z");
		
		System.out.println(lhset);
	}

}
