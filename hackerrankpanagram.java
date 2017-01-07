import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankpanagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] alpha = new int[26];
        int cnt=0;
        for(int i=0;i<26;i++)
            {
            alpha[i] = -1;
            
        }
        int flag=0;
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        st = st.replaceAll("\\s+","");
        String s=st.toLowerCase();
        for(int i=0;i<s.length();i++)
            {
            if(s.charAt(i)!=' ')
                {
                alpha[s.charAt(i)-97]=0;
            }
        }
        for(int i=0;i<26;i++)
            {
            if(alpha[i] == -1)
                {
                flag=1;
                break;
            }
            
        }
        if(flag==1)
            {
            System.out.println("not pangram");
        }
        else
            {
            System.out.println("pangram");
        }
    }
}