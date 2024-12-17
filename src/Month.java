package another;


public enum Month
{
	January(31),Febraury(28),March(31),April(30),May(31),June(30),July(31),August(31),September(30),October(30),November(30),December(31);
	private int day;
	
	 Month(int day)
	{
		this.day=day;
	}

public int getDay()
{
	
	return day;
}
}
