package ch06.first;

public class Suv {
	
	int engine=16;
	String name="x7";
	String color="검은색";
	String company="bmw";
	
	
	void go() {
		System.out.println("앞으로 갑니다.");
	}
	
	void back() {
		System.out.println("뒤로 갑니다.");
	}
	
	public int result1(int a, int b) {
		int result = a+b;
		System.out.println("a+b="+result);
		 return result;
	}	 
		 
		 
		 
    public String aaaa (String position){
			 
    	String a="";
		
	    System.out.println(position);    
	    
	    switch(position) {
			case "차장":
				System.out.println(position);
				a="연봉은 7,000 입니다.";
				break;
			
			case "과장":
				System.out.println(position);
				a="연봉은 6,000 입니다.";
				break;
				
			case "대리":
				System.out.println(position);
				a="연봉은 5,000 입니다.";
				break;				
			
			case "사원":
				System.out.println(position);
				a="연봉은 4,000 입니다.";
				break;	
				
			case "인턴":
				System.out.println(position);
				a="연봉은 3,000 입니다.";
				break;	
		}
	       return a;
	}
    		
}
