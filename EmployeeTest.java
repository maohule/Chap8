package xianchenglian;

public class EmployeeTest {
	public static void main(String args[])
	{
		Date birth=new Date(7,24,1949);
		Date hire=new Date(3,12,1988);
		
		Employee employee=new Employee("Bob","Blue",birth,hire);
		System.out.println(employee);
		
		Date test=new Date(12,3,2000);
		for(int i=0;i<400;i++)
		{
			test.nextDay();
			System.out.println("after add one day"+test);
		}
	}
}
