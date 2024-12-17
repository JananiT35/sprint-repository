
public class Checking {
	import java.util.*;


	    public static void main(String[] args) {
	        int even = 0, odd = 0, prime = 0, armstrong = 0, palindrome = 0;
	        Scanner s = new Scanner(System.in);
	        int arr[] = new int[5];
	        System.out.println("Enter the elements:");
	        
	        for (int i = 0; i < 5; i++) {
	            arr[i] = s.nextInt();
	            
	            // Check even or odd
	            if (arr[i] % 2 == 0) {
	                even++;
	            } else {
	                odd++;
	            }
	            
	            // Check prime
	            if (isPrime(arr[i])) {
	                prime++;
	            }
	            
	            // Check palindrome
	            if (isPalindrome(arr[i])) {
	                palindrome++;
	            }
	            
	            // Check Armstrong number
	            if (isArmstrong(arr[i])) {
	                armstrong++;
	            }
	        }
	        
	        System.out.println("TOTAL EVEN NUMBERS: " + even);
	        System.out.println("TOTAL ODD NUMBERS: " + odd);
	        System.out.println("TOTAL PRIME NUMBERS: " + prime);
	        System.out.println("TOTAL PALINDROME NUMBERS: " + palindrome);
	        System.out.println("TOTAL ARMSTRONG NUMBERS: " + armstrong);
	    }
	    
	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	    
	    public  Checking(int num) {
	        int original = num, reversed = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }
	        return;
	    }
	    
	    public static Checking1(int num) {
	        int original = num, sum = 0;
	        int numberOfDigits = String.valueOf(num).length();
	        while (num != 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            num /= 10;
	        }
	        return sum == original;
	    
	}



