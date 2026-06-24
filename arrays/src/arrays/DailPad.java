package arrays;

public class DailPad {

	public static void main(String[] args) {
		char[][] dailPad= {{'1','2','3'},
				          {'4','5','6'},
		               	  {'7','8','9'},
				          {'*','0','#'},
				          {    }  };
		for(char[] rows :dailPad) {//to display a 2d arrray 2 for loop is necessary
			for(char number :rows) {
				System.out.print(number+" ");
			}
			System.out.println();
		}
				
	}

}
