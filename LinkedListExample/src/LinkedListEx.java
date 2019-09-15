import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//head has a value and a pointer to next node
//each node has a value and a pointer to the next node
//don't need contiguous memory -- size is not fixed
//inserting into an array or deleting is "expensive" -- linked list is a cheap operation for insert & delete
public class LinkedListEx {

	public static void main(String args[])
	{
		LinkedList<String> sllist = new LinkedList<>();
		
		//adding elements.
			//joins the elements together with pointers
		sllist.add("Karishma");
		sllist.add("Kapur");
		sllist.add("is");
		sllist.add("smart.");
		System.out.println("Printing linked list with iterator: ");
		Iterator<String> it = sllist.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		//add an element to the first position
		sllist.addFirst("Fact: ");
		System.out.println("Printing linked list with stream: ");
		sllist.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//add an element to the last position
		sllist.addLast("You are a hater.");
		System.out.println("Printing linked list with for loop: ");
		for(String str:sllist)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println();
		
		//add an element to a specific position
		sllist.add(4, "super");
		System.out.println("Printing with stream after adding an element to specific pos: ");
		sllist.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//remove an element at front
		sllist.removeFirst();
		System.out.println("Printing linked list after removing from front: ");
		sllist.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//remove an element at back
		sllist.removeLast();
		System.out.println("Printing linked list after removing from last: ");
		sllist.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//remove an element at position
		sllist.remove(3);
		System.out.println("Printing linked list after removing at specific pos: ");
		sllist.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//remove object
		sllist.remove("Kapur");
		System.out.println("Printing linked list after removing at specific obj: ");
		sllist.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//create array list and add elements from array list to linked list
		LinkedList<String> llistCopy = new LinkedList<>();
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("String 1");
		arrayList.add("String 2");
		llistCopy.addAll(arrayList);
		System.out.println("Printing copy linked list: ");
		llistCopy.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//add a specific element from arrayList to llistCopy
		arrayList.add("String 3");
		arrayList.add("String 4");
		llistCopy.addAll(1, arrayList);
		System.out.println("Printing copy linked list after adding specific element from arrayList: ");
		llistCopy.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//create a clone
		LinkedList str = (LinkedList)llistCopy.clone();
		System.out.println("Printing cloned linked list: ");
		str.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		//delete element from clone, see if it effects original
		str.removeLast();
		System.out.println("Printing cloned linked list after deleting last: ");
		str.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
		System.out.println("Printing linked list after deleting last from clone: ");
		llistCopy.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		System.out.println();
		
	}
}
