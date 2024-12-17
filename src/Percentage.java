package assignedexample;

import java.text.NumberFormat;
import java.util.Locale;

public class Percentage {
	public static void main(String[] args) {
		Locale ld= new Locale("EN", "INDIA");
		
		displayCurrency(Locale.KOREAN);
		displayCurrency(Locale.CANADA);
		displayCurrency(Locale.JAPAN);
		displayCurrency(Locale.getDefault());
		displayCurrency(Locale.ENGLISH);
		displayCurrency(Locale.UK);
		displayNumber(Locale.ITALY);
		displayNumber(Locale.GERMAN);
		displayNumber(ld);
		displayPercentage(Locale.CHINESE);
		displayPercentage(Locale.US);
		displayPercentage(Locale.ENGLISH);
		displayPercentage(Locale.GERMANY);
		displayPercentage(Locale.CANADA_FRENCH);
		displayPercentage(Locale.FRENCH);
		
 
	}
	public static void displayNumber(Locale l)
	{
		Integer i=new Integer(123456);
		Double d= new Double(4567.89);
		NumberFormat nf= NumberFormat.getNumberInstance(l);
		
		String istr= nf.format(i);
		String dstr= nf.format(d);
		
		System.out.println("Integer:"+istr+"  Double:"+dstr);
	}
	
	public static void displayCurrency(Locale l)
	{
		Double db=123456.5678;
		NumberFormat nf= NumberFormat.getCurrencyInstance(l);
		String cstr= nf.format(db);
		System.out.println("Currency:"+cstr);
	}
	public static void displayPercentage(Locale l)
	{
		Double db1=50.05;
		NumberFormat nf= NumberFormat.getPercentInstance(l);
		String pstr= nf.format(db1);
		System.out.println("Percentage:"+pstr);
	}
 
}


