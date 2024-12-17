package assignedexample;

/*import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PattenMatching {
	public static void main(String[] args) {
		
	
	StringTokenizer given= new StringTokenizer("A gentle breeze rustles the leaves, whispering secrets of nature’s timeless beauty , and the promise of new beginnings.",",");
	
	while(given.hasMoreTokens())
	{
		System.out.println(given.nextElement());
	}
	Pattern p =Pattern.compile("gentle");
	Matcher m= p.matcher(given);
	
	System.out.println(m.find());
	
	System.out.println("Replaced:"+m.replaceAll("The"));
}
}*/
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {
        String input = "A gentle breeze rustles the leaves,whispering secrets of nature’s timeless beauty ,and the promise of new beginnings.";
        StringTokenizer given = new StringTokenizer(input, ",");

        while (given.hasMoreTokens()) {
            System.out.println(given.nextToken());
        }

        Pattern p = Pattern.compile("A");
        Matcher m = p.matcher(input);

        System.out.println(m.find());

        System.out.println("Replaced: " + m.replaceAll("The"));
    }
}




