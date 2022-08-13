package aray.det;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Linklist {


	public static void main (String[] args){
	
	Scanner s =new Scanner(System.in);
	List <Integer>emp = new LinkedList<>();
	emp.add(100);
	emp.add(200);
	emp.add(300);
	emp.add(100);
	emp.add(300);
	emp.add(400);
	emp.add(500);
	emp.add(600);
	emp.add(700);
	emp.add(100);

 
   // System.out.println(emp);
    
    System.out.println(emp.get(5));
  


    int b = emp.size();

        for (int i=0;i<b;i++)
    {
        	//System.out.println(emp.get(i));
            
   if(emp.get(i)==100)
    	
 
     
     {
    
    	  System.out.println(i);
    	  System.out.println(emp.get(i));
     }
     
      
    
    	    		
    	    		
    	    		
    	   
    	   	
    	
    	
    }
    

    
}
}