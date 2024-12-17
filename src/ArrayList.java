package assignedexample;

import java.util.Arrays;

public class ArrayList {
	    public static void main(String[] args) {
	        // Step 1: Create an array and initialize elements
	        int[] a = {12, 13, 15, 16};
	        int newElement = 14;
	        int insertIndex = 4;
	        System.out.println("Before Insertion: " + Arrays.toString(a));
	        // Step 2: Create a new array with one more element
	        int[] newArray = new int[a.length + 1];
	        // Step 3: Copy elements up to the insertion index
	        for (int i = 0; i < insertIndex; i++) {
	            newArray[i] = a[i];
	        }
	        // Step 4: Insert the new element at the specified index
	        newArray[insertIndex] = newElement;
	        // Step 5: Copy the remaining elements after the insertion index
	        for (int i = insertIndex; i < a.length; i++) {
	            newArray[i + 1] = a[i];
	        }
	        System.out.println("After Insertion: " + Arrays.toString(newArray));
	    }
	}


