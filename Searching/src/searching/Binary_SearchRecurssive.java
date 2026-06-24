package searching;
import java.util.*;
public class Binary_SearchRecurssive {
	public static int B_Seaarch( int sorted_arr[],int low,int high,int target) {
		
		if(low<=high) {
		int mid=low+(high-low)/2;//note the formula and brackets to avoid overflow case
		
			if(target==sorted_arr[mid]) {
				return mid;
			}
			else if(target>sorted_arr[mid]) {
				return B_Seaarch(sorted_arr,mid+1,high,target);
				}
			else  {
				return B_Seaarch(sorted_arr,low,mid-1,target);
			}
		
		}
			
		return -1;// Base case: Target not found
		
	}

	public static void main(String[] args) {
		int s_a[]=new int[100];//sorted array means either in assccending order or descending order
		for(int i=0;i<s_a.length;i++) {
			s_a[i]=i;
			
		}
		for(int i=0;i<s_a.length;i++) {
			
			System.out.print(s_a[i]+" ");
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter the element you want to find :");
		int target=sc.nextInt();
		int result = B_Seaarch(s_a, 0, s_a.length - 1, target);//low=0;&high=sorted_arr.length;
		if (result != -1) {
		    System.out.println("The element " + target + " found at index: " + result);
		} else {
		    System.out.println("The element " + target + " was not found in the array.");
		}
		sc.close();	
		}
		
		

	}




/*public class BinarySearchRecursive {

    public static int binarySearch(int[] arr, int low, int high, int target) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                return binarySearch(arr, mid + 1, high, target); // Search right half
            } else {
                return binarySearch(arr, low, mid - 1, target); // Search left half
            }
           }
     return -1; // Base case: Target not found
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearch(sortedArray, 0, sortedArray.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}*/
