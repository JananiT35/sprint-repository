package assignedexample;

import java.util.Scanner;

public class Concatinate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        int final1[] = new int[10];

        System.out.println("Enter the elements of array 1:");
        for (int i = 0; i < 5; i++) {
            arr1[i] = s.nextInt();
            final1[i] = arr1[i];
        }

        System.out.println("Enter the elements of array 2:");
        for (int i = 0; i < 5; i++) {  
            arr2[i] = s.nextInt();
            final1[5 + i] = arr2[i];
        }

        System.out.print("Concatenated array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(final1[i] + " ");
        }
    }
}

