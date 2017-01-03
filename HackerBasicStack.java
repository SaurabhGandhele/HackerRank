import java.util.Scanner;
import java.util.Stack;


public class HackerBasicStack {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Integer> stk = new Stack<Integer>();
        Stack<Integer> large = new Stack<Integer>();
        int res=0;
        large.push(0);
        for(int i=1;i<=n;i++)
            {
            int no = scan.nextInt();
            if(no==1)
                {
                int temp1=scan.nextInt();
                stk.push(temp1);
                if(temp1>=large.peek())
                	large.push(temp1);
                }
            
            else if(no==2)
                {
                if(stk.peek()==large.peek())
                	large.pop();
            	if(!stk.isEmpty())
                    stk.pop();
            }
            else
                {
                System.out.println(large.peek());
            }
        }
    }
}
