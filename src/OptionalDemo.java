package assignedexample;

import java.util.Optional;

public class OptionalDemo {
	public static void main(String[] args) {
		
		String[] names= new String[5];
		names[0]="a";
		names[1]="b";
		names[2]="c";
		names[3]="d";
		names[4]="e";
	System.out.println(names[4].toUpperCase());
		Optional<String> check =Optional.ofNullable(names[2]);
		
	if(check.isEmpty())
		{
			System.out.println("String is empty");
		}
		else
		{
			System.out.println(names[3].toUpperCase());
		}
		if (check.isPresent())
		{
			System.out.println(names[0].charAt(0));
		}
		
		Optional<String> val=Optional.of(names[3]);
	//	Optional<String> em= Optional.empty();
		
		System.out.println(val.get());
		//System.out.println(val.filter(a->a.charAt(0)=='A'));
		
		//System.out.println(val.orElse("value is present"));
		//System.out.println(check.orElse("value is empty"));
			
		//val.ifPresent(System.out::println);
		
 
	}
 
}


