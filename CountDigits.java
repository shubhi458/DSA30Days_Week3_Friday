// Log based Java program to count number of digits in a number
import java.util.Scanner;
public class CountDigits {

    static int countDigit(long n)
    {
        if (n == 0)
            return 1;
        return (int)Math.floor(Math.log10(n) + 1);
    }

    /* Driver code */
    public static void main(String[] args)
    {
        long n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        System.out.print("Number of digits : "
                + countDigit(n));
    }
}
