package another;
import java.util.*;
public class Day1 {
	 int d;
	public static void main(String[] args) {
		System.out.println("enter the number of days");
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		Month m=Month.April;
		Day1 da=new Day1();
		Modify e=new Modify(d);
		e.show();
		
		switch(d)
		{
		
		case 30:

		System.out.println("  April   "+"  June  "+"  November  "+"  September  ");
		break;

		case 28:

		System.out.println("Febraury");
		break;

		case 31:

		System.out.println("  January  "+"  March  "+"  May  "+"  July  "+"  August  "+"  October  "+"  December  ");
		break;

	   default:
		System.out.println("Invalid");
		break;
		
	}
	
	}
}
class Modify{
	
	private int d;

	Modify(int d){
		this.d=d;
	}
	void show()
	{
		System.out.println(d);
	}
	
}
