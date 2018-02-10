package javaAssigns;

public class Areas {
	static double pi=22d/7;
	static void Areas(int a) {
		System.out.println("this is a circle "+pi*a*a);
	}
	static void Areas(int a, int b) {
		System.out.println("this is a rectangle area "+a*b);
	}
	static void Areas(int a, String str) {
		System.out.println("this is a square "+a*a);
	}
}
