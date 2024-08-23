package ch13.third;

public class BoxEx {

	public static void main(String[] args) {
		
//		Box box =new Box();
//		
//		box.setA("djfe");
//		box.setA(11);
		
		Box<String> box=new Box<>();
		box.setT("fyigu");
		System.out.println(box.getT());
		
		System.out.println("------------------");
		
		Box<Integer>box2=new Box<>();
		box2.setT(10);
		System.out.println(box.getT());

	}

}
