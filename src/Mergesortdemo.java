package task;

import java.util.Arrays;

public class Mergesortdemo {
	public static void main(String[] args) {
		int arr[]= {23,55,67,12,92,74,38};
		int n = arr.length;

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        // Temporary array for merging
        int[] temp = new int[n];

        // Iterative merge sort
        for (int currSize = 1; currSize < n; currSize *= 2) {
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);

                // Merge the subarrays
                int i = leftStart, j = mid + 1, k = leftStart;
                while (i <= mid && j <= rightEnd) {
                    if (arr[i] <= arr[j]) {
                        temp[k++] = arr[i++];
                    } else {
                        temp[k++] = arr[j++];
                    }
                }

                // Copy remaining elements of left subarray, if any
                while (i <= mid) {
                    temp[k++] = arr[i++];
                }

                // Copy remaining elements of right subarray, if any
                while (j <= rightEnd) {
                    temp[k++] = arr[j++];
                }

                // Copy the merged subarray back into the original array
                for (i = leftStart; i <= rightEnd; i++) {
                    arr[i] = temp[i];
                }
            }
        }

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

	}




