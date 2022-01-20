import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Helper class
 * @author Steven Maggio
 */
public class Helper {
	
	public static void start() throws FileNotFoundException {
		Bag groceryBag=new Bag();
		create(groceryBag);
	}
	
	public static void create(Bag b) throws FileNotFoundException {
		//adding items from file
		System.out.println("Adding items from file");
		File file= new File("C:\\Users\\cptna\\Data Structures\\Project 1\\src\\groceries");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			b.insert(line);
		}
		sc.close();
		display(b);
		
		//removing element at a random index
		System.out.print("\nRemoving random element");
		b.removeRandom();
		display(b);
		
		//removing last element
		System.out.println("\nRemoving last element");
		b.removeLast();
		display(b);
		
		//adding more items
		System.out.println("\nInserting more items");
		b.insert("orange juice");
		b.insert("lemons");
		display(b);
		
		//finding pasta in list
		System.out.println("\nFinding where pasta is in the list");
		display(b);
		System.out.println("In the list above, pasta is found at index: "+b.getItemIndex("Pasta"));
		
		//finding item at index 5
		if(b.size()>=5) {
		System.out.println("\nFinding an item in list");
		display(b);
		System.out.println("The item at index 5 is: "+ b.getItemAtIndex(5));
		}
		
		
		//emptying list
		System.out.println("\nEmptying list");
		b.makeEmpty();
		display(b);
		
	}
	
	
	/**
	 * prints size of list and prints the elements in the bag
	 * @param b
	 */
	public static void display(Bag b) {
		//prints size of the list
		System.out.println("Size of list is: "+b.size());
		System.out.println("Displying Important items in list:");
		//if bag is empty, says that it is empty
		if(b.isEmpty()) System.out.println("<List is empty>");
		//prints elements in the bag
		for(int i=0;i< b.size();i++) {
			System.out.println(b.getItemAtIndex(i));
		}
	}
}
