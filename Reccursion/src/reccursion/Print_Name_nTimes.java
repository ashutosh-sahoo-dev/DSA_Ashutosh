package reccursion;

public class Print_Name_nTimes {

	
	    static void printName(int n, String name) {
	        // Base case
	        if (n == 0) {
	            return;
	        }

	        // Print the name
	        System.out.println(name);

	        // Recursive call
	        printName(n - 1, name);
	    }

	    public static void main(String[] args) {
	        printName(5, "Ashu");
	    }
	}

//def print_name(n, name):
//# Base case
//if n == 0:
//    return
//
//# Print the name
//print(name)
//
//# Recursive call
//print_name(n - 1, name)
//
//
//# Example usage
//print_name(5, "Ashu")
