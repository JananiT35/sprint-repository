package assignedexample;

public interface Contact extends Shopping{
	public void name(String name);
	public void otp(int otp);
	public static void Status()
	{
	System.out.println("Delivered");	
	}
	public default void PaymentMethod()
	{
		System.out.println("Net Banking");
	}

}
