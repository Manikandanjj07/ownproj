package aray.det;

import java.util.ArrayList;
import java.util.List;

public class ArrayList8 {
	
	public static void main(String[] args){
		
		
	List<Integer>emp = new ArrayList<>();
	emp.add(10);		
	emp.add(20);
	emp.add(30);
	emp.add(40);
	emp.add(50);
	emp.add(60);
	emp.add(70);
	emp.add(80);
	emp.contains(80);
	
	List<Integer>p = new ArrayList<>();
	p.add(100);		
	p.add(200);
	p.add(600);
	p.add(500);
	p.add(400);
	p.add(700);
	p.add(800);
	p.add(900);
	
	emp.removeAll(p);
	
	System.out.println(p);
	

}
}