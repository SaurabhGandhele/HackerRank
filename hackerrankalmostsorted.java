import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
public class hackerrankalmostsorted {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] origarr = new int[n+1];
        int dip=0,ups=0;
        int start=0,end=0;
        int flag=0;
        for(int i=1;i<=n;i++)
            {
            origarr[i]=scan.nextInt();
        }
        int[] sortarr =origarr.clone(); 
        Arrays.sort(sortarr);
        if(n==2)
            {
            System.out.println("yes");
            System.out.println("swap 1 2");
        }
            else
                {
        for(int i=2;i<n;i++)
            {
              if(origarr[i] > origarr[i-1] && origarr[i] > origarr[i+1] )
                  {
                  dip++;
                  start=i;
              }
                if(origarr[i] < origarr[i-1] && origarr[i] < origarr[i+1] )
                  {
                  ups++;
                    end=i;
              }
        }
        if(dip==1 && ups ==1 && (end-start) > 1)
            {
            System.out.println("yes");
            System.out.println("reverse "+start+" "+end);
        }
        else if(dip==1 && ups ==1 && (start) > 1 && (end-start)==1)
        {
        	System.out.println("yes");
            System.out.println("swap "+start+" "+end);
        }
        else if(dip==2 && ups ==2)
            {
            System.out.println("yes");
            System.out.println("swap "+start+" "+end);
        }
                else
                    {
                    System.out.println("no");
                }
            }
}
}