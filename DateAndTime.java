package xianchenglian;

public class DateAndTime {
	private int hour;
	private int minute;
	private int second;
	private int month;
	private int day; 
	private int year;
	
	public DateAndTime(int h,int m,int s,int theMonth, int theDay, int theYear )
	{
		setHour(h);
		setMinute(m);
		setSecond(s);
		month = checkMonth(theMonth);
		year = checkYear(theYear);
		day = checkDay(theDay);
		
	}
	
	public void setTime(int h,int m,int s)
	{
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h)
	{
		hour=((h>=0&&h<24)?h:0);
	}
	
	public void setMinute(int m)
	{
		minute=((m>=0&&m<60)?m:0);
	}
	
	public void setSecond(int s)
	{
		second=((s>=0&&s<60)?s:0);
	}
	
	public int getHour()
	{
		return hour;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public int getSecond()
	{
		return second;
	}
	
	private int checkMonth(int testMonth){
		if (testMonth > 0 && testMonth <= 12)
			return testMonth;
		else{
			System.out.printf("Invalid month(%d) set to 1. \n",testMonth);
			return 1;
		}
	}
	
	private int checkDay(int testDay){
		int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(testDay > 0 && testDay <= daysPerMonth[month])
			return testDay;
		if(month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)))
	    	return testDay;
	    
	    System.out.printf("Invalid day (%d) set to 1. \n",testDay);
		return 1;
	}
	
	private int checkYear(int textYear)
	{
		if(textYear<=0)
		{
			System.out.printf("Invalid year (%d) set to 1. \n",textYear);
			return 1;
		}
		else 
		{
			return textYear;
		}
	}
	
	public void tick()
	{
		second+=1;
		if(second==60)
		{
			incrementMinute();
		}
		setSecond(second);
	}
	
	public void incrementMinute()
	{
		minute+=1;
		if(minute==60)
		{
			incrementHour();
		}
		setMinute(minute);
	}
	
	public void incrementHour()
	{
		hour+=1;
		if(hour==24)
		{
			nextDay();
		}
		setHour(hour);
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
	
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d  %d/%d/%d",getHour(),getMinute(),getSecond(),month,day,year);
	}
	public String toStandardString()
	{
		return String.format("%d:%02d:%02d %s  %d/%d/%d",((getHour()==0||getHour()==12)?12:getHour()%12),getMinute(),getSecond(),(getHour()<12?"AM":"PM"),month,day,year);
	}
	
}
