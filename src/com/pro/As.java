package com.pro;

public class As implements Runnable {

	@Override
	public void run() {

		System.out.println("RUn method call");
	}

	public static void main(String[] args) {
		As as = new As();
		as.run();
	}

}
