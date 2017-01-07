import java.util.Scanner;

public class hackerrankspacestation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        int res[] = new int[n];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        int temp=-1;
        if(n==m)
            {
            System.out.println("0");
            }
        else
            {
            
            for(int i=0;i<c.length;i++)
                {
                for(int j=0;j<c.length-1;j++)
                    {
                    if(Math.abs(c[i]-c[j+1]) > temp)
                        {
                        temp = Math.abs(c[i]-c[j+1]);
                    }
                }
            }
            int startValue = 0;
        int finalValue = n-1;
        int initDis = c[0] - startValue;
        int finalDis = finalValue - c[m-1];
        
        if(initDis > temp)
        	temp = initDis;
        if(finalDis > temp)
        	temp = finalDis;
       
        
        //System.out.println(temp);
        System.out.println((temp)/2);
    }
}
    
}
