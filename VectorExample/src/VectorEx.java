import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String args[])
	{
		Vector<String> strVec = new Vector<>();
		
		//adding elements.
			//joins the elements together with pointers
		strVec.add("Karishma");
		strVec.addElement("Kapur");
		strVec.add("is");
		strVec.addElement("smart.");
		System.out.println("Printing vector with iterator: ");
		Iterator<String> it = strVec.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		
		//add an element to a specific position
		strVec.add(4, "super");
		System.out.println("Printing with stream after adding an element to specific pos: ");
		strVec.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//remove an element at position
		strVec.remove(3);
		System.out.println("Printing vector after removing at specific pos: ");
		strVec.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//remove object
		strVec.remove("Kapur");
		System.out.println("Printing vector after removing at specific obj: ");
		strVec.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//create array list and add elements from array list to linked list
		Vector<String> vecCopy = new Vector<>();
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("String 1");
		arrayList.add("String 2");
		vecCopy.addAll(arrayList);
		System.out.println("Printing copy vector: ");
		vecCopy.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//add a specific element from arrayList to llistCopy
		arrayList.add("String 3");
		arrayList.add("String 4");
		vecCopy.addAll(1, arrayList);
		System.out.println("Printing copy vector after adding specific element from arrayList: ");
		vecCopy.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//create a clone
		Vector str = (Vector)vecCopy.clone();
		System.out.println("Printing cloned vector: ");
		str.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
	}
}
