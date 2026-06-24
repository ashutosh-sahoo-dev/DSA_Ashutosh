package basicmaths;

import java.util.Scanner;

public class CheckPalindrome {
	public static boolean isPalindrome(String str) {
	
		/*int start=0;
		int end=str.length()-1;
		while(start < end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
			
		}
	
return true;	*/
		
		
		String revstr=new StringBuilder(str).reverse().toString();//buidin method
	
			return str.equals(revstr);
			}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		System.out.println("The "+s+" you entered is palindrome "+"\n"+isPalindrome(s));

	}

}
