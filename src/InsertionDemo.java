package task;

import java.util.Arrays;

public class InsertionDemo {
public static void main(String[] args) {
	//int arr[]=new int[6];
	
	int arr[]= {10,7,99,55,34,82};
	 for (int i = 1; i < arr.length-1; i++) {
         int key = arr[i];
         int j = i - 1;

         // Move elements of arr[0..i-1], that are greater than key,
         // to one position ahead of their current position
         while (j >= 0 && arr[j] > key) {
             arr[j + 1] = arr[j];
             j = j - 1;
         }
         arr[j + 1] = key;

         // Print the array after each insertion
         System.out.println("Array " + ": " + Arrays.toString(arr));
     }
	 System.out.println("Sorted array:");
     System.out.println(Arrays.toString(arr));
}
}
