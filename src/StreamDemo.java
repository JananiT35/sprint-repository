package assigned;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		Stream <String> streamempty=Stream.empty();
		
	
	LinkedList<Car> ll=new LinkedList<>();
	ll.add(new Car("Benz",2023,"XYZ"));
	ll.add(new Car("BMW",2022,"ABC"));
	ll.add(new Car("Kia",2024,"XYZ"));
	ll.add(new Car("BMW",2024,"YYY"));
	ll.add(new Car("TATA",2021,"AAA"));
	Stream<Car> strcust=ll.stream();
	Car[] c1=new Car[6];
	c1[0]= new Car("Benz",2023,"XYZ");
	c1[1]= new Car("BMW",2022,"ABC");
	c1[2]= new Car("KIA",2024,"XYZ");
	c1[3]= new Car("BMW",2024,"YYY");
	c1[4]= new Car("TATA",2021,"AAA");
	c1[5]= new Car("TATA",2021,"AAA");
	Set<Car> carSet = new HashSet<>();

    carSet.add(new Car("Benz", 2023, "XYZ"));
    carSet.add(new Car("BMW", 2022, "ABC"));
    carSet.add(new Car("Kia", 2024, "XYZ"));
    carSet.add(new Car("BMW", 2024, "YYY"));
    carSet.add(new Car("TATA", 2021, "AAA"));
    carSet.add(new Car("BMW", 2022, "ABC"));
	Map<Integer, String> mapcust=ll.stream()
			.collect(Collectors.toMap(Car::getYear,
                    Car::getName,
                    (existing, replacement) -> existing));
			//.collect(Collectors.toMap(c->c.getYear(), c->c.getName()));
System.out.println("\nList to Map(year,name)"+mapcust);
Car max= ll.stream()
.max((o1,o2)->o1.getYear()> o2.getYear()?1:-1).get();
System.out.println("\nMax Year:"+max);
int total=ll.stream()
.map(c->c.getYear())
.reduce(0,(sum,year)->(sum+1));
System.out.println("\nTotal no of years:"+total);
Car min= ll.stream()
.min((o1,o2)->o1.getYear()> o2.getYear()?1:-1).get();
System.out.println("\nMin year:"+min);
Stream.iterate(1, o -> o + 1)
.filter(year->year>=2021)//condition//predicate
.forEach(System.out::println);
System.out.println("car1 equals car2: " + carSet.equals(carSet)); // Should be true
System.out.println("car1 hashCode: " + carSet.hashCode());
}
}