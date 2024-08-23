package ch07.Second;

public class MusicPhone extends Phone{
	
	//필드
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
	public void down () {
		System.out.println("음악 다운받기");
	}
	public void play () {
		System.out.println("음악 재생하기");
	}
	
}
