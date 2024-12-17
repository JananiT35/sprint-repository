package Private;

public class demo {
	protected String vehicle;
	public static void main(String[]args)
	{
		Licence l=new Licence();
		l.setnum(123);
		l.setname("Janani");
		System.out.println("Licence number:"+l.getnum()+"    Name:"+l.getname());
		Type t=new Type();
		t.vehicle="car";
		t.print();
	}
	

}
class Type extends demo
{
	void print()
	{
		System.out.println("Type of vehicle:"+vehicle);
	}
}
class Licence{
	private int num;
	private String name;
	void Details() {
		System.out.println("Name of the person:"+name);
		System.out.println("Licence number:"+num);
		
	}
	void setnum(int num) {
		this.num=num;
	}
	int getnum()
	{
		return num;
	}
	void setname(String name) {
		this.name=name;
				
	}
	String getname() {
		return name;
	}
}

