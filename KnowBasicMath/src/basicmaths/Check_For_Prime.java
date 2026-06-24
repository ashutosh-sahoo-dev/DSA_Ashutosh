package basicmaths;

import java.util.Scanner;

public class Check_For_Prime {
	public static boolean Prime(int n) {
		if(n<=1) {
			return false;
		}
		else {
			for(int i=2;i<=Math.sqrt(n);i++) {
				if(n%i==0) {
					return false;
				}
			}


		}
		return true;
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number to check prime or not ");
	int a=sc.nextInt();
	System.out.println("The number "+a+" is a prime number : "+Prime(a));

}
}