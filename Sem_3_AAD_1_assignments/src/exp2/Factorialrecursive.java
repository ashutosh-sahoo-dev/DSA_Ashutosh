package exp2;

public class Factorialrecursive {
	public static int Fact(int n) {
		if (n==0)
			return 1;
		while(n>-1)
			return n*Fact(n-1);
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(Fact(10));

	}

}
