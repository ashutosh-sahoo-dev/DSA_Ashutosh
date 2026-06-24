package reccursion;

class SumOfN {

    public static int sum(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        int result = sum(5);
        System.out.println(result);
    }
}

