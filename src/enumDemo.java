package another;
import java.util.*;
public class enumDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter day");
		String day=sc.next();
			
		System.out.println("Enter year");
		int year=sc.nextInt();
		
		Month m=Month.October;
		
		Example d=new Example( day,year,m);
		d.show();
		
		
 
	}

}
class Example
{
	private String day;
	private int year;
	private Month m;
	
	Example(String day,int year,Month m)
	{
		
		this.day=day;
		this.year=year;
		this.m=m;
	}
	void show()
	{
		System.out.println("day:"+day+"  year:"+year+" month:"+m);
	}
	
	
	
}
	
