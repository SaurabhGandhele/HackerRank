import java.util.Scanner;
import java.util.Stack;


public class HackerLargestRectArea {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Integer> area = new Stack<Integer>();
        Stack<Integer> index = new Stack<Integer>();
        area.push(scan.nextInt());
        index.push(1);
        for(int i=1;i<n;i++)
            {
        	int no = scan.nextInt();
        	
        	if(no>area.peek() )
        	{
        		area.push(no);
        		
        	}
        	else if(no<area.peek())
        	{
        		int temp = area.pop();
        		while(temp>no)
        		{
        			area.push(i*no);
        		}
        	}
        }
    }
}
