package reccursion;
import java.util.*;

public class print_somrthing_n_times {
	 public static void ntimes(String msg,int n) {
		 if (n<=0) {
			 return;//return; in a void method means “exit this method immediately”
//to stop the loop
//It does not return a value
//
//It returns control back to the caller
		 }
			
		 System.out.println(msg);
		 ntimes(msg,n-1);
		
		 
	 }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ntimes("Hello Ashu",n);
		
		sc.close();
		
	}
}
