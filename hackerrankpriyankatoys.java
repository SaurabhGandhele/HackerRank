import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankpriyankatoys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
            {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int cnt=1;
        int i=0;
        for(int j=1;j<n-1;j++)
            {
            while(arr[i] + 4 >= arr[j] )
            
                j++;
                i=j;
            if(i<n)
                cnt++;
            
            }
            
        
        System.out.println(cnt);
    }
}