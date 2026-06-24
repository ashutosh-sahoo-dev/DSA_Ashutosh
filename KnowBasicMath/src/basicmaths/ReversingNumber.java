package basicmaths;

import java.util.Scanner;

public class ReversingNumber {
	public static int reverse(int n) {
		int rev=0;
		while(n>0) {
		 rev=rev*10+n%10;
		 n/=10;//removing the last digit
		 
	}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to count it's digits : ");
		int n=sc.nextInt();
		System.out.println(reverse(n));

	}

}
