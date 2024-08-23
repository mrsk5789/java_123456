package Second;

public class CarEx {

	public static void main(String[] args) {
		
		Car car =new Car();
		
		//System.out.println("car engine:"+ car.engine);
		
		Car car2 =new Car("Black");
		
		System.out.println("car2.color:"+car2.color);
		
		Car car3=new Car(12,"로마","Red","페라리");
		System.out.println("car3.engine:"+car3.engine);
		System.out.println("car3.color:"+car3.color);
		System.out.println("car3.company:"+car3.company);
		
		Car car4=new Car(4,"그랜다이져","white","현대");
		System.out.println("car4.company:"+car4.engine);
		System.out.println("car4.company:"+car4.color);
		System.out.println("car4.company:"+car4.company);
		
		Car car5=new Car(12,"gts","yellow","porche");
		System.out.println("car5.name:"+car5.name);
		System.out.println("car5.color:"+car5.color);
		System.out.println("car5.company:"+car5.company);
		
		Car car6=new Car(16,"지바겐","black","mercedes-benZ");
		System.out.println("car6.name: "+car6.name);
		System.out.println("car6.company: "+car6.company);

	}

}
