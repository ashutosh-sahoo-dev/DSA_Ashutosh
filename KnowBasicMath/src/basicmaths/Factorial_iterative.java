package basicmaths;

public class Factorial_iterative {
	public static int Fact(int n) {
		int f=1;
		while(n>0) {
			f*=n;
			n--;
		}
		return f;
	}

	public static void main(String[] args) {
		System.out.println("The Factorial of given no is "+Fact(5));
		

	}

}
