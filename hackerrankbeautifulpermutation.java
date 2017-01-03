import java.util.Scanner;


public class hackerrankbeautifulpermutation {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	arr[i]=in.nextInt();
	    }
	 
	 int cnt=0;
	 for(int i=1;i<arr.length-1;i++)
	 {
		 if(arr[i] < arr[i-1] && arr[i] > arr[i+1])
			 cnt++;
	 }
	 
	 if(arr[0] > arr[1])
		 cnt++;
	 
	 if((arr[arr.length-1] < arr[arr.length-2]))
		 cnt++;
	 
	 System.out.println(cnt);
	 }
}
