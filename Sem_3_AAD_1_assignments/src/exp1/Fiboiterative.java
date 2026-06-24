package exp1;
import java .util.*;
public class Fiboiterative {
	public static int Fibo(int n) {
		int a=0,b=1,c=0;
		for(int i=1;i<=n;i++) {
			System.out.println("THE FIBO SERIES :"+a);
			c=a+b;
			a=b;
			b=c;
			//return b; this is to print nth index fibo term
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//class name alwways start with a capital  letters
		System.out.println("Enter a index of the fibo term::");
		int num=sc.nextInt();
		System.out.println("Nth fibonaccie term :"+Fibo(num));	
		
		
	}

}
