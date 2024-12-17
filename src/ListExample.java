package assignedexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {
		
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Fruits List: " + fruits);

        fruits.remove("Date");
        System.out.println("After removing 'Date': " + fruits);
        
        Collections.sort(fruits);
        System.out.println("Sorted Fruits List: " + fruits);

 
        List<String> sublist = fruits.subList(1, 3);
        System.out.println("Sublist (from index 1 to 3): " + sublist);

        fruits.clear();
        System.out.println("After clearing the list: " + fruits);

        Iterator<String> iterator = fruits.iterator();

        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
