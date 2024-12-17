package assigned;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
/*public class Demo {
	    public static void main(String[] args) {
	        HashSet<String> set = new HashSet<>();
	        // Add elements
	        set.add("A");
	        set.add("B");
	        set.add("C");
	        System.out.println("HashSet: " + set);
	        // Check if an element exists
	        System.out.println("Contains 'A': " + set.contains("A"));
	        // Remove an element
	        set.remove("B");
	        System.out.println("After removal: " + set);
	        // Iterate through the set
	        for (String element : set) {
	            System.out.println("Element: " + element);
	        }
	        // Clear the set
	        set.clear();
	        System.out.println("After clear: " + set);
	    }
	}
/*public class Demo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        // Add elements
        set.add("A");
        set.add("C");
        set.add("B");
        System.out.println("TreeSet: " + set);
        // Check if an element exists
        System.out.println("Contains 'A': " + set.contains("A"));

        // Remove an element
        set.remove("B");
        System.out.println("After removal: " + set);
        // Iterate through the set
        for (String element : set) {
            System.out.println("Element: " + element);
        }
        // Clear the set
        set.clear();
        System.out.println("After clear: " + set);
    }
}
*/

public class Demo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println("LinkedHashSet: " + set);

        // Check if an element exists
        System.out.println("Contains 'A': " + set.contains("A"));

        // Remove an element
        set.remove("B");
        System.out.println("After removal: " + set);

        // Iterate through the set
        for (String element : set) {
            System.out.println("Element: " + element);
        }

        // Clear the set
        set.clear();
        System.out.println("After clear: " + set);
    }
}



