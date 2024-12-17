package assignedexample;

import java.util.LinkedList;
import java.util.function.IntPredicate;
/*
public class Demo3 { 
		public static void main(String[] args) {
			LinkedList<Integer> lt= new LinkedList<>();
			lt.add(29);
			lt.add(10);
			lt.add(2024);
			//BiConsumer<LinkedList<Integer>, String> bicon1= BiconInter::showDetails;
		//	bicon1.accept(lt, "day");
			//bicon1.accept(lt, "month");
			//bicon1.accept(lt, "year");
			IntPredicate isDay = (value) -> value < 32; // Example condition for days
	        IntPredicate isMonth = (value) -> value > 0 && value < 13; // Example condition for months
	        IntPredicate isYear = (value) -> value > 999; // Example condition for years

	      System.out.println(isDay);
		}
		static void showDetails(LinkedList<Integer> lt, IntPredicate predicate) {
	        for (Integer value : lt) {
	            if (predicate.test(value)) {
	                System.out.println("Value: " + value);
	            }
	        }
	    }
	}*/
public class Demo3 { 
    public static void main(String[] args) {
        LinkedList<Integer> lt = new LinkedList<>();
        lt.add(29);
        lt.add(10);
        lt.add(2024);

        IntPredicate isDay = (value) -> value < 50; 
        IntPredicate isMonth = (value) -> value > 0 && value < 13; 
        IntPredicate isYear = (value) -> value > 999; 

        System.out.println("Day records:");
        showDetails(lt, isDay);

        System.out.println("Month records:");
       showDetails(lt, isMonth);

        System.out.println("Year records:");
        showDetails(lt, isYear);
    }

    static void showDetails(LinkedList<Integer> lt, IntPredicate predicate) {
        for (Integer value : lt) {
            if (predicate.test(value)) {
                System.out.println("Value tested: " + value);
            }
        }
    }
}
/*
	class BiconInter
	{
		static void showDetails(LinkedList<Integer> lt, int name)
		{
			//System.out.println("---------------"+name+"records----------");
			lt.forEach((price)->{System.out.println("date:"+price);});
		}
}
	*/
