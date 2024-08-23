package ch07.third;

public class People {
	
	public String name;
	public String sss;
	public String aaa;
	
	//부모에 생성자가 존재한다.
	
	public People(String name, String sss, String aaa) {
		this.name=name;
		this.sss=sss;
		this.aaa=aaa;
	}
	
	public People() {
		
	}
	void sayName() {
		System.out.println("people.name: "+name);
	}
	void say() {
		System.out.println("People.sss: "+sss);
	}

}
