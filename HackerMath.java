import java.util.Scanner;


public class HackerMath {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
            {
            int base = scan.nextInt();
            int power = scan.nextInt();
            int multiple = scan.nextInt();
            int flag=1;
            int res=0;
            int no=(int)Math.pow(base,power);
            int temp1=no;
            int temp2=no;
            while(flag==1)
                {
                if(power < 0)
                    {
                    //no = (int) (1 / (int)Math.pow(Math.abs(base),power));
                    res=0;
                    break;
                }
                else
                    {
                    if((++temp1) % multiple == 0)
                       {
                         res=temp1;
                        break;
                       }
                       else if((--temp2) % multiple == 0)
                           {
                           res=temp2;
                           break;
                       }
                }
            }
            System.out.println(res);
        }
    }

}
