package assigned;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	
	 
	public class Collection {
	    private List<Integer> items;
	 
	    public Collection() {
	        this.items = new ArrayList<>();
	    }
	 
	    public void add(int item) {
	        items.add(item);
	    }
	 
	    public void sort() {
	        Collections.sort(items);
	    }
	 
	    @Override
	    public String toString() {
	        return items.toString();
	    }
	 
	    public static void main(String[] args) {
	        Collection myCollection = new Collection();
	        myCollection.add(5);
	        myCollection.add(3);
	        myCollection.add(8);
	        myCollection.sort();
	        System.out.println(myCollection);  // Output: [3, 5, 8]
	    }
	}


