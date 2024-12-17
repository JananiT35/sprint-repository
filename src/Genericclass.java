package assignedexample;

public class Genericclass {
	public static void main(String[] args) {
		
	Example e1 = new Example();
    e1.set(55,23.45);
    System.out.println("Int and float: "+ e1.get()+" "+e1.out());

    
    e1.set("demo",'D');
    System.out.println("String and character: " + e1.get()+" "+e1.out());

    
    e1.set(123.987,"invalid");
    System.out.println("Double and string: " + e1.get()+" "+e1.out());

}
}

 
class Example
{
	private Object o1;
	private Object o2;
	
	public void set(Object o1, Object o2)
	{
		this.o1=o1;
		this.o2=o2;
		
	}
	public Object get()
	{
		return o1;
	}
	
	public Object out()
	{
		return o2;
	}

}
