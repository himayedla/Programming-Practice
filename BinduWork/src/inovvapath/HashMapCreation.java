package inovvapath;
import java.util.*;

public class HashMapCreation {
	public static void main(String[] args){
		
		//Create a hash map
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("A", new Integer(1));
		hm.put("B", new Integer(2));
		hm.put("C", new Integer(3));
		hm.put("D", new Integer(4));
		hm.put("E", new Integer(5));
		
		//Display
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()){
			Map.Entry m = (Map.Entry)i.next();
			System.out.print("Key is: " + m.getKey() + " & Value is: ");
			System.out.println(m.getValue());
		}
		int a = hm.get("C");
		int b = hm.get("D");
		
		System.out.println( "Value is :" + a);
		System.out.println("Value is :" + b);
		
		
		
	}

}
