package patternProblems;

public class Q7 {
	public static void Pattern7(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {//for rows
				System.out.print(" ");//for space
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
				
			}
			System.out.println();//in outer loop
		}//close outer loop
		}// close method
		public static void main(String[] args) {
			int n=50;
			Pattern7(n);

	}

}//close class
