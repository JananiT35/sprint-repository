package assignedexample;

import java.util.Scanner;

public class LinearSearchDemo {
 public static void main(String[] args)
 {
	 int count=0;
	 int arr[]=new int[5];
	 arr[0]=3;
	 arr[1]=4;
	 arr[2]=5;
	 arr[3]=6;
	 arr[4]=7;
	 
	Scanner s=new Scanner(System.in);
	System.out.println("enter the element");
	int n=s.nextInt();
	for(int i=0;i<5;i++) {
		if(arr[i]==n) {
			count+=1;
			System.out.println("Element found"+"\nPosition of element= "+i);
			break;
		}
	
		/*if(arr[i]!=n){
			System.out.println("Element not found");
			break;
		}*/
	}
	if(count==0) {
		System.out.println("Element not found");
	} 
 }
}
