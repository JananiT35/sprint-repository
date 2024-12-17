package assigned;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Map;
/*public class MapDemo {
	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();
	        // Put elements
	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 3);
	        System.out.println("HashMap: " + map);
	        // Get an element
	        System.out.println("Get 'A': " + map.get("A"));
	        // Remove an element
	        map.remove("B");
	        System.out.println("After removal: " + map);
	        // Iterate through the map
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	        // Clear the map
	        map.clear();
	        System.out.println("After clear: " + map);
	    }
	}*/
/*public class MapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        // Put elements
        map.put("C", 3);
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("TreeMap: " + map);
        // Get an element
        System.out.println("Get 'A': " + map.get("A"));
        // Remove an element
        map.remove("B");
        System.out.println("After removal: " + map);
        // Iterate through the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Clear the map
        map.clear();
        System.out.println("After clear: " + map);
    }
}*/
public class MapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // Put elements
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("LinkedHashMap: " + map);
        // Get an element
        System.out.println("Get 'A': " + map.get("A"));
        // Remove an element
        map.remove("B");
        System.out.println("After removal: " + map);
        // Iterate through the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Clear the map
        map.clear();
        System.out.println("After clear: " + map);
    }
}




