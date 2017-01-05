import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankdpmaxsumarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0;i<n;i++)
            {
            int m = scan.nextInt();
            int [] arr = new int[m];
            for(int j=0;j<m;j++)
                {
                arr[j] = scan.nextInt();
                }
            int[] sum1 = new int[m];
            int[] sum2 = new int[m];
            sum1[0]=arr[0];
            sum2[0]=arr[0];
            for(int j=1;j<m;j++)
                {
                if(arr[j]>arr[j-1] )
                    sum1[j] = sum1[j-1] + arr[j];
                else
                    sum1[j] = sum1[j-1];
                }
            for(int j=1;j<m;j++)
                {
                if(arr[j]+arr[j-1] > sum2[j])
                  sum2[j] = sum1[j-1] + arr[j];  
                else
                  sum2[j] = sum2[j-1];  
                }
            System.out.println(sum1[m-1]+" "+sum2[m-1]);
        }
    }
}