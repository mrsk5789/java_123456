package ch07.first;

public class MobilePhoneEx {

	public static void main(String[] args) {
		
		
		

		Cellphone cellphone= new Cellphone();
		
		cellphone.powerOn();
		
		cellphone.sendVoice("dfd");
		
		cellphone.charging();
		
		
		
		
		
		
		
		DmbCellPhone dmbcellphone =new DmbCellPhone();
		
		dmbcellphone.turnOffDmb();
		
		dmbcellphone.turnOnDmb();
		
		dmbcellphone.powerOn();
		
		dmbcellphone.charging();
		
		
		
		
		
		
		
		Mobile mobile= new Mobile();
		mobile.powerOn();
		mobile.ChangeChannelDmb(1);
		mobile.aaa();
		mobile.bbb();
		mobile.ccc();
		mobile.sendVoice("yfgyu");
		mobile.charging();
		mobile.receiveVoice("j");
	}

}



//abstract 
//추상클래스=객체생성불가 car car=new car를 사용하지 못함
//실체클=객체직접 생성ㅇ
//public abstract class클래스명{}

//상속-부모 자식간의 연관성 있음
//추상-연관관계가 없음

//추상 메소드-강요하고 싶은 매서드가 있을경우 사용 
//public abstract 리턴형 함수이름();(내용없음)



