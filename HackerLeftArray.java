import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class HackerLeftArray {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int flag=0;
        for(int a0 = 0; a0 < t; a0++){
        	flag=0;
        	Stack<Character> stk = new Stack<Character>();
            Stack<Character> track = new Stack<Character>();
            
            String s = in.next()+in.nextLine();
            
            for(int i=0;i<s.length();i++)
            {
            	if(s.charAt(i)=='{') 
            	{
            		stk.push(s.charAt(i));
            		track.push('a');
            	}
            	else if(s.charAt(i)=='[')
            	{
            		stk.push(s.charAt(i));
            		track.push('b');
            	}
            	else if(s.charAt(i)=='(')
            	{
            		stk.push(s.charAt(i));
            		track.push('c');
            	}
            	else if(s.charAt(i)==')') 
            	{
            		if(stk.isEmpty())
            		{
            			flag=1;
            			break;
            		}
            		stk.pop();
            		if(track.pop()!='c')
            		{
            		flag=1;
            		break;
            		}
            	}
            	else if(s.charAt(i)==']')
            	{
            		if(stk.isEmpty())
            		{
            			flag=1;
            			break;
            		}
            		stk.pop();
            		if(track.pop()!='b')
            		{
                		flag=1;
                		break;
                	}
            	}
            	else if(s.charAt(i)=='}')
            	{
            		if(stk.isEmpty())
            		{
            			flag=1;
            			break;
            		}
            		stk.pop();
            		if(track.pop()!='a')
            		{
                		flag=1;
                		break;
                	}
            	}
        }
            if(flag==1 || !stk.empty() || !track.empty())
            {
            	System.out.println("NO");
            }
            else
            {
            	System.out.println("YES");
            }
        }
       
        
    }
}
