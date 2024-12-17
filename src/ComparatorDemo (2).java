package assigned;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class ComparatorDemo {
	public static void main(String[] args) {
		LinkedList<Car> l1=new LinkedList<>();
		l1.add(new Car("Benz",2023,"abc"));
		l1.add(new Car("BMW",2022,"XXX"));
		l1.add(new Car("Kia",2024,"YYY"));
		
		Collections.sort(l1,Car.namecomp);
		System.out.println("Sorting based on name of the car: ");
		ListIterator lt=l1.listIterator();
		while(lt.hasNext()) {
			System.out.print(lt.next());
		}
		
		Collections.sort(l1, Car.yearcomp);
		System.out.println("\nSorting based on year of manufacturing:");
		ListIterator lt1=l1.listIterator();
		while(lt1.hasNext()) {
			System.out.print(lt1.next());
		}
		
		Collections.sort(l1, Car.modelcomp);
		System.out.println("\nSorting based on model: ");
		ListIterator lt2=l1.listIterator();
		while(lt2.hasNext()) {
			System.out.print(lt2.next());
		}
	}

}
class Car {
	private String name;
	private int year;
	private static String model;
	Car(String name,int year,String model){
		this.name=name;
		this.year=year;
		this.model=model;
	}
	public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
	public String toString() {
		return "\nName of the car: "+name+"\nYear of manufacturing: "+year+"\nModel of the car: "+model;
	}
   public static Comparator<Car> namecomp= new Comparator<Car>() {
		public int compareTo(Car o1, Car o2) {
			
			// TODO Auto-generated method stub
			
			return o1.name.codePointAt(0)-o2.name.codePointAt(0); ;
		}

		@Override
		public int compare(Car o1, Car o2) {
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	public static Comparator<Car> yearcomp = new Comparator<Car>() {
		
		@Override
		public int compare(Car o1, Car o2) {
			
			return o1.year-o2.year;
		}
	};
	public static Comparator<Car> modelcomp= new Comparator<Car>() {
		public int compare(Car o1, Car o2) {
			// TODO Auto-generated method stub
			
			return o1.model.codePointAt(0)-o2.model.codePointAt(0);
		}
		public int hashCode() {
			return Objects.hash(model);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Car other = (Car) obj;
			return Objects.equals(model, other.model);

		}
		
	};	
}