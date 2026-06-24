package exp1;

public class BinaryIterative {
	public static int Binary(int arr[],int target) {
		int low=0, high=arr.length-1;
		
		
		while (low<=high) {
			int mid=low+(high-low)/2;//it gives the position of the mid
			if(arr[mid]==target)//here it gives the mid elenmet
				return mid;
			else if(target>arr[mid])//checking right half
				low=mid+1;//updating low
			else
				 high =mid-1;//vice versa
		}
		return -1;
	}

public static void main(String[] args) {
		int a[]= {1,2,5,8,9,20,54,59};
		int result=Binary(a,54);
		if(result!=-1)
			System.out.println("The element found at index "+result);
		else
			System.out.println("Not found");

	}

}
