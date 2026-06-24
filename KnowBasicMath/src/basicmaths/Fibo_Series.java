package basicmaths;

public class Fibo_Series {
	public static void Fibo_series(int n) {
		int a=0;
		int b=1;
		int c=0;
		/*for(int i=1;i<=n;i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;*/
		//or
		int count=0;
		while(count<n) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
			count++;
		}
		
	}

	public static void main(String[] args) {
		Fibo_series(8);

	}

}
