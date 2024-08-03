import java.util.Scanner;

class PrintNumbers {
    // Prints numbers from 1 to n
    static void printNos(int n)
    {
        if (n > 0) {
            printNos(n - 1);
            System.out.print(n + ",");
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        printNos(n);
    }
}