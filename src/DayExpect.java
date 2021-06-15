import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class DayExpect {
	public static void main(String args[]) {
		LocalDateTime present = LocalDateTime.now();
		LocalDateTime future = present.plusYears(3); 
		
		System.out.println(present);
		System.out.println(future);
		
		DayOfWeek date1 = present.getDayOfWeek();
		DayOfWeek date2 = future.getDayOfWeek();
		
		System.out.println(date1);
		System.out.println(date2);
		

	}

}
