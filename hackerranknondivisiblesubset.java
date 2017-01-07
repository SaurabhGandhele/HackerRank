import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerranknondivisiblesubset {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        for(int i=0;i<n;i++)
	        {
	            String temp = scan.next()+scan.nextLine();
	            if(temp.length()%2!=0)
	                {
	                System.out.println("-1");
	            }
	            else
	                {
	                int part = temp.length();
	                int count=0;
	                String s1 = temp.substring(0,part/2);
	                String s2 = temp.substring(part/2,part);
	                int[] tk1 = new int[26];
	                int[] tk2 = new int[26];
	                for(int j=0;j<s1.length();j++)
	                    {
	                    tk1[s1.charAt(j)-97]++;
	                    tk2[s2.charAt(j)-97]++;
	                }
	               for(i=0;i<26;i++)
	                {

	                if(tk1[i]>tk2[i]&&tk1[i]!=0)
	                count+=Math.abs(tk1[i]-tk2[i]);
	                }
	                System.out.println(count);
	            }
	        }
	    }

}