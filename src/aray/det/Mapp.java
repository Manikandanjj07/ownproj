package aray.det;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapp {
public static void main (String[] arg){
	

	Map<Integer, String> emp = new HashMap<>();
	
	emp.put(1, "abc");
	emp.put(2, "ddc");
	emp.put(3, "abffsc");
	emp.put(4, "asdf");
	emp.put(5, "fdsh");
	emp.put(6, "abh");
	emp.put(7, "avbbv");
	emp.put(8, "asdds");
emp.replace(1, "xyz");
	
	
	Set<Integer> keys = emp.keySet();
	Collection<String>t = emp.values();
	
	
	Set<java.util.Map.Entry<Integer, String>> tt= emp.entrySet();
	for(java.util.Map.Entry<Integer, String> x : tt)
		{
		
		
		System.out.println(x.getValue());
		}
}
}