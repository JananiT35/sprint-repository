package assignedexample;

public class FunctionalInterfaceDemo implements Example1 {
    public static void main(String[] args) {
        Example1 st = new FunctionalInterfaceDemo();
        st.emp("Message1");

        // Implement Lambda
        Example1 s =(o1) -> {
            System.out.println("Message: " + o1);
        };
        ((Example1) s).emp("Message2");
    }
	

		 public void emp(String msg) {
		        System.out.println("Message: " + msg);
		    }

		    public void say(String msg) {
		        System.out.println("Message: " + msg);
		    }
		}
	 
	
	
	
	

