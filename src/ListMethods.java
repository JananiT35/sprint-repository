package assignedexample;

import java.util.Iterator;
import java.util.LinkedList;

public class ListMethods {
	 public static void main(String[] args) {
	        // Create a LinkedList
	        LinkedList<String> list = new LinkedList<>();

	        // Add elements to the LinkedList
	        list.add("Apple");
	        list.add("orange");
	        list.add("grapes");
	        list.add(1, "mango"); // Add "Blueberry" at index 1
	     // Display the LinkedList
	        System.out.println("LinkedList: " + list);

	        // Check if the list contains "Banana"
	        boolean containsBanana = list.contains("Banana");
	        System.out.println("Contains 'Banana': " + containsBanana);
	        int size = list.size();
	        System.out.println("Size of LinkedList: " + size);

	        // Iterate over the LinkedList in reverse order
	        Iterator<String> descendingIterator = list.descendingIterator();
	        System.out.print("LinkedList in reverse order: ");
	        while (descendingIterator.hasNext()) {
	            System.out.print(descendingIterator.next() + " ");
	        }
	        System.out.println();
	     // Clear the LinkedList
	        list.clear();
	        System.out.println("LinkedList after clear(): " + list);
	    }
	}


