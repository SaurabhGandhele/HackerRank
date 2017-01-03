import java.util.Scanner;


public class HackerMaxIndex {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n+1];
        for(int i=1;i<=n;i++)
            {
            a[i]=scan.nextInt();
        }
        int res=0,left=0,right=0;
        int j=0,k=0;
        for(int i=1;i<n;i++)
            {
            if(i==1)
                {
                res = 0;
            }
            else
                {
                for(j=i;j>0;j--)
                    {
                    if(a[j-1] > a[i])
                        {
                        left=j-1;
                        break;
                    }
                    else
                    	left=1;
                }
                for(k=i;k<n;k++)
                    {
                    if(a[k+1] > a[i])
                        {
                        right=k+1;
                        break;
                    }
                    else
                    	right=1;
                }
                if(left * right > res)
                	res = left * right;
                               	
                
            }
        }
        System.out.println(res);
    }

}
