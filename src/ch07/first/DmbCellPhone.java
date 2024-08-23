package ch07.first;

public class DmbCellPhone extends Cellphone{
	//자식
	
	@Override
	void powerOn() {
		System.out.println("자식의 전원을 켭니다.");
		}
	
	//필드
	public int channel;
	
	
	//메소드
	void turnOnDmb() {
		System.out.println("체널"+channel+"번 DMB");
	}
	void ChangeChannelDmb(int channal) {
		this.channel=channel;
		System.out.println("체널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		this.channel=channel;
		System.out.println("방송 수신을 멈춥니다.");
	}
	void turnOffDmb(int a) {
		
	}

}
