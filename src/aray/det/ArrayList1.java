package aray.det;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ArrayList1 {

	public static void main (String[] args){
		
		List<Integer>emp = new LinkedList<>();
		emp.add(10);
		emp.add(10);
		emp.add(20);
		emp.add(50);
		emp.add(60);
		emp.add(80);
		emp.add(60);
		emp.add(50);

      Object b = emp.size();

System.out.println(b);

emp.remove(2);
System.out.println(emp);
emp.remove(5);
System.out.println(emp);
emp.remove(5);
System.out.println(emp);

emp.add(70);

System.out.println(emp);

emp.add(2, 55);

System.out.println(emp);

emp.add(7, 88);
System.out.println(emp);


emp.add(8, 99);
System.out.println(emp);

emp.set(6, 77);

System.out.println(emp);

 for(int i=0; i<emp.size(); i++)
 {
	 if(emp.get(i)==60)
	 {
		 emp.set(i, 66);
		 
	 }
	 
 }
 System.out.println(emp);


System.out.println(emp.get(2));
 

}
}