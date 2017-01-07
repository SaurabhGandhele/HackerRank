import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankstringencryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int row = (int) Math.floor(Math.sqrt(s.length()));
        int col = (int) Math.ceil(Math.sqrt(s.length()));
        int mul = row * col;
        while(mul<s.length())
        {
        	if(row<col)
        		row++;
        	else if(row>col)
        		col++;
        	mul=row*col;
        	
        }
        char[][] arr = new char[row][col];
        int cnt=0;
        for(int i=0;i<row;i++)
            {
            for(int j=0;j<col;j++)
                {
                if(cnt < s.length())
                {
                arr[i][j]=s.charAt(cnt);
                cnt++;
                }
                else
                {
                	arr[i][j]='!';
                }
            }
        }
        for(int i=0;i<col;i++)
            {
            for(int j=0;j<row;j++)
                {
                if(i+j <= s.length() && arr[j][i]!='!')
                  System.out.print(arr[j][i]);  
            }
            System.out.print(" ");
        }
    }
}
