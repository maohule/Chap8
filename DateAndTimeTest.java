package xianchenglian;

public class DateAndTimeTest {
	public static void main(String args[])
	{
		DateAndTime t1=new DateAndTime(23,59,59,2,29,2000);
		DateAndTime t2=new DateAndTime(23,59,59,6,23,2000);
		
		System.out.println(t1.toUniversalString());
		System.out.println(t1.toStandardString());
		System.out.println(" after add one second");
		t1.tick();
		System.out.println(t1.toUniversalString());
		System.out.println(t1.toStandardString());
		
		System.out.println();
		
		System.out.println(t2.toUniversalString());
		System.out.println(t2.toStandardString());
		System.out.println(" after add one second");
		t2.tick();
		System.out.println(t2.toUniversalString());
		System.out.println(t2.toStandardString());
		
	}	
}
