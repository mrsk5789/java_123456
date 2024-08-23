package ch07.Second;

public class MobilePhone extends Phone{
	
	public void call () {
		System.out.println("전화걸기.");
	}
	public void receive () {
		System.out.println("전화받기");
	}
	public void connect () {
		System.out.println("무선 기지국 연결");
	}
	public void charging () {
		System.out.println("베터리 충전");
	}
	
	
	
	//void receiveVoice(String message) {System.out.println("벨이 울립니다.");}
	
	//void hangUp() {System.out.println("전화를 끊습니다.");}
	
	//void powerOn(int a) {System.out.println("전원을 켭니다.2");}
	

}
