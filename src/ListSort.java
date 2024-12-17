package assigned;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListSort {
public static void main(String[] args) {
		
		//sort Random number in List
	//	Math.random()
		
		List<Integer> l=new ArrayList<>();
		Random r= new Random();
		//random
		for(int i=0;i<10;i++)
		{
			l.add(r.nextInt(1000));
		}
		System.out.println("Before Natural Sort:"+l);
		Collections.sort(l);//natural sort
		
		System.out.println("Natural Sort:"+l);
		//sort(comparator)
		l.sort((a,b)->{return (b-a);});//reverse sort
		System.out.println("reverse sort:"+l);
		
		List<String> animals = new ArrayList<>();
        animals.add("Elephant");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bear");
        animals.add("Zebra");

        System.out.println("Before Natural Sort: " + animals);
        Collections.sort(animals);
        System.out.println("Natural Sort: " + animals);

        // Reverse sort using a comparator
        animals.sort((a, b) -> b.compareTo(a));
        System.out.println("Reverse Sort: " + animals);
    }
	}

