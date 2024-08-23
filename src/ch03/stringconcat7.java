package ch03;

public class stringconcat7 {

	public static void main(String[] args) {
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String stringval="jdk";
		String stringval2="1.17";
		String stringval5="10";
		
		String stringval3=stringval+stringval2;
		System.out.println("stringval3:"+stringval3);
		System.out.println("우리가 사용하는 jdk 버전은"+stringval3);
		
		int a=1;
		
		String stringval4=stringval+a;
		System.out.println("stringval4:"+stringval4);
		
		String stringval6=stringval5+a;
		System.out.println("stringval6:"+stringval6);
		
		
		
		
		
		
		
	  int a8=10;
	  int b=20;
		
	  boolean result1=(a==b);
	  System.out.println("result1:"+result1);
	  boolean result2=(a>=b);
	  System.out.println("result2:"+result2);
	  boolean result3=(a<=b);
	  System.out.println("result3:"+result3);
		
		
		
		
		int score =92;
		
		if(score>=90) {
			System.out.println(score+"점은 A 입니다.");
		} else if(score>=80) {
			System.out.println(score+"점은 B 입니다.");
		} else if(score>=70) {
			System.out.println(score+"점은 C 입니다.");
		} else if(score>=60) {
			System.out.println(score+"점은 D 입니다.");
		} else{
			System.out.println(score+"점은 F 입니다.");
		}
		
		
		
		
		int score1= 43;
		
		if(score1<=100 && score1>90) {
			System.out.println(score1+"점은 A 입니다.");
		}  else if(score1<=90 && score1>80) {
			System.out.println(score1+"점은 B 입니다.");
		}  else if(score1>=80 && score1<70) {
			System.out.println(score1+"점은 C 입니다.");
		}  else if(score1>=70 && score1<60) {
			System.out.println(score1+"점은 D 입니다.");
		}  else{
			System.out.println(score1+"점은 F 입니다.");
		
		
	}
		
         int grade= 3;
         int cost=12000;
         double salesCost =0.0;
		
		if(grade==1) {
			System.out.println("정가가 "+cost+"원인"+" 일반등급의 할인가는:" + cost*0.95+"원 입니다.");
		}  else if(grade==2) {
			System.out.println("정가가 "+cost+"원인"+" 브론즈등급의 할인가는:"+ cost*0.9+"원 입니다.");
		}  else if(grade==3) {
			System.out.println("정가가 "+cost+"원인"+" 실버등급의 할인가는:"+ cost*0.85+"원 입니다.");
		}  else if(grade==4) {
			System.out.println("정가가 "+cost+"원인"+" 골드 등급의 할인가는:"+ cost*0.8+"원 입니다.");
		}  else{
			System.out.println("정가가 "+cost+"원인"+" 플래티넘 등급의 할인가는:"+ cost*0.75+"원 입니다.");
		
			if(grade == 1) {
				salesCost = cost * (1-0.05);
				System.out.println("정가가 " + cost + "원인 일반 등급의 할인가는: " + (int) salesCost + "원 입니다.");
			} else if(grade == 2) {
				salesCost = cost * (1-0.1);
				System.out.println("정가가 " + cost + "원인 브론즈 등급의 할인가는: " + (int) salesCost + "원 입니다.");
			} else if(grade == 3) {
				salesCost = cost * (1-0.15);
				System.out.println("정가가 " + cost + "원인 실버 등급의 할인가는: " + (int) salesCost + "원 입니다.");
			} else if(grade == 4) {
				salesCost = cost * (1-0.2);
				System.out.println("정가가 " + cost + "원인 골드 등급의 할인가는: " + (int) salesCost + "원 입니다.");
			} else if (grade == 5) {
				salesCost = cost * (1-0.027);
				System.out.println("정가가 " + cost + "원인 플래티넘 등급의 할인가는: " + (int) salesCost + "원 입니다.");
			} else {
				System.out.println("1~5 까지의 grade 만 가능합니다.");
			}










		
	}
}
}


		
		
		
		
		
		
		
		