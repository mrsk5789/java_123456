package enumeration;

public class random {

	public static void main(String[] args) {
		
		int min=1;
		int max=45;
		
		int random=(int)((Math.random()*(max-min))+min);
		System.out.println("random: "+random);
		
		int min = 1;
		int max = 12;
		
		int random = (int) ((Math.random() * (max - min)) + min);
		System.out.println("random: " + random);
		
		System.out.println( Math.random() ); // (0 ~ 1)
		System.out.println( Math.random() * max ); // (0 ~ 1) * max = 0*max ~ 1*max = 0~1*max   
		System.out.println( (Math.random() * max) + min ); // (0~1*max) + min = (0+min~1*max+min)
		System.out.println( (Math.random() * (max - min)) + min ); // (0+min~1*max+min-min)
		System.out.println( (int) (Math.random() * (max - min)) + min ); // casting

	}

}
