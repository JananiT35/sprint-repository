package assignedexample;
import java.util.Scanner;
public class HasA {
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter mode of travel: ");
		        String mode = scanner.nextLine();

		        System.out.println("Enter place: ");
		        String place = scanner.nextLine();

		        System.out.println("Enter distance: ");
		        int distance = scanner.nextInt();

		        
		        System.out.println("Enter duration (in days): ");
		        int duration = scanner.nextInt();
		        scanner.nextLine();

		        System.out.println("Enter itienerary: ");
		        String itienerary = scanner.nextLine();

		      
		        Details detail = new Details(duration, itienerary);

		       
		        Travel travel = new Travel(mode, place, distance, detail);
		     
		
		        travel.display();
		    }
		}

		
	
	class Travel
	{
		private String mode;
		private int distance;
		private String place;
		//Car Has-A Engine
		private Details detail;
		
		Travel(String mode,String place,int distance,Details detail)
		{
			this.mode=mode;
			this.place=place;
			this.distance=distance;
			this.detail=detail;
		}
		
		void display()
		{
			System.out.println("Mode of travel: "+mode+" Place: "+place+" Distance: "+distance+"Details: "+detail);
		}
		
	}
	class Details
	{
		private int duration;
		private String itienary;
		
		Details(int duration,String itienary)
		{
			this.duration=duration;
			this.itienary=itienary;
		}
		public String toString()
		{
			return duration+"days"+" Itienary:"+itienary;
		}
		
		
		
	}


