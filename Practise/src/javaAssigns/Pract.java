package javaAssigns;

import java.util.Scanner;


public class Pract {

	public static void main(String[] args) {
//		System.out.println("Hai "+args[0]+" "+ args[1]);
/*		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int res1=0;
		switch(args[2]) {
		case "+" : res1=a+b;
					System.out.println(args[0]+"+"+args[1]+"="+res1);
					break;
		case "%" :  res1=a%b;
					System.out.println(args[0]+"%"+args[1]+"="+res1);
					break;
		case "*" :  res1=a*b;
					System.out.println(args[0]+"*"+args[1]+"="+res1);
					break;
		default: System.out.println("please enter a valid arthematic operator");
		
		}
		//what is this?
		jan feb march april may jun july aug sept oct nov dec
		31 28 31 30 31 30 31 31 30 31 30 31
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;

		if(a==1 | a==3 | a==5 | a==7 | a==8 | a==10 | a==12) {
			System.out.println(31);
		}
		else if(a==2) {
			System.out.println(28);
		}
		else {
			System.out.println(30);
		}
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int temp,rev=0;
		while(a!=0) {
			temp=a%10;
			rev=rev*10+temp;
			a=a/10;
		}
		System.out.println(rev);
*/
		Scanner sc=new Scanner(System.in);
		int a;
//		b=sc.nextInt();
//		c=sc.nextInt();
/*
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	*/
		for(int i=0;i<3;i++) {
			a=sc.nextInt();
			if(a%10<5) {
				a=a-(a%10);
				System.out.println(a);
			}
			else {
				a=a+(10-(a%10));
				System.out.println(a);
			}
		}
	}
}
