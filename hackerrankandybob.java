import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankandybob {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i = 0; i < n; i++){
            int m = in.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j=0;j<m;j++)
                {
                    arr.add(in.nextInt());      
                }
            int win=0;
               
                   int max=-1;
                    for(int l=0;l<arr.size();l++)
                    {
                        if( arr.get(i) > max)
                            {
                            max=arr.get(l);
                            win++;
                        }
                    }
            if(win%2==0)
                {
                System.out.println("BOB");
                }
            else
                {
                 System.out.println("ANDY");
            }
        }
    }
}
