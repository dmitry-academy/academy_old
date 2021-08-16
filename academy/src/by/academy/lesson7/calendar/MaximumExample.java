package by.academy.lesson7.calendar;

import java.util.Calendar;

public class MaximumExample {

	public static void main(String[] args) {
		  // creating calendar object 
        Calendar calendar = Calendar.getInstance(); 
      
        int max = calendar.getMaximum(Calendar.DAY_OF_WEEK); 
        System.out.println("Maximum number of days in a week: " + max); 
          
        max = calendar.getMaximum(Calendar.MONTH); 
        System.out.println("Maximum number of months in a year: " + max); 
        
        max = calendar.getMaximum(Calendar.WEEK_OF_YEAR); 
        System.out.println("Maximum number of weeks in a year: " + max); 
        
        max = calendar.getMaximum(Calendar.DAY_OF_MONTH); 
        System.out.println("Maximum number of days in the month: " + max);
        
        max = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Maximum number of day in the current month: " + max);

	}

}
