package hashing;
import java.util.*;

public class Q4 {
	

	//public class SeparateChaining {

	    public static void main(String[] args) {

	        int arr[] = {23,4,57,82,95,13,113,224,72,18};

	        LinkedList<Integer> table[] = new LinkedList[10];

	        for(int i=0;i<10;i++)
	        {
	            table[i] = new LinkedList<>();
	        }

	        for(int num : arr)
	        {
	            int index = num % 10;

	            table[index].add(num);
	        }

	        for(int i=0;i<10;i++)
	        {
	            System.out.print(i + " -> ");

	            for(int val : table[i])
	                System.out.print(val + " ");

	            System.out.println();
	        }
	    }
	}


