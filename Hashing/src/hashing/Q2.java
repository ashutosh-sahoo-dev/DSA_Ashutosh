package hashing;

public class Q2 {
	

	    public static void main(String[] args) {

	        int arr[] = {23,4,57,82,95,13,113,224,72,18};
	        int table[] = new int[10];

	        for(int i=0;i<10;i++)
	            table[i] = -1;

	        for(int num : arr)
	        {
	            int index = num % 10;

	            while(table[index] != -1)
	            {
	                index = (index + 1) % 10;
	            }

	            table[index] = num;
	        }

	        for(int i=0;i<10;i++)
	        {
	            System.out.println(i + " -> " + table[i]);
	        }
	    }
	}
