package aray.det;

import java.util.ArrayList;
import java.util.List;


public class ArrayList2 {

	public static void main (String[] args){
		
		List<Integer>emp = new ArrayList<>();
		emp.add(10);		
		emp.add(10);
		emp.add(30);
		emp.add(10);
		emp.add(80);
		emp.add(60);
		emp.add(10);
		emp.add(10);
		emp.add(60);

      Object b = emp.lastIndexOf(10);
      Object c = emp.indexOf(10);	 
      Object d = emp.indexOf(80);	 
      Object e = emp.indexOf(60);	
      
      
      System.out.println("index value of 10  "+c);
      System.out.println("last index value of 10  "+b);
      System.out.println("index value of 80  "+d);
      System.out.println("index value of 60  "+e);
      System.out.println("all index value of 10 ");
     
      for (int i = 0; i<emp.size(); i++)
      {
    	  if (emp.get(i)== 10){
    		  System.out.println(i);
    	  }
      }
    
   
      System.out.println("all index value of 60 ");
      
      for (int i = 0; i<emp.size(); i++)
      {
    	  if (emp.get(i)== 60){
    		  System.out.println(i);
    	  }
      }
      
      Object g= emp.get(4);
      
      System.out.println("4ht index value "+ g);
    
      System.out.println("2nd index value "+ emp.get(2));
      System.out.println("8ht index value "+ emp.get(8));
    
}
}