package exp2;

public class FiboRecuesive {
	
		public static int Fibo(int n) {
			if (n<=1) 
				return n;
			while(n>1)
				return Fibo(n-1)+Fibo(n-2);//sum of last 2 terms
			return -1;
			
			
		}

		public static void main(String[] args) {
			System.out.println(Fibo(10));

		}

	}


	