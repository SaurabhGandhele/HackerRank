import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hackerrankmatrixreplace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        int[][] matrix = new int[n][n];
        char[][] transmatrix = new char[n][n];
        for(int i=0; i < n; i++){
            grid[i] = in.next() + in.nextLine();
            String[] currentLine = grid[i].split("");
        for (int j = 0; j < currentLine.length; j++) {
            matrix[i][j] = Integer.parseInt(currentLine[j]);
            transmatrix[i][j] = currentLine[j].charAt(0);
        }
        }
        for(int i=1;i<n-1;i++)
            {
            for(int j=1;j<n-1;j++)
                {
                if(matrix[i][j] > matrix[i-1][j] && matrix[i][j] > matrix[i+1][j] && matrix[i][j] > matrix[i][j-1] && matrix[i][j] > matrix[i][j+1])
                 transmatrix[i][j]='X';   
            }
        }
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                System.out.print(transmatrix[i][j]);
            }
            System.out.println();
        }
    }
}
