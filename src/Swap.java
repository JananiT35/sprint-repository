package assignedexample;
import java.util.*;
public class Swap {
	int a,b;
	public void number()
	{
		b=a+b;
		a=b-a;
		b=b-a;
		
		System.out.println(" After swapping:  "+"a= "+a+"b= "+b);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Swap w=new Swap();
		System.out.println("Enter the number1:");
		w.a=s.nextInt();
		System.out.println("Enter the number2:");
		w.b=s.nextInt();
		System.out.println("Before swapping: "+"a= "+w.a+"b= "+w.b);
		
	
		
		w.number();
		
	}

}
