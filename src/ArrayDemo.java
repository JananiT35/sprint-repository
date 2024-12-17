package another;
import java.util.Scanner;
public class ArrayDemo {
	
		 static int b;
		 static String c;
		public static void main(String[] args) {
			
			//accept from user few values and find the sum
			
			Scanner sc=new Scanner(System.in);
			
			int a[]=new int[5];
			int sum=0;
			
			float avg=0;
			int largest=a[0];
			ArrayDemo d=new ArrayDemo();
			System.out.println("Enter 5 marks");
			
			for(int i=0;i<5;i++)
			{
				a[i]=sc.nextInt();
			}
			for(int i:a) {
				sum+=i;
				if(i>largest) {
					largest=i;
				}
			}
			avg=sum/5;
			System.out.println("sum:"+sum);
			System.out.println("Largest number:"+largest);
			System.out.println("Average:"+avg);
			System.out.println("Enter element to be checked");
			d.b=sc.nextInt();
			for(int i=0;i<5;i++) {
				if(b==a[i]) {
					
					c="yes";
				}	
			}
			if(c=="yes") {
				System.out.println("Element found");
			}
			else {
				System.out.println("Element not found");
			}	 
		}
	 
	}
	 


