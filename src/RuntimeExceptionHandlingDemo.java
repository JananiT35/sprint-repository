
public class RuntimeExceptionHandlingDemo {
	    public static void main(String[] args) {
	        try {
	            String str = null;
	            if (str == null) {
	                throw new NullPointerException("String value is null");
	            }
	        } 
	        catch (NullPointerException e) {
	            System.out.println("Caught exception: ");
	        }
	        try {
	            int a=10;
	            int b=0;
	            int c=a/b;
	        } catch (ArithmeticException e) {
	            System.out.println("File not found");
	        }
	    }
	    }
	


