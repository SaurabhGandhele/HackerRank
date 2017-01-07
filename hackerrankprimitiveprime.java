import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankprimitiveprime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        // your code goes here
        int small=0;
        int temp=0;
        int flag=0;
        TreeSet<Integer> ans = new TreeSet<Integer>();
        for(int i=2;i<=p-1;i++)
            {
            HashSet<Integer> check = new HashSet<Integer>();
            flag=0;
            for(int j=1;j<=p-2;j++)
                {
                temp = (int)Math.pow(i,j)%p;
                if(!check.contains(temp))
                    {
                    check.add(temp);
                    small=i;
                }
                else
                    {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                {
                ans.add(small);
            }
        }
        System.out.println(ans.first()+" "+ans.size());
    }
}
