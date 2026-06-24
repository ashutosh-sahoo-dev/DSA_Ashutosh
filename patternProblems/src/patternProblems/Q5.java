package patternProblems;

public class Q5 {
	public static void Pattern3(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print( "*");//* means i is printed  And in reverse where i is printed j is decremented
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=5;
		Pattern3(n);


}
}

//note to get inverted  right angled pyramid keep the outer for loop i.e for rows same but innr for loop different