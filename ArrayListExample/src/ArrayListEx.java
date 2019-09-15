import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// ArrayList can shrink and grow
//elements are added to the end unless they are specified with a specific position.
public class ArrayListEx {

		public static void main(String args[])
		{
			//create ArrayList
			List<String> alist = new ArrayList<String>();
			alist.add("Steve");
			alist.add("Tim");
			alist.add("Lucy");
			System.out.print("After creating alist and adding elements: ");
			alist.stream().forEach(e -> System.out.print(e + " "));
			
			System.out.println();
			
			//add element at certain position
			alist.add(2, "Steve");
			System.out.print("After adding an element at a specific position: ");
			alist.stream().forEach(e -> System.out.print(e + " "));
			System.out.println();
			
			//remove element
			alist.remove(2);
			System.out.print("After removing an element at a certain position: ");
			alist.stream().forEach(e -> System.out.print(e + " "));
			System.out.println();
			
			alist.remove("Lucy");
			System.out.print("After removing a specific element: ");
			System.out.println(alist);
			
			//add more elements
			alist.add("Pat");
			alist.add("Lucy");
			alist.add("Pat");
			alist.add("Lucy");
			System.out.print("After adding elements: ");
			alist.stream().forEach(e -> System.out.print(e + " "));
			System.out.println();
			
			//create a new list and add elements to it
			List<String> removeList = new ArrayList<>();
			removeList.add("Pat");
			removeList.add("Lucy");
			removeList.add("Pat");
			removeList.add("Lucy");
			System.out.print("removeList: ");
			removeList.stream().forEach(e -> System.out.print(e + " "));
			System.out.println();
			
			//use that list to remove the elements you want to remove
			alist.removeAll(removeList);
			System.out.print("After using removeList to remove certain names: ");
			for(String str:alist)
			{
				System.out.print(str + " ");
			}
			System.out.println();
			
			//set -- update
			alist.set(1, "Karishma");
			System.out.print("After updating an element: ");
			alist.stream().forEach(e -> System.out.print(e + " "));
			System.out.println();
			
			//get position of element
			int pos = alist.indexOf("Karishma");
			System.out.println("Pos of Karishma is " + pos);
			
			//get the object with an index
			String str = alist.get(0);
			System.out.println("Element at pos 0 is " + str);
			
			//size of the ArrayList
			int numOfItems = alist.size();
			System.out.println("Size of alist is " + numOfItems);
			
			//check to see if an array list has a certain object
			System.out.println("Karishma exists? " + alist.contains("Karishma"));
			System.out.println("Tom exists? " + alist.contains("Tom"));
			
			//empty arrayList
			alist.clear();
			System.out.print("Printing elements after clear: ");
			alist.stream().forEach(e -> System.out.print(e + " "));
			
			//suppose you have an array and want to make it an arrayList
			String[] array = {"1", "2", "3", "4", "5"};
			ArrayList<String> newAList = new ArrayList<>(Arrays.asList(array));
			newAList.stream().forEach(e -> System.out.print(e + " "));
			System.out.println();
			
			//you cannot use the same iterator to loop over elements again.
				//you can loop through it once
				//after consumed, you can't iterate over it again
			//iterator on array list
				//hasNext, next, & remove ONLY
			Iterator<String> it = newAList.iterator();
			System.out.print("Using iterator: ");
			while(it.hasNext())
			{
				System.out.print(it.next() + " ");
			}
			System.out.println();
			
			//list iterator on array list
				//can go backwards
				//can go forwards
				//for doubly linked lists
			ListIterator<String> it2 = newAList.listIterator();
			System.out.print("Using list iterator: ");
			while(it2.hasNext())
			{
				System.out.print(it2.next() + " ");
			}
			
		}
}
