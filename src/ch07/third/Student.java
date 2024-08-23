package ch07.third;

public class Student extends People{
	
	public int studentNo;
	
	public Student(String name, String sss, int studentNo, String aaa) {
		super(name,sss,aaa);
		
		this.studentNo=studentNo;
	}
	
	public Student(String name, String sss, String aaa) {
		super(name,sss,aaa);
	}	
	
	public Student() {
		
	}

	@Override
	void sayName() {
		// TODO Auto-generated method stub
		super.sayName();
	}
	
}
