package com.tcs.threaddemo;

public class Worker implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
