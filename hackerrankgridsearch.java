import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankgridsearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int[][] mat1 = new int[R][C];
            for(int i=0;i<R;i++)
                {
                for(int j=0;j<C;j++)
                    {
                    mat1[i][j]=Character.getNumericValue(G[i].charAt(j));
                }
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            int[][] mat2 = new int[r][c];
            for(int i=0;i<r;i++)
                {
                for(int j=0;j<c;j++)
                    {
                    mat2[i][j]=Character.getNumericValue(P[i].charAt(j));
                }
            }
            int flag=0;
            for(int i=0;i<=R-r;i++)
                {
                for(int j=0;j<=C-c;j++)
                    {
                    flag=0;
                    for(int k=0;k<r;k++)
                        {
                        for(int l=0;l<c;l++)
                            {
                            if(mat1[i+k][j+l]!=mat2[k][l])
                                {
                                flag=1;
                                break;
                            }
                        }
                        if(flag==1)
                            break;
                    }
                     
                }
                
            }
            if(flag==1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
