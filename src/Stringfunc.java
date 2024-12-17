
public class Stringfunc {
	public static void main(String ar[])  
	{  
	String s="  String functions  "; 
	
	
	System.out.println(s.toUpperCase());  
	
	System.out.println(s.toLowerCase());  
	
	System.out.println(s.trim());
	
	System.out.println(s.length()); 
	
	String str1 = "";
	String str2 = "Hello";

	System.out.println(str1.isEmpty()); 
	System.out.println(str2.isEmpty()); 
	
	StringBuffer sb = new StringBuffer("Hello World");
	String sub = sb.substring(6, 11);
	System.out.println(sub); 
	
	sb.reverse();
	System.out.println(sb);
	
	StringBuilder sb1=new StringBuilder("Hello");  
	sb1.delete(1,3);  
	System.out.println(sb1);
	
	StringBuffer sb2=new StringBuffer("Good ");  
	sb2.insert(4," Evening");
	System.out.println(sb2);

	sb2.replace(0,4,"Monday");  
	System.out.println(sb2);
	}  
	}  

