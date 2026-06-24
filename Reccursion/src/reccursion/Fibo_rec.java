package reccursion;

public class Fibo_rec {
	public static int Fibo_r(int n) {
		if (n==1) {
			return 0;}
		else if (n==2) {
				return 1;
				
			
		}
		return Fibo_r(n-2)+ Fibo_r(n-1);
	}

	public static void main(String[] args) {
		System.out.println( Fibo_r(5));

	}

}
