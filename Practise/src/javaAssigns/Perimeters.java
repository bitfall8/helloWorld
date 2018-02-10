package javaAssigns;

public class Perimeters {
	static double pi=22d/7;
	static void Perimeters(int a) {
		System.out.println(2*pi*a);
		System.out.println("this is a circle");
	}
	static void Perimeters(int a, int b) {
		System.out.println(a*b);
		System.out.println("this is a rectangle");
	}
	static void Perimeters(int a, String str) {
		System.out.println(a*a);
		System.out.println("this is a square");
	}
}
