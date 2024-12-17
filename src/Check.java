import java.util.*;
public class Check {
    public static void main(String[] args) {
    	int even=0,odd=0,prime=0,amstrong=0,palindrome=0,count=0,reversed=0;
    	double sum=0;
    	Scanner s=new Scanner(System.in);
    	int arr[]=new int[5];
    	System.out.println("Enter the elements");
    	for(int i=0;i<5;i++) {
    		arr[i]=s.nextInt();
    		if(arr[i]%2==0) {
    			even+=1;
    		}
    		else {
    			odd++;
    		}
    		
    		while(arr[i]>0) {
    			for(int j=1;j<=arr[i];j++) {
    				if(arr[i]==1 ) {
    					break;
    				}
    				if(arr[i]%j==0) {
    					count++;
    				}
    			if(count==2) {
    				prime++;	
    			}
    			}
    		}
    		//palindrome
    	     while (arr[i]!= 0) {
    	            int digit = arr[i] % 10;
    	            reversed = reversed * 10 + digit;
    	            arr[i]/= 10;
    	        }
    	     if(reversed==arr[i]) {
    	    	 palindrome++;
    	     }
    	     //amstrong number
    	     int numberOfDigits = String.valueOf(arr[i]).length();

    	        while (arr[i] != 0) {
    	            int digit = arr[i] % 10;
    	            sum = Math.pow(digit, numberOfDigits);
    	            arr[i] /= 10;
    	        }
    	        if(sum==arr[i])
    	        {
    	        	amstrong++;
    	        }
    	     
    	}
    	
    
    System.out.println("TOTAL EVEN NUMBERS: "+even);
	System.out.println("TOTAL ODD NUMBERS: "+odd);
	System.out.println("TOTAL PRIME NUMBERS: "+prime);
    System.out.println("TOTAL Palindrome NUMBERS: "+palindrome);
    System.out.println("TOTAL AMSTRONG NUMBERS: "+amstrong);
    }
}
