package assigned;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iterator {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");

	        // Obtain a ListIterator
	        ListIterator<String> iterator = list.listIterator();

	        // Traverse the list and modify elements
	        while (iterator.hasNext()) {
	            String fruit = iterator.next();
	            int index = iterator.nextIndex();
	            System.out.println("Current element: " + fruit + ", Next index: " + index);

	            if (fruit.equals("Banana")) {
	                iterator.set("Blueberry"); // Replace "Banana" with "Blueberry"
	            }
	        }

	        // Add a new element at the current position
	        iterator.add("Date");

	        // Display the modified list
	        System.out.println("Modified list: " + list);
	    }
}
	


