
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		Scanner keyboardName = new Scanner(System.in);
		Scanner keyboardAge = new Scanner(System.in);
		Scanner keyboardWeight = new Scanner(System.in);

		// array to store each object of PetRecord
		PetRecord pets[] = new PetRecord[5];

		String name;
		int age;
		double weight;
		// a loop to ask user 5 times for a name, age, and weight for a dog.
		for (int i = 0; i < 5; i++) {

			System.out.println("Please enter a dog name: ");
			name = keyboardName.nextLine();
			
			System.out.println("Please enter that dog's age: ");
			age = keyboardAge.nextInt();
			
			System.out.println("Please enter that dog's weight: ");
			weight = keyboardWeight.nextDouble();

			// creating the petRecord object
			PetRecord pet = new PetRecord(name, age, weight);
			
			// adding the object to the array
			pets[i] = (pet);

		}
		
		
		//looping through the array to get the name of the smallest, largest, oldest, and youngest pet
		//alongside getting the average weight of all the pets and the average age.
		String nameOfSmallestPet = new String();
		String nameOfLargestPet = new String();
		String nameOfOldestPet = new String();
		String nameOfYoungestPet = new String();
		double smallest = 9999;
		double largest = 0;
		int oldest = 0;
		int youngest = 9999;
		double totalWeight = 0;
		int totalAge = 0;
		
		
		for(int i = 0; i < pets.length; i++) {

			if(pets[i].getWeight() < smallest) {
				smallest = pets[i].getWeight();
				nameOfSmallestPet = pets[i].getName();
			}
			if(pets[i].getWeight() > largest) {
				largest = pets[i].getWeight();
				nameOfLargestPet = pets[i].getName();
				
			}
			if(pets[i].getAge() < youngest) {
				youngest = pets[i].getAge();
				nameOfYoungestPet = pets[i].getName();
			}
			if(pets[i].getAge() > oldest) {
				oldest = pets[i].getAge();
				nameOfOldestPet = pets[i].getName();
			}
			totalWeight += pets[i].getWeight();
			totalAge += pets[i].getAge();
			
		}

		System.out.println("The name of the smallest pet: " + nameOfSmallestPet);
		System.out.println("The name of the largest pet: " + nameOfLargestPet);
		System.out.println("The name of the youngest pet: " + nameOfYoungestPet);
		System.out.println("The name of the oldest pet: " + nameOfOldestPet);
		System.out.println("The average weight of the 5 pets is: " + totalWeight/5);
		System.out.println("The average age of the 5 pets is: " + totalAge/5);

	}
}