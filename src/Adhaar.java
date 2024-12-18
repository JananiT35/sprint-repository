package assignedexample;

/*import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Adhaar {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String regex="[0-9]{4} [0-9]{4} [0-9]{4}";
	
	Pattern adhaar= Pattern.compile(regex);
	
	System.out.println("Enter your Adhaar number");
	String str= sc.next();
	
	Matcher m=adhaar.matcher(str);
	if(m.matches())
	
		System.out.println("Valid");
	
	else
		System.out.println("Invalid");
}
}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Adhaar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "\\\\d{4}\\\\s\\\\d{4}\\\\s\\\\d{4}";
        
        Pattern adhaar = Pattern.compile(regex);
        
        System.out.println("Enter your Adhaar number:");
        String str = sc.nextLine();  // Use nextLine() to capture the full input
        
        Matcher m = adhaar.matcher(str);
        if (m.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
         
    }
}*/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Adhaar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String regex = "\\d{4}\\s\\d{4}\\s\\d{4}";
        
        Pattern adhaar = Pattern.compile(regex);
        
        System.out.println("Enter your Adhaar number:");
        String str = sc.nextLine(); 
        
        Matcher m = adhaar.matcher(str);
        if (m.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        System.out.println("sts check github");
    }
}




