package another;
import java.util.Scanner;
public class Number {
	

	
	public static void main(String[] args) {
		int day1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter day");
		
		Number n=new Number();
		sc.day1=sc.nextInt();
		

	Switch(day1){
		
		case 30:
		{
		System.out.println("April","June","November","September");
		break;
		}
		case 28:
		{
		System.out.println("Febraury");
		break;
		}
		case 31:
		{
		System.out.println("January","March","May","July","August","October","December");
		break;
		}
	default:
		System.out.println("Invalid");
		
	}
	}


}
