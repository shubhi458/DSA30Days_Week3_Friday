// A Java program to print elements which are greater than 18

class AgeAbove18 {

    // Print array elements greater than 18
    static void printAbove18(int[] A)
    {
        for (int j : A)
            if (j > 18)
                System.out.print(j + ",");
    }

    // Driver program
    public static void main (String[] args)
    {
        int[] A = { 11, 23, 3, 45, 72, 68 };
        printAbove18(A);

    }
}
