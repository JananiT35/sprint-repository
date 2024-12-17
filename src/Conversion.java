package assignedexample;

public class Conversion {
	    public static void main(String[] args) {
	        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        int[] converted = new int[10];

	        int left = 0;
	        int right = 8;

	        for (int i = 0; i < 9; i++) {
	            if (i % 2 == 0) {
	                converted[i] = original[right--];
	            } else {
	                converted[i] = original[left++];
	            }
	        }

	        
	        System.out.print("Converted array: ");
	        for (int i = 0; i < 9; i++) {
	            System.out.print(converted[i] + " ");
	        }

	    }
	}


