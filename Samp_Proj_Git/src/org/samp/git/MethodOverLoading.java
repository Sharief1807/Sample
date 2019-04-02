package org.samp.git;

public class MethodOverLoading {

	public void sha() {
		System.out.println("zero parameterized method");

	}

	public void sha(String str) {
		System.out.println("string parameterized method");

	}

	public void sha(int i) {
		System.out.println("integer parameterized method");

	}

	public static void main(String[] args) {
		MethodOverLoading m1 = new MethodOverLoading();
		m1.sha();
		m1.sha(56);
		m1.sha("sachin");
	}

}
