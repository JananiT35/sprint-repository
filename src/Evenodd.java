package assignedexample;
import java.util.*;
public class Evenodd {
      int a,b;
      public void Range() {
    	  System.out.println("EVEN NUMBERS: ");
    	  for(int i=a;i<=b;i++)
    	  {
    		 
    		  if(i%2==0) {
    			  System.out.print(" "+i);
    		  }
    	  }
    	  System.out.println(" ");
    	  System.out.println("ODD NUMBERS: ");
    	  for (int i=a;i<=b;i++) {
    		
    		  if(i%2!=0) {
    			  System.out.print(" "+i);
    		  }
    		 
    			  
    		  
    	  }
      }
      public static void main(String[] args) {
  		Scanner s=new Scanner(System.in);
  		Evenodd w=new Evenodd();
  		System.out.println("Enter the number1:");
  		w.a=s.nextInt();
  		System.out.println("Enter the number2:");
  		w.b=s.nextInt();
  		
  		
  	
  		
  		w.Range();
  		
  	}
      
}
