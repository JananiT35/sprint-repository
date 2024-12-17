package another;
import Private.*;

public class protect {
  public static void main(String[] args) {
	  Imported i=new Imported();
	  i.print();
  }
}
class Imported extends demo{
	void print()
	{
		vehicle="bike";
		System.out.println("Vehicle from Derived class another package sub class:"+vehicle);
	}
}
