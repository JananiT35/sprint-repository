package assignedexample;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class CollectionExample {
	
 public static void main(String[] args) {
	        Collection<Object> collection = new ArrayList<>();
	        collection.add("Good");
	        collection.add(55);
	        collection.add('A');
	        /*System.out.println("Before remove: " + collection);
	        collection.remove(55);
	        System.out.println("Contains 'XYZ': " + collection.contains("XYZ"));
	        System.out.println("After remove: " + collection);*/

	        // Using addAll method
	        Collection<Object> moreItems = new ArrayList<>();
	        moreItems.add("ABC");
	        moreItems.add(67.89);
	        moreItems.add(24);
	        collection.addAll(moreItems);
	        System.out.println("After addAll: " + collection);

	        // Using containsAll method
	        Collection<Object> checkItems = new ArrayList<>();
	        checkItems.add("XYZ");
	        checkItems.add(42);
	        boolean containsAll = collection.containsAll(checkItems);
	        System.out.println("Contains all 'A' or 42: " + containsAll);

	        // Using retainAll method
	        Collection<Object> retainItems = new ArrayList<>();
	        retainItems.add("XYZ");
	        retainItems.add(24);
	        collection.retainAll(retainItems);
	        System.out.println("After retainAll: " + collection);
	    
	}
}

