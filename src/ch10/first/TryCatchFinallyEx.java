package ch10.first;

public class TryCatchFinallyEx {

	public static void main(String[] args) {
		
		try {
			Class clazz=Class.forName("ExTry");
			System.out.println("dklfje");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
