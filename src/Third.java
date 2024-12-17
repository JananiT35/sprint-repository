package task;

import java.util.Scanner;

public class Third {
	public class ThirdLargest {
	    public static void main(String[] args) {
	        int[] array = new int[5];
	        Scanner sc=new Scanner(System.in);
	        // Initialize three variables to hold the largest, second largest, and third largest numbers
	        int first = 0, second = 0, third = 0, num;
System.out.println("Enter 5 marks");
			
			for(int i=0;i<5;i++)

	        // Traverse the array to find the three largest numbers
	        {
				array[i]=sc.nextInt();
	            num=array[i];
				if (num > first) {
	                third = second;
	                second = first;
	                first = num;
	            } else if (num > second && num != first) {
	                third = second;
	                second = num;
	            } else if (num > third && num != second && num != first) {
	                third = num;
	            }
	        }

	        // Check if the third largest number exists
	        if (third == 0) {
	            System.out.println("The array does not have a third largest number.");
	        } else {
	            System.out.println("The 3rd largest number is: " + third);
	        }
	    }
	}


}
