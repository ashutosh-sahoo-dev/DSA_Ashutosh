package exp1;
import java.util.*;
public class LinearSearchIterative {
	public static int Linear(int[] arr,int target) {
		int pos=-1;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==target)
				return pos=i;
			
		}
		return pos;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//class name alwways start with a capital  letters
		System.out.println("Enter size:");
		int num=sc.nextInt();
		int[] a=new int[num];
		System.out.println("Enter theh elements of the array :");
		for (int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		
		
		System.out.println("The elements are:");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("Enter the target :");
		int target=sc.nextInt();
		
			System.out.println("The Element found at index :"+Linear(a,target));
		
			
				
		}
		

	}


