import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CourierService {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of courier records:");
		int noofRecords=s.nextInt();
		s.nextLine();
		Map<String,String>MapCourier=new HashMap<>();
		 System.out.println("Enter the courier details(courierId:courierType):");
		 for(int i=0;i<noofRecords;i++) {
			 String j=s.nextLine();
			 int index=j.indexOf(':');
			 if(index!=-1) {
				 String courierId=j.substring(0,index);
				 String type=j.substring(index+1);
				 MapCourier.put(courierId, type);
			 }
			
		 }
		 CourierServiceMain ser=new CourierServiceMain(MapCourier);
		 System.out.println("Enter the courierType to search for count:");
		 String type=s.nextLine();
		 int count = ser.findTheCountofCouriersBasedOnTheCourierType(type);	
		 if(count>0) {
			 System.out.println("Records: "+count);
		 }
		 else {
			 System.out.println("no records: "+type);
		 }
		 System.out.println("Enter ID to be searched: ");
		 String search=s.nextLine();
		 List<String> courierId= ser.FindCourierIDsBasedOnTheCourierType(search);
				
		 if(!courierId.isEmpty()) {
			 System.out.println("Courier id: "+String.join(",",courierId));
		 }
		 else {
			 System.out.println("no id found");
		 }
		
	}
	}
	class CourierServiceMain{
		private Map<String,String> MapCourier;
		public CourierServiceMain(Map<String,String> MapCourier) {
			this.MapCourier=MapCourier;
		}
		public int findTheCountofCouriersBasedOnTheCourierType(String courierType) {
			int count=0;
			if(courierType==null||MapCourier==null) {
				return -1;
			}
			for(Entry<String, String> entry:MapCourier.entrySet()) {
				if(entry.getValue().equalsIgnoreCase(courierType)) {
					count++;
				}
			}
			return count;
		}
		public List<String> FindCourierIDsBasedOnTheCourierType(String courierType){
			List<String> courierID=new ArrayList<>();
			if(courierType==null||MapCourier==null) {
				return courierID;
			}
			for(Map.Entry<String, String> entry:MapCourier.entrySet()) {
				if(entry.getValue().equalsIgnoreCase(courierType)) {
					courierID.add(entry.getKey());
				}
			}
			return courierID;
		}
	}


