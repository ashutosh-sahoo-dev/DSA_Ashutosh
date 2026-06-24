package exp2;

public class SumOfNRecursive {
	public static int sum(int n) {
		if(n==0)
			return 0;
		while(n!=0)
		return n+sum(n-1);
		return 0;
		
		
	}

	public static void main(String[] args) {
		System.out.println(sum(50));

	}

}
