package searching;
import java.util.*;

public class Linear_Search {
	public static int LinearSearch(int arr[],int value) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {1 ,2 ,3 ,6 ,20 ,55 ,87 ,7 ,63 };
		System.out.print("The elements are :");
		for(int i=0;i<arr.length;i++) {
		
		System.out.print(arr[i]+" ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the element you want to find :");
		
		int value =sc.nextInt();
		int result=LinearSearch(arr,value);
		if (result==-1) {
			System.out.println("SORRY (The element is not present!!)");
			
		}
		else {
			System.out.println("The element is present at index :"+result);
		}
		}
		
		
		

	}

	
	
