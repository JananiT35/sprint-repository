package assignedexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeDemo {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println("Date:"+d.toGMTString()+"Hours:"+d.getHours());
		System.out.println("Year:"+d.getYear()+"Time"+d.getTime());
		
		LocalDate ld= LocalDate.now();
		System.out.println("date:"+ld+"  DayOfMonth"+ld.getDayOfMonth());
		System.out.println("month "+ld.getMonth()+"  Year"+ld.getYear());
		System.out.println("DayOfWeek"+ld.getDayOfWeek()+" DayOfYear"+ld.getDayOfYear());
		
		LocalTime lt=LocalTime.now();
		System.out.println("Minute "+ lt.getSecond()+" Nano"+lt.toSecondOfDay());
		
		LocalDateTime ldt= LocalDateTime.now();
		
		System.out.println("MonthValue"+ldt.getMonthValue());
		
		DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd-MM-yy");
		String form1= ldt.format(dtf1);
		System.out.println("After formatting:"+form1);
		DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("E, MMM dd yyyy :HH:mm:ss:ns ");
		String form2= ldt.format(dtf2);
		System.out.println("After formatting:"+form2);
}
}