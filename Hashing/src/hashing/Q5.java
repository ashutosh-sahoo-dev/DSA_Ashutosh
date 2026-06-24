package hashing;
import java.util.HashSet;

public class Q5 {
	

	//public class Q5 {

	    public static void main(String[] args) {

	        // Create HashSet
	        HashSet<String> hs = new HashSet<>();

	        // Add elements
	        hs.add("India");
	        hs.add("USA");
	        hs.add("Brazil");

	        // Print HashSet
	        System.out.println(hs);

	        // Check element
	        System.out.println("Hash Table contains USA : " + hs.contains("USA"));

	        System.out.println("Hash Table contains UK : " + hs.contains("UK"));

	        // Remove element
	        hs.remove("USA");

	        System.out.println(hs);

	        System.out.println("Hash Table contains USA : " + hs.contains("USA"));
	    }
	}

