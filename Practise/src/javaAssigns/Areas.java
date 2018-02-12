package javaAssigns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Areas {
	static double pi=22d/7;
	static InputStreamReader s=new InputStreamReader(System.in);
	static BufferedReader br=new BufferedReader(s);
	static void circle(){
		int a;
		System.out.println("enter the value of the radius");
		a=Integer.parseInt(br.read());
		System.out.println(a);
		System.out.println("this is a circle "+pi*a*a);
	}
	static void rectangle(){
		int c,b;
		System.out.println("enter the length and breadth of the rectangle");
		c=br.read();
		b=br.read();
		System.out.println(c);
		System.out.println(b);
		System.out.println("this is a rectangle area "+c*b);
	}
	static void square(){
		int d;
		System.out.println("enter the value of the square");
		d=br.read();
		System.out.println(d);
		System.out.println("this is a square "+d*d);
	}
}
