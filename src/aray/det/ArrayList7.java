package aray.det;

import java.util.ArrayList;
import java.util.List;

public class ArrayList7 {
	
	
	public static void main(String[] args){
		
	
	List<Integer>emp = new ArrayList<>();
	emp.add(10);		
	emp.add(20);
	emp.add(30);
	emp.add(90);
	emp.add(10);
	emp.add(10);
	emp.add(40);
	emp.add(50);
	
	emp.remove(4);
	System.out.println(emp);
List<Integer>len = new ArrayList<>();
len.add(30);		
len.add(40);
len.add(50);
len.add(60);
len.add(80);

emp.equals(len);
List<Integer>new1 = new ArrayList<>();
new1.add(10);		
new1.add(20);
new1.add(60);
new1.add(50);
new1.add(40);
new1.add(70);
new1.add(80);
new1.add(90);




emp.removeAll(new1);


len.removeAll(emp);

System.out.println(len);
System.out.println(emp);



}
}
