import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankceasercypher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        for(int i=0;i<s.length();i++)
            {
            if((s.charAt(i)+k<=123 && Character.isLetter(s.charAt(i))))
                s.replace(s.charAt(i),(char)(s.charAt(i)+k));
            else if(s.charAt(i)+k>123 && Character.isLetter(s.charAt(i)))
            	 s.replace(s.charAt(i),(char)(s.charAt(i)+k-26));
        }
        System.out.println(s);
    }
}
