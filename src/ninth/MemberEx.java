package ninth;

public class MemberEx {

	public static void main(String[] args) {
		
		Member member=new Member();
		
		member.setName("jack");
		
		member.setAge(28);
		
		System.out.println("member name : "+member.getName());
		System.out.println("member age : "+member.getAge());
	}

}
//부모생성자가 먼저 생성됨 