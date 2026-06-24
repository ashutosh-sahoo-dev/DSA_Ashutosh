package basicmaths;

import java.util.Scanner;

public class Print_All_Divisors {
	public static void Finding_Divisors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+"\n");
			
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to find all it's divisors : ");
		int a=sc.nextInt();
		 Finding_Divisors(a);
	}}


