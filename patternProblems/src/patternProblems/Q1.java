package patternProblems;
import java.util.*;
public class Q1 {

	public static void Pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
				
			}
			System.out.println();//outer loop re space print to move to the next line 
			
		}}
		public static void main(String[] args) {
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter the no of rows and columns to print :");
			int n= sc.nextInt();
	
			Pattern1(n);
			
	}

}
