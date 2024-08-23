package ch06.first;

public class SuvEx {

	public static void main(String[] args) {
		
		Suv suv=new Suv();
		
		System.out.println("Suv.engine : "+suv.engine);
		System.out.println("Suv.name : "+suv.name);
		System.out.println("Suv.company : "+suv.company);
		
		
		
		suv.go();
		suv.back();
		int result = suv.result1(21, 2);
		System.out.println(result);
		String a=suv.aaaa("차장");
		System.out.println(a);
	}

	
		
}
