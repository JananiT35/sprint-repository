package assignedexample;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo2 {	 
		public static void main(String[] args) {
			/*BiConsumer<String ,Integer> b=(name,price)->System.out.println("fruit:"+name+" price:"+price);
			b.accept("apple", 50);
			b.accept("orange", 30);
			b.accept("mango", 80);
			Consumer<String> con1=(name)->{System.out.println("Name:"+name);};
			con1.accept("janani");
		   Function<String, Integer> f=(name)->{return name.length();};
			System.out.println("Length:"+f.apply("Orange"));
				Predicate<Integer> p= (price)->{return price>40;};
				System.out.println("hashcode of price:"+p.hashCode());*/
			
			    IntUnaryOperator lengthFunction = (length) -> length;
		        System.out.println("Length: " + lengthFunction.applyAsInt("Orange".length()));
		        
		        Supplier<Integer> lengthSupplier = () -> "apple".length();
		        int lengthOfString = lengthSupplier.get();
		        System.out.println("Length: " + lengthFunction.applyAsInt(lengthOfString));
		        
		        
		        IntBinaryOperator max = (p1, p2) -> p1 > p2 ? p1 : p2;
		        int maxResult = max.applyAsInt(50, 100);
		        System.out.println("Max: " + maxResult);
		        
		}	 
}

