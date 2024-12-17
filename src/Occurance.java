package assignedexample;
import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr1[] = new int[5];
        int occur1[] = new int[10]; 
        System.out.println("Enter the elements of array 1:");
        for (int i = 0; i < 5; i++) {
            arr1[i] = s.nextInt();
        }

        // Count the occurrences of each digit
        for (int i = 0; i < 5; i++) {
            int num = arr1[i];
            while (num > 0) {
                int digit = num % 10;
                occur1[digit]++;
                num /= 10;
            }
        }

        // Print the occurrences of each digit
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + ": " + occur1[i] + " times");
        }
    }
}
