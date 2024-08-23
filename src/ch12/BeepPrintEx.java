package ch12;

import java.awt.Toolkit;

public class BeepPrintEx {

	public static void main(String[] args) {
		
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("10");
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				
				e.printStackTrace();
			}
		}


	}

}
