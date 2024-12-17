package assigned;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableDemo {
	public static void main(String[] args) {
		
	Car1[] c= new Car1[3];
	
	c[0]= new Car1("Benz",2023,"XYZ");
	c[1]= new Car1("BMW",2022,"ABC");
	c[2]= new Car1("KIA",2024,"YYY");
	
	
	Arrays.sort(c, Car1.yearcomp);
	
	System.out.println("Sorting based on year:"+Arrays.toString(c));
	
	//Arrays.sort(c, Car1.namecomp);
	
	System.out.println("\nSorting based on name:"+Arrays.toString(c));
	
	
	//Arrays.sort(c, Car.namecomp);
	
	//System.out.println("Sorting based on name:"+Arrays.toString(c));
}
}
class Car1 {
	private String name;
	private int year;
	private String model;
	Car1(String name,int year,String model){
		this.name=name;
		this.year=year;
		this.model=model;
	}
	public String toString() {
		return "\nName of the car: "+name+"\nYear of manufacturing: "+year+"\nModel of the car: "+model;
	}
public static Comparator<Car1> yearcomp= new Comparator<Car1>() {
		
		@Override
		public int compare(Car1 o1, Car1 o2) {
			
			return o1.year-o2.year;
		}
	};
	/*public static Comparator<Car> namecomp= new Comparator<Car>() {
		public int compareTo(Car o1, Car o2) {
			
			// TODO Auto-generated method stub
			
			return o1.name.codePointAt(0)-o2.name.codePointAt(0); ;
		}
};*/
}
	
	

