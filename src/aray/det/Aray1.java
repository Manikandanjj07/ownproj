package aray.det;

public class Aray1 {
	
	public static void main(String[] args){
		
		int a1[] = new int[10];
		int b = a1.length;

		int c = b*(b+1)/2;
		 
		 System.out.println("hai git hub");	
		 
	
			 int a[]={25,22,2,4,1,18,33,45,32,45,7667,23,88,8,44,6,11,34};
			 
			 for(int i=0;i<a.length;i++){
				
			 for(int j=i+1;j<a.length;j++){
			 int temp=0;
			
			 if(a[i]>a[j]){  // 1<3
				 temp=a[j];
				 a[j]=a[i];
				 a[i]=temp;
			 
			 } }			 }
			 
			// for(int k=0;k<a.length;k++){
				// System.out.println(a[k]+" ");}
			 
			 //1 2 4 6 8 11 18 22 23 25 32 33 34 44 45 45 88 7667 
			 int l[] = new int[a.length];
			 
			 int add=0;
			 
			
			 
			 for(int i=0;i<a.length;i++){
								
					
					 if(a[i]%2==0){
						 for(int b1=0;b1<a.length ;b1++){
						 add=a[i];
						 
						 l[b1]=add;
					 
						
						 }
						 
					 }}
			 System.out.println(l[1]);
				
	}}
		
			 
			 




			

	
