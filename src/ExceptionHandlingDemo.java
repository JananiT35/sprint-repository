import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); 
        }
        catch (ArrayIndexOutOfBoundsException e ) {
           System.out.println("Array index is out of bounds: ");
        } 
        try {
        	 
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        }
        
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } 
        
        try {
        	String str = null;
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null pointer exception ");
        } 
        Scanner scanner = new Scanner(System.in);
        try {
        	System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Illegal argument error: Number must be non-negative");
            } 
        	
        }
        	catch (IllegalArgumentException e) {
                System.out.println("Illegal argument error ");
            }
        
        
        finally {
            System.out.println("This is the finally block");
        }
    }
}
