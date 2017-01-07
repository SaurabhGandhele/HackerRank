import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerranksqrt {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
            {
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int sqrt1 = (int)Math.sqrt(num1);
            int sqrt2 = (int)Math.sqrt(num2);
            System.out.println(sqrt2-sqrt1);
        }
    }
}