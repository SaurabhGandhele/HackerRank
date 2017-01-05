import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankcutthesticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i]=in.nextInt();
        }
        int cnt=n;
        
        while(cnt>=1)
            {
                System.out.println(cnt);
                int min = findmin(arr);
                for(int k=0;k<n;k++)
                {
                    if(arr[k] - min == 0)
                        {
                        cnt--;
                        arr[k]=-1;
                    }
                    else if(arr[k] - min > 0)
                        arr[k]=arr[k] - min;
                        else
                        arr[k] = 9999;
                }
        }
    }
    
    public static int findmin(int[] arr)
        {
        int temp = 99999;
        for(int j=0;j<arr.length;j++)
            {
            if(arr[j] < temp && arr[j]>0)
                temp = arr[j];
        }
        return temp;
    }
}
