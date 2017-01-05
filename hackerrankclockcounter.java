import java.util.Scanner;


public class hackerrankclockcounter {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        System.out.println(recurfunc(t));
	        }
	    
	public static int recurfunc(int t)
	    {
	    int[] res=new int[10000];
	    int ans=0;
	    int temp=1;
	    for(int i=1;i<=t;i++)
	     {
	    if(i==1){
	        res[i]= 3;
	        ans=3;
	    }
	    else if(i==2)
	    {
	        res[i]=2;
	        ans=2;
	    }
	    else if(i==3)
	    {
	        res[i]=1;
	        ans=1;
	    }
	    else
	    {
	        if(res[i-1]==1)
	        {
	        	int max=(int)Math.pow(2,temp)*3;
	        	res[i]=max; 
	        	temp++;
	        	ans=res[i];
	        }
	        else
	        {
	        	res[i]=res[i-1]-1;
	        	ans=res[i];
	        }
	    }  
	    }
	     return ans;
	}
	
	
}
