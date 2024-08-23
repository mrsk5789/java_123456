package ch03;

public class for3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) {
			if(2<=i|| i<=4) {
				System.out.print(" ");
			}
			for(int j=1; j<=10; j++) {
				if(2<=j||9>=j) {
					System.out.print(" ");
			}
				System.out.print("*");
          		
		}
			  System.out.println();	
		}

		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}else {
					System.out.print("*");
				}
			}
			 System.out.println();
		}
		for(int i=1; i<=10; i++) {
			if(i==10) {
				for(int j=1; j<i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					}else {
						System.out.print(" ");
					}
				}
			
		}
			
		}
	}
}



