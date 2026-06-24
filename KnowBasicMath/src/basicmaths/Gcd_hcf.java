package basicmaths;

import java.util.Scanner;

public class Gcd_hcf {//Euclide's algorithm
	public static int Findgcd(int a,int b) {
		/*while (b!=0) {
			int temp=b;
			b=a%b;//stored in b becoz we divide a by b in a loop i.e a%b=remainder and remainder is always smaller than divisor so = a%b stores the remainder and we update a = temp i.e =b = divident
			a=temp;
			
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a and b to find gcd ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The gcd or hcf of  "+a+" and "+b+" is "+Findgcd(a,b));

	}

}*/

if (b==0) {//using recursion
	return a;
}else {
		return Findgcd(b,a%b);
	}
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a and b to find gcd ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The gcd or hcf of  "+a+" and "+b+" is "+Findgcd(a,b));
	}}

/*   _____DRY RUN _____
 * Inside findGCD(int a, int b)
 
Initial values:
a = 48 b = 18
🔄 1st iteration:
temp = b = 18 b = a % b = 48 % 18 = 12 a = temp = 18
Now: a = 18, b = 12
🔄 2nd iteration:
temp = b = 12 b = a % b = 18 % 12 = 6 a = temp = 12
Now: a = 12, b = 6
🔄 3rd iteration:
temp = b = 6 b = a % b = 12 % 6 = 0 a = temp = 6
Now: a = 6, b = 0
🔚 Loop ends (b == 0)
Return a = 6
✅ Final Output:
System.out.println("GCD of 48 and 18 is: " + result);
Output:
GCD of 48 and 18 is: 6*/



/*_____DRY RUN FOR RECURSION PROGRAM _____
 * Dry Run of findGCD(48, 18)
 

Step-by-step Recursive Calls:

🔹 Call 1: findGCD(48, 18)

b != 0 → Call findGCD(18, 48 % 18) → findGCD(18, 12)


🔹 Call 2: findGCD(18, 12)

b != 0 → Call findGCD(12, 18 % 12) → findGCD(12, 6)


🔹 Call 3: findGCD(12, 6)

b != 0 → Call findGCD(6, 12 % 6) → findGCD(6, 0)


🔹 Call 4: findGCD(6, 0)

b == 0 → Return a = 6*/