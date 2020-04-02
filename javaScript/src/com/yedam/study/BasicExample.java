package com.yedam.study;

import java.awt.Toolkit;

class RunnableCls implements Runnable {

	@Override
	public void run() {
		Toolkit tkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			tkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class BasicExample {

	public static void main(String[] args) {
//		Runnable rcs = new Runnable() {
//			@Override
//			public void run() {
//				Toolkit tkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 10; i++) {
//					tkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		};
	
	  //RunnableCls rcs = new RunnableCls();//신규작업 인스턴스
//		Thread thread = new Thread(); //쓰레드 생성
//		thread.start(); //신규작업 시작 
		
		for (int i = 0; i < 10; i++) {
			System.out.println("print it.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Thread thread = new Thread(() -> {
			Toolkit tkit = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 10; i++) {
				tkit.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
	}

}
