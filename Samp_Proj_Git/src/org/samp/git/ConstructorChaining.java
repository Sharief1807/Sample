package org.samp.git;

public class ConstructorChaining {

	ConstructorChaining() {
		this(5);
		System.out.println("first consructor");
	}

	ConstructorChaining(int i) {
		this("sachin");
		System.out.println("2nd consructor");
	}

	ConstructorChaining(String s) {
		System.out.println("3rd consructor");
	}

	public static void main(String[] args) {
		ConstructorChaining chain = new ConstructorChaining();
	}

}
