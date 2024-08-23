package Second;

public class IphoneEx {

	public static void main(String[] args) {


		Iphone iphone= new Iphone();
		
		//System.out.println("iphone cpu: "+iphone.cpu);
		
		Iphone iphone2 = new Iphone(4);
		System.out.println("iphone cpu: "+iphone2.cpu);
		
		Iphone iphone3 = new Iphone(4,"12GB");
		System.out.println("iphone cpu: "+iphone3.cpu);
		System.out.println("iphone memory: "+iphone3.memory);
		
		Iphone iphone4 = new Iphone(4,"12GB","purple");
		System.out.println("iphone cpu: "+iphone4.cpu);
		System.out.println("iphone memory: "+iphone4.memory);
		System.out.println("iphone color: "+iphone4.color);
		
	}

}
