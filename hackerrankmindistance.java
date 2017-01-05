import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;

public class hackerrankmindistance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int finalres[] = new int[n];
        Arrays.fill(finalres,99999);
        int temp=9999;
        for(int i=0;i<A.length;i++)
            {
            for(int j=i;j<A.length-1;j++)
                {
                if(A[i]==A[j+1] && temp > Math.abs(i - (j+1)))
                    {
                    finalres[i]=Math.abs(i - (j+1));
                    temp=Math.abs(i - (j+1));
                }
            }
        }
        int sol=0;
        Arrays.sort(finalres);
        for(int i=0;i<finalres.length;i++)
            {
            if(finalres[i]>0)
                {
                sol=finalres[i];
                break;
            }
        }
        System.out.println(sol);
    }
}
