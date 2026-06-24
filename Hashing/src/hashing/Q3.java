package hashing;

public class Q3 {

    public static void main(String[] args) {

        int arr[] = {23,4,57,82,95,13,113,224,72,18};
        int table[] = new int[10];

        for(int i=0;i<10;i++)
            table[i] = -1;

        for(int num : arr)
        {
            int hash = num % 10;
            int index = -1;

            for(int i=0;i<10;i++)
            {
                index = (hash + i*i) % 10;

                if(table[index] == -1)
                {
                    table[index] = num;
                    break;
                }
            }
        }

        for(int i=0;i<10;i++)
        {
            System.out.println(i + " -> " + table[i]);
        }
    }
}