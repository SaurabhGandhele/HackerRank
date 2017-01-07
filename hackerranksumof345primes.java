import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerranksumof345primes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            // your code goes here
            int cnt=0;
            if(n==0)
                {
                System.out.println("0");
            }
            else if(n==1)
                {
                System.out.println("9");
            }
            else if(n==2)
                {
                System.out.println("99");
            }
            else if(n==3)
                {
                System.out.println("999");
            }
            else if(n==4)
                {
                System.out.println("9999");
            }
            else if(n==5)
                {
                System.out.println("99999");
            }
            else
            {
            for(int i=(int) Math.pow(10,n-1);i<Math.pow(10,n);i++)
                {
                String s = Integer.toString(i);
                if(checkprime(s))
                    cnt++;
                }
                System.out.println(cnt);
            }
        }
    }
    
    public static boolean checkprime(String num)
        {
        char [] array = {'2','3','5','7'};
        HashSet<Integer> track = new HashSet<Integer>();
        for(int j=2;j<num.length();j=j+3)
            {
            if(!(num.charAt(j)=='2' || num.charAt(j)=='3' || num.charAt(j)=='5' || num.charAt(j)=='7') ||
            		track.contains(Character.getNumericValue(num.charAt(j))))
                return false;
            else
            {
            	track.add(Character.getNumericValue(num.charAt(j)));
            }
        }
        return true;
    }
}
