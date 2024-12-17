package assignedexample;

import java.util.Scanner;

public class management {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the PRN number:");
        String prn=s.next();
        
        System.out.println("Enter name:");
        String name=s.next();
        
        System.out.println("Enter email:");
        String email=s.next();
        
        System.out.println("Enter password:");
        int password=s.nextInt();
        
        System.out.println("Enter gpa:");
        double gpa=s.nextDouble();
        course c=course.REST;
        
        System.out.println("Enter city:");
        String city=s.next();
        
        System.out.println("Enter state:");
        String state=s.next();
        
        System.out.println("Enter phone number:");
        String phoneNo=s.next();
		
		Detail d=new Detail(prn,name,email,password,gpa,c);
	     d.show();
	    
		ContactDetails cd=new ContactDetails(city,state,phoneNo);
	     cd.show();
	     if(gpa>=7.0) {
	    	 System.out.println("CAN BE ADMITTED TO THE COURSE");
	     }
	     else {
	    	 System.out.println("CANNOT BE ADMITTED TO THE COURSE");
	     }
	     
	}
}
	class Detail{
		String prn;
		String name;
		String email;
		int password;
		double gpa;
		course c;
		Detail(String prn,String name,String email,int password,double gpa,course c) {
	    	this.prn = prn;
	        this.name = name;
	        this.email = email;
	        this.password = password;
	        this.gpa = gpa;
	        this.c=c;
	    }
		void show()
		{
			System.out.println("PRN NUMBER:  "+prn);
	        System.out.println("NAME OF THE STUDENT:  "+name);
	        System.out.println("EMAIL: "+email);
	        System.out.println("PASSWORD: "+password);
	        System.out.println("GPA:  "+gpa);
	        System.out.println("COURSE OPTED: "+c);
		}    
	}
	class ContactDetails {
	   String city;
	     String state;
	     String phoneNo;

	    ContactDetails(String city, String state, String phoneNo) {
	        this.city = city;
	        this.state = state;
	        this.phoneNo = phoneNo;
	    }   
	    void show()
		{
			System.out.println("CITY:  "+city);
	        System.out.println("STATE:  "+state);
	        System.out.println("PHONE NO: "+phoneNo);
	    
		}
	 }
	




