package ch04;

public class if3 {

	public static void main(String[] args) {
		
		int a= -7;
		if(a%2==1) {
			System.out.println("홀수");		
	    } else if(a%2==0) {
			System.out.println("짝수");
	    } else if(a%2==-1) {
	    	System.out.println("홀수");
	    }


		int b=8;
		int c=7;
		
		if(b>0 && c>0) {
			System.out.println("("+b+","+c+")"+"는 1사분면에 위치합니다.");
		} else if(b<0 && c>0) {
			System.out.println("("+b+","+c+")"+"는 2사분면에 위치합니다.");
		} else if(b<0 && c<0) {
			System.out.println("("+b+","+c+")"+"는 3사분면에 위치합니다.");
		} else if(b>0 && c<0) {
			System.out.println("("+b+","+c+")"+"는 4사분면에 위치합니다.");
		}
		
		//int a = -2;
		//int b = 0;
		
		if(a>0 && b>0) {
			System.out.println("(a,b)는 1사분면에 위치합니다");
		} else if(a<0 && b>0) {
			System.out.println("(a,b)는 2사분면에 위치합니다");
		} else if(a<0 && b<0) {
			System.out.println("(a,b)는 3사분면에 위치합니다");
		} else if(a>0 && b<0) {
			System.out.println("(a,b)는 4사분면에 위치합니다");
		} else if(a==0 && b!= 0) {
			System.out.println("(a,b)는 x축 위에 있습니다");
		} else if(a!=0 && b== 0) {
			System.out.println("(a,b)는 y축 위에 있습니다");
		} else {
			// a==0 & b==0
			System.out.println("(a,b)는 원점입니다.");
		}
		
		
		int a1=3;
		int b1=5;
		int c1=8;
		
		if(a1>b1 && a1>c1) {
			System.out.println("최대값:"+a1);
		}else if(b1>a1 && b1>c1) {
			System.out.println("최대값:"+b1);
		}else if(c1>a1 && c1>b1) {
			System.out.println("최대값:"+c1);
		}
		
		if(a1<b1 && a1<c1) {
			System.out.println("최소값:"+a1);
		}else if(b1<a1 && b1<c1) {
			System.out.println("최소값:"+b1);
		}else if(c1<a1 && c1<b1) {
			System.out.println("최소값:"+c1);
		} else {
			System.out.println("적어도 2개의 동일한 정수가 존재 합니다. 수정해 주세요");
		}
}
}