package hashing;


	import java.util.*;

	public class Q1 {

	    public static void main(String[] args) {

	        int arr[] = {23,4,57,82,95,13,113,224,72,18};

	        int table[] = new int[10];
	        int collisions = 0;

	        for(int i=0;i<10;i++)
	        table[i] = -1;

	        for(int num : arr)
	        {
	            int index = num % 10;

	            if(table[index] == -1)
	            {
	                table[index] = num;
	            }
	            else
	            {
	                collisions++;
	            }
	        }

	        System.out.println("Hash Table:");

	        for(int i=0;i<10;i++)
	        {
	            System.out.println(i + " -> " + table[i]);
	        }

	        System.out.println("Collisions = " + collisions);
	    }
	}