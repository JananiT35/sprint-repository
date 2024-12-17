package assignedexample;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	int one=0,two=0,three=0;
	Digit d=new Digit();
	System.out.println("Enter the elements");
	for(int i=0;i<5;i++)
	{
		arr[i]=sc.nextInt();
		if(arr[i]>=0 && arr[i]<10) {
			one++;
		}
		else if(arr[i]>=10 && arr[i]<100) {
			two++;
		}
		else if(arr[i]>=100 && arr[i]<1000) {
			three++;
		}
		else {
			System.out.println("more than three digit");
		}
	}
	System.out.println("COUNT OF ONE DIGIT NUMBERS:  "+one);
	System.out.println("COUNT OF TWO DIGIT NUMBERS:  "+two);
	System.out.println("COUNT OF THREE DIGIT NUMBERS:  "+three);
	

	
	
	

}
	}

