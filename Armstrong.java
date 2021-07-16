package pavi.day1;

import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[]Args) {
		Scanner obj=new Scanner(System.in);
			
		int a = obj.nextInt();
		int b=a/100;
		int c= a%100;
		int d=c/10;
		int e=c%10;
		
		if (a==(b*b*b)+(d*d*d)+(e*e*e)) {
			System.out.println("This is an armstrong number");
		}
		
		else { 
			System.out.println("This is not an armstrong number");
		}
	}
	

}
