import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankbeautifultriplet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int div = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=scan.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n-2;i++)
            {
            for(int j=i+1;j<n-1;j++)
                {
                if(arr[j]-arr[i]==div)
                    {
                    for(int k = j+1;k<n;k++)
                        {
                        if(arr[k]-arr[j]==div)
                            {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}