package xianchenglian;

public class Time2Test {

	public static void main(String[] args) {
		Time2 t1=new Time2();
		Time2 t2=new Time2(2);
		Time2 t3=new Time2(21,34);
		Time2 t4=new Time2(12,25,42);
		Time2 t5=new Time2(27,74,99);
		Time2 t6=new Time2(t4);
		Time2 t7=new Time2(10,24,59);
		Time2 t8=new Time2(10,59,59);
		Time2 t9=new Time2(23,59,59);
		
		System.out.println("Constructed with:");
		System.out.println("t1:all arguments defaulted");
		System.out.printf(" %s\n",t1.toUniversalString());
		System.out.printf(" %s\n",t1.toString());
		
		System.out.println("t2:hour specified;minute and second defaulted");
		System.out.printf(" %s\n",t2.toUniversalString());
		System.out.printf(" %s\n",t2.toString());
		
		System.out.println("t3:hour and minute specified; second defaulted");
		System.out.printf(" %s\n",t3.toUniversalString());
		System.out.printf(" %s\n",t3.toString());
		
		System.out.println("t4:hour,minute and second specified");
		System.out.printf(" %s\n",t4.toUniversalString());
		System.out.printf(" %s\n",t4.toString());
		
		System.out.println("t5:all invalid values specified");
		System.out.printf(" %s\n",t5.toUniversalString());
		System.out.printf(" %s\n",t5.toString());
		
		System.out.println("t6:Time2 object t4 specified");
		System.out.printf(" %s\n",t6.toUniversalString());
		System.out.printf(" %s\n",t6.toString());
		
		System.out.println("t7:before second add 1");
		System.out.printf(" %s\n",t7.toUniversalString());
		System.out.printf(" %s\n",t7.toString());
		t7.tick();
		System.out.println("t7:after second add 1");
		System.out.printf(" %s\n",t7.toUniversalString());
		System.out.printf(" %s\n",t7.toString());
		
		System.out.println("t8:before second add 1");
		System.out.printf(" %s\n",t8.toUniversalString());
		System.out.printf(" %s\n",t8.toString());
		t8.tick();
		System.out.println("t8:after second add 1");
		System.out.printf(" %s\n",t8.toUniversalString());
		System.out.printf(" %s\n",t8.toString());
		
		System.out.println("t9:before second add 1");
		System.out.printf(" %s\n",t9.toUniversalString());
		System.out.printf(" %s\n",t9.toString());
		t9.tick();
		System.out.println("t9:after second add 1");
		System.out.printf(" %s\n",t9.toUniversalString());
		System.out.printf(" %s\n",t9.toString());	
	}
}
