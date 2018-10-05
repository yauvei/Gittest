import java.util.ArrayList;
import java.util.List;

public class Java8Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  List names = new ArrayList();
	        
	      names.add("Google");
	      names.add("Runoob");
	      names.add("Taobao");
	      names.add("Baidu");
	      names.add("Sina");
	        
	      names.forEach(System.out::println);//java8::

	}

}
