package task;
/*
import java.util.*;
public class BubbleSortDemo {
	public static void main(String[] args) {
		
	//int arr[]=new int[5];
	int temp;
	int[] arr={4,7,9,2,6};
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}	
		}
	}
	for(int a=0;a<arr.length;a++) {
		System.out.println(arr[a]);
	}
}
}*/

import java.util.*;
public class BubbleSortDemo {
    public static void main(String[] args) {
        int temp;
        int[] arr = {4, 7, 9, 2, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
