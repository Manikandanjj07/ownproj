package aray.det;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashSet;

public class ArrayList3 {

	public static void main (String[] args){
		
		List<Integer>emp = new ArrayList<>();
		emp.add(10);
		
		emp.add(100);
		emp.add(30);
		emp.add(500);
		emp.add(80);
		emp.add(80);


      Object b = emp.indexOf(100); 
    		 
System.out.println("index value of "+b);


LinkedHashSet<Integer> linkedHashSet= new LinkedHashSet<Integer> (emp);


List<Integer>emp1 = new ArrayList<>(linkedHashSet);

System.out.println("dublicate removed"+emp1);

}
}