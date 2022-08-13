package aray.det;

import java.util.HashSet;
import java.util.Set;

public class sett {

	
	public static void main(String[] arg){
		
		

Set<Integer> a =new HashSet<>();

Set<Integer> b =new HashSet<>();

a.add(100);
a.add(200);
a.add(300);
a.add(100);
a.add(300);
a.add(400);
a.add(500);
a.add(600);
a.add(700);
a.add(100);


b.addAll(a);

for(Integer x : a){

System.out.println(x);
}
	}
}


