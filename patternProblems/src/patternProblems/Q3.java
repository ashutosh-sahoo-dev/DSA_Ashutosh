package patternProblems;

public class Q3 {
	public static void Pattern3(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print( j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=5;
		Pattern3(n);

	}

}
//note print j where you have to increment like 12345 summing
/*print i for 1
              22
              333*/