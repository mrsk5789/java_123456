package ch04;

public class switch2 {

	public static void main(String[] args) {
		
		
		String position="차장";
		
		switch(position) {
			case "차장":{
				System.out.println(position+"연봉은 7,000 입니다.");
				break;
			}
			case "과장":{
				System.out.println(position+"연봉은 6,000 입니다.");
				break;
			}
			case "대리":{
				System.out.println(position+"연봉은 5,000 입니다.");
				break;
			}
			case "주임":{
				System.out.println(position+"연봉은 4,000 입니다.");
				break;
			}
			case "사원":{
				System.out.println(position+"연봉은 3,500 입니다.");
				break;
			}
		}
	}
}