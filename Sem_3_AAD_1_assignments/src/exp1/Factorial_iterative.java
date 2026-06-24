package exp1;

import java.util.*;

public class Factorial_iterative {
	public static int Fact(int n) {
		int f=1;
		for (int i=1;i<=n;i++) {
			f*=i;
		}
		return f;
	}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//class name alwways start with a capital  letters
		System.out.print("Enter a number:\t");
		int num=sc.nextInt();
		System.out.println("The Factorial  :\t"+Fact(num));	

	}

}
