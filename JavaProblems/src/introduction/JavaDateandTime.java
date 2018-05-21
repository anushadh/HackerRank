package introduction;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JavaDateandTime {
	
	static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
		
		in.close();
	}

	private static String getDay(String day, String month, String year) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
		
		Date date = calendar.getTime();
	//	String dayOfWeek = new SimpleDateFormat("EEEE").format(date);
		
		int dayInWeek = calendar.get(Calendar.DAY_OF_WEEK);
		
		return days.get(dayInWeek-1);
		//return dayOfWeek;
	}

}
