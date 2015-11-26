package xianchenglian;

public class Date {
	private int month;
	private int day; 
	private int year;
	
	public Date(int theMonth, int theDay, int theYear){
		month = checkMonth(theMonth);
		year = checkYear(theYear);
		day = checkDay(theDay);
		System.out.printf("Data object constrctor for date %s\n",this);
	}
	
	private int checkMonth(int testMonth){
		if (testMonth > 0 && testMonth <= 12)
			return testMonth;
		else{
			System.out.printf(
					"Invalid month(%d) set to 1.",testMonth);
			return 1;
		}
	}
	
	private int checkDay(int testDay){
		int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;
		if(month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)))
	    	return testDay;
	    
	    System.out.printf("Invalid day (%d) set to 1.",testDay);
		return 1;
	}
	
	private int checkYear(int textYear)
	{
		if(textYear<=0)
		{
			System.out.printf("Invalid year (%d) set to 1.",textYear);
			return 1;
		}
		else 
		{
			return textYear;
		}
	}
	
	public void nextDay()
	{
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			if(day==31)
			{
				day=1;
				if(month==12)
				{
					
					month=1;
					year+=1;
				}
				else
				{
					month+=1;
				}
			}
			else 
			{
				day+=1;
			}
		}
		else if(month==4||month==6||month==9||month==11)
		{
			if(day==30)
			{
				day=1;
				month+=1;
			}
			else
			{
				day+=1;
			}
		}
		else if(month == 2)
		{
			if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0))
			{
				if(day==29)
				{
					day=1;
					month+=1;
				}
				else
				{
					day+=1;
				}
			}
			else
			{
				if(day==28)
				{
					day=1;
					month+=1;
				}
				else
				{
					day+=1;
				}
			}
			
		}
		
	}
	public String toString(){
		return String.format("%d/%d/%d",month, day, year);
	}
}

