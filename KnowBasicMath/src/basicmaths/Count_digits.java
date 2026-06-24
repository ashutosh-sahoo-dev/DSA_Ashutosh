package basicmaths;
import java.util.*;
public class Count_digits {
	public static void count(int n) {
		int cnt =0;
		if(n==0) {
			cnt=1;
		}
		while (n>0){
			
			n/=10;// note division operagor to find digits.. and to find remaining digits use % operator
			cnt++;
			 
			
		}
		System.out.println(cnt);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to count it's digits : ");
		int n=sc.nextInt();
		count(n);

	}

}
