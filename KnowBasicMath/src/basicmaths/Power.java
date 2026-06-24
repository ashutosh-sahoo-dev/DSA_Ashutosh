package basicmaths;

import java.util.Scanner;

public class Power {
	public static int pow(int base,int expo) {
		int res=1;
		if(expo==0) {
			return 1;
		}
		for(int i=1;i<=expo;i++) {
			 res=res*base;
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a base and a power  : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(x+" to the power "+y+" is "+pow(x,y));
	}}


