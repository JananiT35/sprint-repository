import java.util.LinkedList;

public class HashTableDemo {
public static void main(String[] args) {
	SimpleHT hashTable = new SimpleHT();

    Car car1 = new Car("Toyota", "Red", 1234);
    Car car2 = new Car("Honda", "Blue", 5678);
    Car car3 = new Car("Ford", "Black", 9101);

    StoredClass storedCar1 = new StoredClass("jan", car1);
    StoredClass storedCar2 = new StoredClass("key2", car2);
    StoredClass storedCar3 = new StoredClass("key34", car3);

    hashTable.put("jan", storedCar1);
    hashTable.put("key2", storedCar2);
    hashTable.put("key34", storedCar3);

    System.out.println("HashTable contents:");
    hashTable.print();

   LinkedList<StoredClass> retrievedCars = hashTable.get("key2");
    System.out.println("Retrieved cars for key2:");
    for (StoredClass sc : retrievedCars) {
    	Car car = sc.getCar();
    }
    System.out.println("Car Name: " + car2.getName() + ", Colour: " + car2.getColour() + ", Number: " + car2.getNumber());
}
}
class Car{
	private String name;
	private String colour;
	private int number;
	Car(String name,String colour,int number){
		this.name=name;
		this.colour=colour;
		this.number=number;
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	public String getColour() {
		return colour;
	}
	void setColour(String colour) {
		this.colour=colour;
	}
	public int getNumber() {
		return number;
	}
	void setNumber(int number) {
		this.number=number;
	}
	public String tostring() {
		return "Name:"+name+"colour:"+colour+"number:"+number;
	}
}
class StoredClass{
	private String key;
	private Car c;
	StoredClass(String key,Car c){
		this.key=key;
		this.c=c;
	}
	public Car getCar() {
        return c;
    }
	public String getKey() {
		return key;
	}
    public String toString() {
    	return "key= "+key+" name: "+c.getName();
    }
	
}
class SimpleHT{
	private LinkedList<StoredClass> l1;
	public SimpleHT() {
		this.l1=new LinkedList<>();
	}
	 public LinkedList<StoredClass> getl1() {
	        return l1;
	    }
private int hfunc(String key) {
	return key.hashCode();
}
public void put(String key,StoredClass s) {
	int hashedkey=hfunc(key);
	if(hashedkey==0)
		System.out.println("already exists");
	else
		l1.add(s);
}
public LinkedList<StoredClass> get(String key) {
	int hashedkey=hfunc(key);
	return l1;
}
public LinkedList<StoredClass> remove(String key){
	int hashedkey=hfunc(key);
	return l1;
}
public void print() {
	for(StoredClass c:l1) {
		System.out.println(c);
	}
}
}
