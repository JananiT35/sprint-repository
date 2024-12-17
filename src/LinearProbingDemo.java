
public class LinearProbingDemo {
public static void main(String[] args) {
	
}
}
class Car1{
	private String name;
	private String colour;
	private int number;
	Car1(String name,String colour,int number){
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
class StoredClass1{
	private String key;
	private Car1 c;
	StoredClass1(String key,Car1 c){
		this.key=key;
		this.c=c;
	}
	public Car1 getCar() {
        return c;
    }
	public String getKey() {
		return key;
	}
    public String toString() {
    	return "key= "+key+" name: "+c.getName();
    }	
}
public class SimpleHT {
	
	private Car1[] htable;
	
	public SimpleHT (int capacity)
	{
		htable=new Car1[10];
	}
	public boolean isOccupied(int index) {
		return htable[index]!=0;
	}
	public int put(String key,simpleHT) {
		
	}
	public void findkey(String key) {
		
	}
}
