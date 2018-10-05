import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable testHashtable  = new Hashtable();
		testHashtable.put("NIKE", new Double(180));
		testHashtable.put("kappa", new Double(280));
		testHashtable.put("lining", new Double(380));
		
		double data1;
		//data1 = testHashtable.get("kappa");
		data1 = ((Double)testHashtable.get("NIKE")).doubleValue();
		testHashtable.put("NIKE",new Double(data1+111));
		System.out.println("NIKE's new balance: " + testHashtable.get("NIKE"));
			  

	}

}
