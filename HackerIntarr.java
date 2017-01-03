import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerIntarr {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int cnt = scan.nextInt();
        ArrayList<Integer> temp = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
        	temp.add(i,scan.nextInt());
        }
        for(int i=0;i<cnt;i++)
        {
        	int a=scan.nextInt();
        	int b=scan.nextInt();
        	int c=scan.nextInt();
        	 int [] arr = new int[c-b+1];
             
        	if(a==1)
        	{
        		int k=0;
        		for(int j=c-1;j>=b-1;j--)
        		{
        			
        			arr[k] = temp.remove(j);
        			k++;
        		}
        		for(int l=0;l<=c-b;l++)
        		{
        			temp.add(0,arr[l]);
        		}
        	}
        	else
        	{
        		int k=0;
        		int setind = b-1;
        		for(int j=b-1;j<=c-1;j++)
        		{
        			
        			arr[k] = temp.remove(setind);
        			k++;
        		}
        		int tmpcnt=n-(c-b);
        		for(int l=0;l<=c-b;l++)
        		{
        			temp.add(temp.size(),arr[l]);
        			tmpcnt++;
        		}
        	}
        }
        System.out.println(Math.abs(temp.get(0)-temp.get(temp.size()-1)));
        for(int i=0;i<n;i++)
        	System.out.print(temp.get(i)+" ");
        scan.close();
          }
}