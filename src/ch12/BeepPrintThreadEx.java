package ch12;

import java.awt.Toolkit;

public class BeepPrintThreadEx {

	public static void main(String[] args) {
			
//		Thread thread=new Thread(new Runnable() {
//			
//			public void run() {
//				Toolkit toolkit= Toolkit.getDefaultToolkit();
//				for(int i=0; i<5; i++) {
//					toolkit.beep();
//					try { Thread.sleep(500);} catch(Exception e) {}
//				}
//			}
//		});
//		
//		thread.start();
		
		//방법2
		
		Runnable runnable = new BeepRunnable();
		Thread thread = new Thread(runnable);
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("dfjdhf");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
		for(int i=0; i<27; i++) {
			System.out.println("jtrjli");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}

}
