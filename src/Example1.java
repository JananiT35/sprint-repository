package assignedexample;

public interface Example1 {
	
	void emp(String st);
	
	interface Do extends Example1
	{
		default void doit()
		{
			System.out.println("extend interface");
		}
	}
	interface Doable extends Do
	{
		void show();
	}


	 

}
