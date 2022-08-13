package aray.det;

import java.util.ArrayList;
import java.util.List;

public class ArrayLis6 {
	

	public static void main (String[] args){
		
		List<Integer>emp = new ArrayList<>();
		emp.add(10);		
		emp.add(20);
		emp.add(30);
		emp.add(90);
		emp.add(10);
		emp.add(10);
		emp.add(40);
		emp.add(50);
		emp.add(60);
		
		
		List<Integer>rp = new ArrayList<>();
		rp.add(10);		
		rp.add(20);
		rp.add(60);
		rp.add(50);
		rp.add(40);
		rp.add(70);
		rp.add(80);
		rp.add(90);
				
		List<Integer>p = new ArrayList<>();
		p.add(100);		
		p.add(200);
		p.add(600);
		p.add(500);
		p.add(400);
		p.add(700);
		p.add(800);
		p.add(900);
		
		
		List<Integer>len = new ArrayList<>();
		len.add(30);		
		len.add(40);
		len.add(50);
		len.add(60);
		len.add(70);
		
		
		
		rp.retainAll(emp);
		System.out.println(" common values"+rp);
	
		
	emp.retainAll(len);
		
	
	List<Integer>new1 = new ArrayList<>();
	new1 =emp;
	
		System.out.println(" common values"+new1);
		
		p.retainAll(len);
		System.out.println(len);
		

	}

}
