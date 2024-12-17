package task;

public class QuicksortDemo {
	    public static void main(String[] args) {
	        int[] arr = {8,35,12,39,66,50};
	        int n = arr.length;

	        System.out.println("Original array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        int[] stack = new int[n];
	        int index = 0;

	        stack[index++] = 0;
	        stack[index++] = n - 1;

	        while (index > 0) {
	            int high = stack[--index];
	            int low = stack[--index];

	            int pivot = arr[high];
	            int i = low - 1;

	            for (int j = low; j < high; j++) {
	                if (arr[j] <= pivot) {
	                    i++;
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }

	            int temp = arr[i + 1];
	            arr[i + 1] = arr[high];
	            arr[high] = temp;

	            int pi = i + 1;

	            if (pi - 1 > low) {
	                stack[index++] = low;
	                stack[index++] = pi - 1;
	            }

	            if (pi + 1 < high) {
	                stack[index++] = pi + 1;
	                stack[index++] = high;
	            }
	        }

	        System.out.println("\nSorted array:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


