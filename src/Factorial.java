package assignedexample;
import java.util.*;
public class Factorial {
	int a,b=1;
	public void Fact() {
		for(int i=1;i<=a;i++) {
			b*=i;
		}
		System.out.println("Factorial of the given number:  "+ b);
	}
	 public static void main(String[] args) {
	  		Scanner s=new Scanner(System.in);
	  		Factorial w=new Factorial();
	  		System.out.println("Enter the number:");
	  		w.a=s.nextInt();
	  		w.Fact();
	 }

}
