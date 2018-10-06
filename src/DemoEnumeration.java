import java.util.Enumeration;
import java.util.Vector;
//test1006
//test100601
public class DemoEnumeration {
// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration<String> days;//Enumeration声明的方法
		Vector<String> dayNames = new Vector<String>();// java 中可以实现自动增长的对象数组
		dayNames.add("test");
		dayNames.add("Sunday");
	    dayNames.add("Monday");
	    dayNames.add("Tuesday");
	    dayNames.add("Wednesday");
	    dayNames.add("Thursday");
	    dayNames.add("Friday");
	    dayNames.add("Saturday");
	    days = dayNames.elements();
	
	    while (days.hasMoreElements()){//测试此枚举是否包含更多的元素。
	         System.out.println(days.nextElement()); 
	      }
		
	}

}
// TODO Auto-generated method stub
