package ch05.function;

public class function3 {

	public static void main(String[] args) {
		
		 int result = num(8,4,2);
		 System.out.println(result);
		
	}
	
	   public static int num( int b, int c, int a) {
			 int result=0;
			 
			if(a>b && a>c) {
				   result= a;		  
			} else if(b>a && b>c) {
				result= b;	
		    } else {
				   result= c;	
		   }
			   return result;
		   }
	  
	   
	   
	   
	   
	   
	   
	  
		  public static int num( int b, int c, int a) {
		   int result=0;
		   if(a<b && a<c) {
			   result= a;	
		   }else if(b<a && b<c) {
				result= b;
		   } else {
			   result= c;	
		   }
		   return result;
	       }
	
	


}
