package aray.det;



public class Stringg {

	public void ac(){
		
	
		String s ="manikanadan120";


		String m ="m0m1m2m3m4m5m6m7";
		String b="asdsd";
		
		String n =s.concat(m).concat(b);
		
				
		System.out.println("aaa");
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf('1'));
		System.out.println(s.equals(m));
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println(m.replaceAll(s,m));
		System.out.println(s.replace('a', 'A'));
		System.out.println(m.concat(s));
		System.out.println(s.substring(0,11));
		String[] s2=s.split("a");
		System.out.println(s2[2]);
		
		char c= 'a';
		int s1=s.indexOf(c);
		
		while(s1 != -1)
		{
			System.out.println(s1);
			s1 =s.indexOf(c, s1+1);
			
		}
	}
	
	
	
	public static void main (String[] args){
		Stringg c = new Stringg();
		c.ac();
		
	}}