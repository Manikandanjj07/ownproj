package aray.det;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {

	

	public static void main (String[] args){
		
		List<Integer>emp = new ArrayList<>();
		emp.add(105);		
		emp.add(205);
		emp.add(305);
		emp.add(405);
		emp.add(505);
		emp.add(605);
		emp.add(705);
		emp.add(805);
		emp.add(905);
		
		for(int i=0; i<emp.size();i++)
		{
			
		System.out.println("value of emp "+i+"  "+	emp.get(i))  ;
		}
	
}
}